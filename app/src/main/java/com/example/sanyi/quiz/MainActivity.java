package com.example.sanyi.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //When clicking the button sending the name to result activity
        Button start = (Button) findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newAct = new Intent(MainActivity.this, Quiz.class);
                EditText editText = (EditText) findViewById(R.id.player);
                String name = editText.getText().toString();
                newAct.putExtra("Name", name);
                startActivity(newAct);
            }
        });
    }


}
