package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txt_feedback;
    private Switch sw_answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sw_answer = findViewById(R.id.sw_answer);
        txt_feedback = findViewById(R.id.txt_feedback);

        sw_answer.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                txt_feedback.setText(R.string.yes_feedback);
                sw_answer.setText(R.string.yes_sw);
            } else {
                txt_feedback.setText(R.string.no_feedback);
                sw_answer.setText(R.string.no_sw);
            }
        });
    }
}