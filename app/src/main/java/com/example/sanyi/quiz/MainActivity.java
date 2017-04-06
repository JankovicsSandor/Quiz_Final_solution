package com.example.sanyi.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //When clicking the button sending the name to result activity
    public void send(View view) {
        Intent newAct = new Intent(this, Quiz.class);
        EditText editText = (EditText) findViewById(R.id.player);
        String name = editText.getText().toString();
        newAct.putExtra("Name", name);
        startActivity(newAct);
    }
}
