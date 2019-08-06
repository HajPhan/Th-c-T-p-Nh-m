package com.example.buttonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SeccondActivity extends AppCompatActivity {

    private EditText editText3, editText4;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seccond);
//        this.btn = findViewById(R.id.btnAdd);
    }

    public void onClick(View view) {
        this.editText3 = findViewById(R.id.editText3);
        this.editText4 = findViewById(R.id.editText4);
        this.btn = findViewById(R.id.btnSum);

        String value3 = this.editText3.getText().toString();
        String value4 = this.editText4.getText().toString();

        int a = Integer.parseInt(value3);
        int b = Integer.parseInt(value4);
        int sum = a + b;

//        Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();

        Toast toast = Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG);
//        toast.setMargin(0, 250);
        toast.show();

    }
}
