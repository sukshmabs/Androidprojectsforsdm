package com.android.intershipassignmet.checkbox;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox Pun, Del, Mum, Bang;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pun = findViewById(R.id.myPun);
        Mum = findViewById(R.id.mymum);
        Del = findViewById(R.id.myDel);
        Bang = findViewById(R.id.myBang);
        text = findViewById(R.id.text);

        Button showbtn = findViewById(R.id.showBtn);
        showbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Res = "Favourite cities";
                if (Pun.isChecked()) {
                    Res += "\n Pune";
                }
                if (Mum.isChecked()) {
                    Res += "\n Mumbai";
                }
                if (Del.isChecked()) {
                    Res += "\n Delhi";
                }
                if (Bang.isChecked()) {
                    Res += "\n Bangalore";
                }

                Toast.makeText(getApplicationContext(), Res, Toast.LENGTH_LONG).show();
                text.setText(Res);
            }

        });

    }

    public void onCheckboxClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();
        String msg = "";
        switch (view.getId()) {
            case R.id.myPun:
                msg = checked ? "Pune Selected" : "Pune Deselected";
                break;
            case R.id.mymum:
                msg = checked ? "Mumbai Selected" : "Mumbai Deselected";
                break;
            case R.id.myDel:
                msg = checked ? "Delhi Selected" : "Delhi Deselected";
                break;
            case R.id.myBang:
                msg = checked ? "Bangalore Selected" : "Bangalore Deselected";


        }
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }
}