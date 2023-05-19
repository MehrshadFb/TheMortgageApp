package com.example.themortgageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClicked(View v) {

        EditText pView = (EditText) findViewById(R.id.principle);
        String p = pView.getText().toString();
        EditText aView = (EditText) findViewById(R.id.amortization);
        String a = aView.getText().toString();
        EditText iView = (EditText) findViewById(R.id.interest);
        String i = iView.getText().toString();

        MortgageModel model = new MortgageModel(p, a, i);
        String result = model.computePayment();
        ((TextView) findViewById(R.id.answer)).setText(result);
    }
}