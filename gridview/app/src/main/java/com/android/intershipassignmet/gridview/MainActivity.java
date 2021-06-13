package com.android.intershipassignmet.gridview;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String[] fruits ={"apple","orange","lemon","banana","kivi","mango"};
    int[] fruitsImages ={ R.drawable.apple,R.drawable.orange,R.drawable.lemon,R.drawable.banana,R.drawable.kivi,R.drawable.mango};
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gridview);
        CustomAdapter customAdapter=new CustomAdapter();


        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent=new Intent(getApplicationContext(),GriditemActivity.class);
            intent.putExtra("name",fruits[i]);
            intent.putExtra("image",fruitsImages[i]);
            startActivity(intent);
        });
    }

    private class CustomAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return fruits.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view1 = getLayoutInflater().inflate(R.layout.row_date, null);
            TextView name = view1.findViewById(R.id.fruits);
            ImageView images = view1.findViewById(R.id.images);
            name.setText(fruits[i]);
            images.setImageResource(fruitsImages[i]);
            return view1;
        }}}
