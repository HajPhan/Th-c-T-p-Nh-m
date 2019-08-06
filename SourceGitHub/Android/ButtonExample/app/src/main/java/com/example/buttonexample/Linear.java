package com.example.buttonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Linear extends AppCompatActivity {

    private Button btnSum, btnSub, btnMul, btnDiv;
    private EditText editText1;
    private EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
//        addListenerOnbuttonSubtract();
    }

    public void onClick1(View view) {
        this.editText1 = findViewById(R.id.editText5);
        this.editText2 = findViewById(R.id.editText6);
        this.btnSum = findViewById(R.id.btnSum);
//        System.out.println("Button Sum = " + btnSum.callOnClick());
        Log.i("button", String.valueOf(btnSum.isSelected()));
        Log.i("isActived", String.valueOf(btnSub.isActivated()));
        String value1 = this.editText1.getText().toString();
        String value2 = this.editText2.getText().toString();

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);
        int sum = num1 + num2;

        Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_SHORT).show();
    }

/*    public void addListenerOnbuttonSubtract() {
        this.editText1 = findViewById(R.id.editText5);
        this.editText2 = findViewById(R.id.editText6);
        this.btnSub = findViewById(R.id.btnSub);

        this.btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = editText1.getText().toString();
                String value2 = editText2.getText().toString();

                int num1 = Integer.parseInt(value1);
                int num2 = Integer.parseInt(value2);
                int sub = num1 - num2;

                Toast.makeText(getApplicationContext(), String.valueOf(sub), Toast.LENGTH_SHORT).show();
            }
        });
    }*/

    public int calcSum() {
        String value1 = editText1.getText().toString();
        String value2 = editText2.getText().toString();

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);
        return num1 + num2;
    }

    public int calcSub() {
        String value1 = editText1.getText().toString();
        String value2 = editText2.getText().toString();

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);
        return num1 - num2;
    }

    public int calcMul() {
        String value1 = editText1.getText().toString();
        String value2 = editText2.getText().toString();

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);
        return num1 * num1;
    }

    public double calcDiv() {
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
                calcSum();
                break;
            case R.id.btnSub:
                //do something here
                calcSub();
                break;
            case R.id.btnMul:
                //do something here
                calcMul();
                break;
            case R.id.btnDiv:
                //do something here
                calcDiv();
                break;
        }
    }
}
