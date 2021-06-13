package com.android.intershipassignmet.buttontotext;





import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        txt=(TextView)findViewById(R.id.txt);
    }

    public void Red(View view) {
        TextView txt=(TextView)findViewById(R.id.txt);
        txt.setTextColor(Color.parseColor("#FF0000"));
    }

    public void Green(View view) {
        TextView txt=(TextView)findViewById(R.id.txt);
        txt.setTextColor(Color.parseColor("#07F410"));
    }
}