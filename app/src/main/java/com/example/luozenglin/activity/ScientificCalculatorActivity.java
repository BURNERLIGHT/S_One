package com.example.luozenglin.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.luozenglin.service.ScientificCalculator;

public class  ScientificCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_scientific_layout);
        ScientificCalculator scientificCalculator = new ScientificCalculator(this);

    findViewById(R.id.anti_btn).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(ScientificCalculatorActivity.this,TranActivity.class));
        }
    });


    }
}
