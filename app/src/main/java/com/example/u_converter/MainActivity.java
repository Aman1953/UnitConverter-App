package com.example.u_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button button;
private TextView textView2;
private EditText editTextNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView2=findViewById(R.id.textView2);
        editTextNumber=findViewById(R.id.editTextNumber);
    }

    public void calculate(View view)
    {
        String s=editTextNumber.getText().toString();
        int kg=Integer.parseInt(s);
        double pound=2.205*kg;
        textView2.setText(pound+" pounds");
    }
}