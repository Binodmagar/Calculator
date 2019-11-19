package com.binod.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnone, btntwo, btnthree, btnfour, btnfive, btnsix, btnseven, btneight, btnnine, btnadd, btnsub, btnmul, btndiv, btndot, btnzero, btnequal;
    TextView tvResult;
    float num1, num2;

    boolean add = false, sub = false, multiply = false, div = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //binding
        btnone = findViewById(R.id.btnone);
        btntwo = findViewById(R.id.btntwo);
        btnthree = findViewById(R.id.btnthree);
        btnfour = findViewById(R.id.btnfour);
        btnfive = findViewById(R.id.btnfive);
        btnsix = findViewById(R.id.btnsix);
        btnseven = findViewById(R.id.btnseven);
        btneight = findViewById(R.id.btneight);
        btnnine = findViewById(R.id.btnnine);
        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btnmul = findViewById(R.id.btnmul);
        btndiv = findViewById(R.id.btndiv);
        btndot = findViewById(R.id.btndot);
        btnzero = findViewById(R.id.btnzero);
        btnequal = findViewById(R.id.btnequal);
        tvResult = findViewById(R.id.tvresult);



        btnzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText().toString() + "0");
            }
        });

        btnone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText().toString() + "1");
            }
        });
        btntwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText().toString() + "2");
            }
        });
        btnthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText().toString() + "3");
            }
        });
        btnfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText().toString() + "4");
            }
        });
        btnfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText().toString() + "5");
            }
        });
        btnsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText().toString() + "6");
            }
        });
        btnseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText().toString() + "7");
            }
        });
        btneight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText().toString() + "8");
            }
        });
        btnnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText().toString() + "9");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText().toString() + ".");
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvResult.getText() == ""){
                    tvResult.setText("");
                }else{
                    num1 = Float.parseFloat(tvResult.getText() + "");
                    add = true;
                    sub = false;
                    multiply = false;
                    div = false;
                    tvResult.setText(null);
                }
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Float.parseFloat(tvResult.getText() + "");
                Calculator calculator = new Calculator(num1, num2);
                if(add == true){
                    String res = Float.toString(calculator.add());
                    tvResult.setText(res);
                    add = false;
                }
            }
        });

    }
}
