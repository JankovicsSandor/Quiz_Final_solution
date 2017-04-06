package com.example.sanyi.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

/**
 * Created by Sanyi on 05/04/2017.
 */

public class Quiz extends AppCompatActivity {

    int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
    }

    //Evaluating the quiz and the send the result to the ressult activity
    public void finish(View view) {
        RadioButton question1 = (RadioButton) findViewById(R.id.question1ansc);
        Boolean check1 = question1.isChecked();
        if (check1) {
            points += 1;
        }
        RadioButton question2 = (RadioButton) findViewById(R.id.question2ansa);
        Boolean check2 = question2.isChecked();
        if (check2) {
            points += 1;
        }
        EditText question3 = (EditText) findViewById(R.id.question3ans);
        String ans3 = question3.getText().toString();
        boolean check3 = false;
        if (ans3.toLowerCase().equals("cpu")) {
            check3 = true;
            points += 1;
        }
        EditText question4 = (EditText) findViewById(R.id.question4ans);
        String ans4 = question4.getText().toString();
        boolean check4 = false;
        if (ans4.equals("gpu")) {
            check4 = true;
            points += 1;
        }
        EditText question5 = (EditText) findViewById(R.id.question5ans);
        String ans5 = question5.getText().toString();
        boolean check5 = false;
        if (ans5.toLowerCase().equals("motherboard")) {
            check5 = true;
            points += 1;
        }
        CheckBox question6ans1 = (CheckBox) findViewById(R.id.question6ans1);
        Boolean check6_1 = question6ans1.isChecked();
        CheckBox question6ans2 = (CheckBox) findViewById(R.id.question6ans3);
        Boolean check6_2 = question6ans2.isChecked();
        boolean check6 = false;

        if (check6_1 && check6_2) {
            check6 = true;
            points += 1;
        }
        Intent intent = new Intent(this, Result.class);
        intent.putExtra("Question_1", check1);
        intent.putExtra("Question_2", check2);
        intent.putExtra("Question_3", check3);
        intent.putExtra("Question_4", check4);
        intent.putExtra("Question_5", check5);
        intent.putExtra("Question_6", check6);
        String name = getIntent().getExtras().getString("Name");
        intent.putExtra("Name", name);
        startActivity(intent);
    }


}
