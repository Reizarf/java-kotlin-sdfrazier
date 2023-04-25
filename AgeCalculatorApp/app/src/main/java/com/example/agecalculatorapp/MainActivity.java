package com.example.agecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
        Toast.makeText(this,"Your current age = "+String.valueOf(age),Toast.LENGTH_SHORT).show();

    }
}