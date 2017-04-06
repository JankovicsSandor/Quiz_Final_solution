package com.example.sanyi.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Sanyi on 06/04/2017.
 */

public class Result extends AppCompatActivity {

    @Override
    // Setting the values according to the answers
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        TextView result1 = (TextView) findViewById(R.id.result1);
        TextView result2 = (TextView) findViewById(R.id.result2);
        TextView result3 = (TextView) findViewById(R.id.result3);
        TextView result4 = (TextView) findViewById(R.id.result4);
        TextView result5 = (TextView) findViewById(R.id.result5);
        TextView result6 = (TextView) findViewById(R.id.result6);
        String name = getIntent().getExtras().getString("Name");
        TextView textView = (TextView) findViewById(R.id.name);
        textView.setText("Hey " + name + " check out your scores:");
        Boolean q1 = getIntent().getExtras().getBoolean("Question_1");
        Boolean q2 = getIntent().getExtras().getBoolean("Question_2");
        Boolean q3 = getIntent().getExtras().getBoolean("Question_3");
        Boolean q4 = getIntent().getExtras().getBoolean("Question_4");
        Boolean q5 = getIntent().getExtras().getBoolean("Question_5");
        Boolean q6 = getIntent().getExtras().getBoolean("Question_6");
        int score = 0;
        if (q1) {
            result1.setText("First question : " + " 1 pts");
            score++;
        } else {
            result1.setText("First question : " + "0 pts");
        }
        if (q2) {
            result2.setText("Second question : " + " 1 pts");
            score++;
        } else {
            result2.setText("Second question : " + "0 pts");
        }
        if (q3) {
            result3.setText("Third question : " + " 1 pts");
            score++;
        } else {
            result3.setText("Third question : " + "0 pts");
        }
        if (q4) {
            result4.setText("Fourth question : " + " 1 pts");
            score++;
        } else {
            result4.setText("Fourth question : " + "0 pts");
        }
        if (q5) {
            result5.setText("Fifth question : " + " 1 pts");
            score++;
        } else {
            result5.setText("Fifth question : " + "0 pts");
        }
        if (q6) {
            result6.setText("Sixth question : " + " 1 pts");
            score++;
        } else {
            result6.setText("Sixth question : " + "0 pts");
        }
        TextView result = (TextView) findViewById(R.id.result7);
        result.setText("Sum : " + String.valueOf(score) + " pts");


    }
}
