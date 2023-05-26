package com.example.simplecalculatorbychandanjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3;
    EditText ed1,ed2,ed3;
    Button btn1,btn2,btn3,btn4;

    Double n1,n2,n3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.txt1);
        t2=findViewById(R.id.txt2);
        t3=findViewById(R.id.txt3);
        
        
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        ed3=findViewById(R.id.ed3);
        
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        
        
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble(ed1.getText().toString());
                n2= Double.parseDouble(ed2.getText().toString());
                n3=n1+n2;
                ed3.setText(String.valueOf(n3));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1=Double.parseDouble(ed1.getText().toString());
                n2= Double.parseDouble(ed2.getText().toString());
                n3=n1-n2;
                ed3.setText(String.valueOf(n3));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1=Double.parseDouble(ed1.getText().toString());
                n2= Double.parseDouble(ed2.getText().toString());
                n3=n1*n2;
                ed3.setText(String.valueOf(n3));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1=Double.parseDouble(ed1.getText().toString());
                n2= Double.parseDouble(ed2.getText().toString());
                n3=n1/n2;
                ed3.setText(String.valueOf(n3));
            }
        });
    }
}