package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2;
    Button add,sub,mul,div;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        res = findViewById(R.id.res);

     add.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            int f,s,a;
            f = Integer.parseInt(num1.getText().toString());
            s = Integer.parseInt(num2.getText().toString());
            a = s + f;
            res.setText("Result is "+a);
            Toast.makeText(MainActivity.this,"Your Result is "+a, Toast.LENGTH_LONG).show();
        }
    });

        sub.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            int f,s,a;
            f = Integer.parseInt(num1.getText().toString());
            s = Integer.parseInt(num2.getText().toString());
            a = f - s;
            res.setText("Result is "+a);
            Toast.makeText(MainActivity.this,"Your Result is "+a, Toast.LENGTH_LONG).show();
        }
    });

        mul.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            int f,s,a;
            f = Integer.parseInt(num1.getText().toString());
            s = Integer.parseInt(num2.getText().toString());
            a = s * f;
            res.setText("Result is "+a);
            Toast.makeText(MainActivity.this,"Your Result is "+a, Toast.LENGTH_LONG).show();
        }
    });

        div.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            int f,s,a;
            f = Integer.parseInt(num1.getText().toString());
            s = Integer.parseInt(num2.getText().toString());
            a = f / s;
            res.setText("Result is "+a);
            Toast.makeText(MainActivity.this,"Your Result is "+a, Toast.LENGTH_LONG).show();
        }
    });


    }

}