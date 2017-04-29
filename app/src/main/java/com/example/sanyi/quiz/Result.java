package com.example.sanyi.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


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

        result1.setText(getString(R.string.result1) + " " + getString(R.string.zeroPoint));
        result2.setText(getString(R.string.result2) + " " + getString(R.string.zeroPoint));
        result3.setText(getString(R.string.result3) + " " + getString(R.string.zeroPoint));
        result4.setText(getString(R.string.result4) + " " + getString(R.string.zeroPoint));
        result5.setText(getString(R.string.result5) + " " + getString(R.string.zeroPoint));
        result6.setText(getString(R.string.result6) + " " + getString(R.string.zeroPoint));

        String name = getIntent().getExtras().getString("Name");
        TextView textView = (TextView) findViewById(R.id.name);
        textView.setText(getString(R.string.hey) + " " + name);
        int point = getIntent().getExtras().getInt("step");
        Boolean q1 = getIntent().getExtras().getBoolean("Question_1");
        Boolean q2 = getIntent().getExtras().getBoolean("Question_2");
        Boolean q3 = getIntent().getExtras().getBoolean("Question_3");
        Boolean q4 = getIntent().getExtras().getBoolean("Question_4");
        Boolean q5 = getIntent().getExtras().getBoolean("Question_5");
        Boolean q6 = getIntent().getExtras().getBoolean("Question_6");
        int score = 0;
        // Evaluating the quiz sheet depending on the actual answer from the intent extras
        if (q1) {
            result1.setText(getString(R.string.result1) + " " + getString(R.string.onePoint));
            score += point;
        }
        if (q2) {
            result2.setText(getString(R.string.result2) + " " + getString(R.string.onePoint));
            score += point;
        }
        if (q3) {
            result3.setText(getString(R.string.result3) + " " + getString(R.string.onePoint));
            score += point;
        }
        if (q4) {
            result4.setText(getString(R.string.result4) + " " + getString(R.string.onePoint));
            score += point;
        }
        if (q5) {
            result5.setText(getString(R.string.result5) + " " + getString(R.string.onePoint));
            score += point;
        }
        if (q6) {
            result6.setText(getString(R.string.result6) + " " + getString(R.string.onePoint));
            score += point;
        }
        TextView result = (TextView) findViewById(R.id.result7);
        result.setText(getString(R.string.sum) + " " + String.valueOf(score) + " " + getString(R.string.pt));


    }
}
