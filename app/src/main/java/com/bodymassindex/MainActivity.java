package com.bodymassindex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etHeight;
    EditText etWeight;
    Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etHeight = findViewById(R.id.etheight);
        etWeight = findViewById(R.id.etweight);
        btnCalc = findViewById(R.id.btnbmi);
        btnCalc.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnbmi) {
            float a = Float.parseFloat(etHeight.getText().toString());
            float b = Float.parseFloat(etWeight.getText().toString());
            float bmi = (b * 10000 / (a * a));
            if (bmi <= 18.5) {
                Toast.makeText(MainActivity.this, "The bmi is " + bmi +
                        "and you are UnderWeight", Toast.LENGTH_LONG).show();
            }
            else if (bmi >= 18.5 & 24.9 >= bmi) {
                Toast.makeText(MainActivity.this, "The bmi is " + bmi +
                        "and you are NormalWeight", Toast.LENGTH_LONG).show();
            }
            else if (bmi <= 29.9 & 25 >= bmi) {
                Toast.makeText(MainActivity.this, "The bmi is " + bmi +
                        "and you are OverWeight", Toast.LENGTH_LONG).show();
            }
            else if (bmi >= 30) {
                Toast.makeText(MainActivity.this, "The bmi is " + bmi +
                        "and you have Obesity", Toast.LENGTH_LONG).show();
            }
        }
    }
}
