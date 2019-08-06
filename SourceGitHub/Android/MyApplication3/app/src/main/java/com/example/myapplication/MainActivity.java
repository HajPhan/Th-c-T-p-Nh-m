package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSum, btnSub, btnMul, btnDiv;
    private EditText editText1;
    private EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int calcSum() {
        this.editText1 = findViewById(R.id.editText5);
        this.editText2 = findViewById(R.id.editText6);

        String value1 = editText1.getText().toString();
        String value2 = editText2.getText().toString();

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);
        return num1 + num2;
    }

    public int calcSub() {
        this.editText1 = findViewById(R.id.editText5);
        this.editText2 = findViewById(R.id.editText6);

        String value1 = editText1.getText().toString();
        String value2 = editText2.getText().toString();

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);
        return num1 - num2;
    }

    public int calcMul() {
        this.editText1 = findViewById(R.id.editText5);
        this.editText2 = findViewById(R.id.editText6);

        String value1 = editText1.getText().toString();
        String value2 = editText2.getText().toString();

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);
        return num1 * num1;
    }

    public double calcDiv() {
        this.editText1 = findViewById(R.id.editText5);
        this.editText2 = findViewById(R.id.editText6);

        String value1 = editText1.getText().toString();
        String value2 = editText2.getText().toString();

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);
        return Double.valueOf(num1 / num2);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnSum:
                //do something here
                Toast.makeText(getApplicationContext(), String.valueOf(calcSum()), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnSub:
                //do something here
                Toast.makeText(getApplicationContext(), String.valueOf(calcSub()), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnMul:
                //do something here
                Toast.makeText(getApplicationContext(), String.valueOf(calcMul()), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnDiv:
                //do something here
                Toast.makeText(getApplicationContext(), String.valueOf(calcDiv()), Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
