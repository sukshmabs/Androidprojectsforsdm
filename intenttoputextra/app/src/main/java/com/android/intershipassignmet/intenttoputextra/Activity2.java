package com.android.intershipassignmet.intenttoputextra;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    Button btn1;
    TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        text2 = (TextView)findViewById(R.id.textView);

        String msg = getIntent().getExtras().getString("flag");
        text2.setText(msg);

    }
}