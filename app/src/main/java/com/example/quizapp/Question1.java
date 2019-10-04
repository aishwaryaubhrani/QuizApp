package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Question1 extends AppCompatActivity {
    TextView t4;
    int Score=0;
    String Score1;
    boolean ans = false;
    public void checkAns1(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.radioButton:
                Score = 0;
                Score1 = Integer.toString(Score);
                break;

            case R.id.radioButton3:
                Score=1;
                Score1 = Integer.toString(Score);
                Log.i("Score: ", Integer.toString(Score));
                break;

            case R.id.radioButton4:
                Score = 0;
                Score1 = Integer.toString(Score);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        t4 = findViewById(R.id.textView4);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Question1.this, Question2.class);
                Bundle b = new Bundle();
                b.putString("Score", Score1);
                in.putExtras(b);
                startActivity(in);
            }
        });
    }
}
