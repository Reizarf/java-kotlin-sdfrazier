package com.example.agecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.resources.TextAppearance;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getage(View view) {
        EditText editText = (EditText) findViewById(R.id.EditTextID);
        int birthYear = Integer.parseInt(editText.getText().toString());
        int age = 2023 - birthYear;
        int days = age*365;
        Toast.makeText(this,"Your current age = "+String.valueOf(age),Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"And In days ="+String.valueOf(days),Toast.LENGTH_LONG).show();
    }
}