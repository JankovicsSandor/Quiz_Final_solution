package com.example.sanyi.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;


public class Quiz extends AppCompatActivity {

    int points = 0;
    // This way we can set how mch does a good answer worth
    int goodPoint=1;
    private boolean equalls(String what,String to){
        boolean result=false;
        if(what.toLowerCase().equals(to)){
            result=true;
        }
        return result;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
        Button done = (Button) findViewById(R.id.done);
        //Evaluating the quiz and the send the result to the ressult activity
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Evaluating first question
                RadioButton question1 = (RadioButton) findViewById(R.id.question1ansc);
                boolean check1 = question1.isChecked();
                if (check1) {
                    points += goodPoint;
                }
                // Evaluating second question
                RadioButton question2 = (RadioButton) findViewById(R.id.question2ansa);
                boolean check2 = question2.isChecked();
                if (check2) {
                    points += goodPoint;
                }
                //Evaluating third question
                EditText question3 = (EditText) findViewById(R.id.question3ans);
                String ans3 = question3.getText().toString();
                boolean check3 = false;
                if (equalls(ans3,"cpu")) {
                    check3 = true;
                    points += goodPoint;
                }
                // Evaluating fourth question
                EditText question4 = (EditText) findViewById(R.id.question4ans);
                String ans4 = question4.getText().toString();
                boolean check4 = false;
                if (equalls(ans4,"gpu")) {
                    check4 = true;
                    points += goodPoint;
                }
                // Evaluating fifth question
                EditText question5 = (EditText) findViewById(R.id.question5ans);
                String ans5 = question5.getText().toString();
                boolean check5 = false;
                if (equalls(ans5,"motherboard")) {
                    check5 = true;
                    points += goodPoint;
                }

                // Evaluating sixth question - two possible answers
                CheckBox question6ans1 = (CheckBox) findViewById(R.id.question6ans1);
                CheckBox question6ans2 = (CheckBox) findViewById(R.id.question6ans3);
                CheckBox question6false = (CheckBox) findViewById(R.id.question6ans2);
                // Chacking if only two right answers were ticked
                Boolean check6 = question6ans1.isChecked() && question6ans2.isChecked() && !question6false.isChecked();
                if (check6) {
                    points += goodPoint;
                }
                Intent intent = new Intent(Quiz.this, Result.class);
                // Putting extra informations for the user to the evaluation
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
        });
    }
}


