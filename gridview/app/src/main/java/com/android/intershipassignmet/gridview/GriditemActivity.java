package com.android.intershipassignmet.gridview;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GriditemActivity extends AppCompatActivity {
    TextView name;
    ImageView image;
    private int defaultValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_griditem);
        name =findViewById(R.id.griddate);
        image=findViewById(R.id.imageView);

        Intent intent=getIntent();
        name.setText(intent.getStringExtra("name"));
        image.setImageResource(intent.getIntExtra("image", 0));

    }
}
