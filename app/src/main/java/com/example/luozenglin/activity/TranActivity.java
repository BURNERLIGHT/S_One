package com.example.luozenglin.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class TranActivity extends AppCompatActivity {

    EditText tv00;
    Button tv01;
    TextView tv02;

    EditText tv10;
    Button tv11;
    TextView tv12;

    EditText tv20;
    Button tv21;
    TextView tv22;

    EditText tv30;
    Button tv31;
    TextView tv32;


    EditText tv40;
    Button tv41;
    TextView tv42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tran);

        tv00 = (EditText) findViewById(R.id.tv00);
        tv01 = (Button) findViewById(R.id.tv01);
        tv02 = (TextView) findViewById(R.id.tv02);

        tv10 = (EditText) findViewById(R.id.tv10);
        tv11 = (Button) findViewById(R.id.tv11);
        tv12 = (TextView) findViewById(R.id.tv12);

        tv20 = (EditText) findViewById(R.id.tv20);
        tv21 = (Button) findViewById(R.id.tv21);
        tv22 = (TextView) findViewById(R.id.tv22);

        tv30 = (EditText) findViewById(R.id.tv30);
        tv31 = (Button) findViewById(R.id.tv31);
        tv32 = (TextView) findViewById(R.id.tv32);


        tv40 = (EditText) findViewById(R.id.tv40);
        tv41 = (Button) findViewById(R.id.tv41);
        tv42 = (TextView) findViewById(R.id.tv42);

        //1
        tv01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int temptv03 = Integer.parseInt((tv00.getText().toString()));
                tv02.setText(Integer.toBinaryString(temptv03)+"");
            }
        });

        tv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int temptv03 = Integer.parseInt((tv10.getText().toString()));
                tv12.setText(Integer.toOctalString(temptv03)+"");
            }
        });

        tv21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int temptv03 = Integer.parseInt((tv20.getText().toString()));
                tv22.setText(Integer.toHexString(temptv03)+"");
            }
        });

        tv31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int temptv03 = Integer.parseInt((tv30.getText().toString()));
                tv32.setText( (temptv03)*1000+"米");
            }
        });

        tv41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int temptv03 = Integer.parseInt((tv40.getText().toString()));
                tv42.setText( (temptv03)*1000+"");
            }
        });
    }
}
