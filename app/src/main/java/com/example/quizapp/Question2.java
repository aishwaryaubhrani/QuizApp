package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Question2 extends AppCompatActivity {
    TextView t6,t7;
    String number, Score1;
    int Score, lastScore;
    public void checkAns2(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.radioButton2:
                Score = lastScore;
                Score1 = Integer.toString(Score);
                break;

            case R.id.radioButton5:
                Score= lastScore;
                Score1 = Integer.toString(Score);
                Log.i("Score: ", Integer.toString(Score));
                break;

            case R.id.radioButton6:
                Score = lastScore+1;
                Score1 = Integer.toString(Score);
                break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        Bundle b = getIntent().getExtras();
        number = b.getString("Score");
        Score = Integer.parseInt(number);
        lastScore = Score;
        t6 = findViewById(R.id.textView6);
        t7 = findViewById(R.id.textView7);
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Question2.this, Question3.class);
                Bundle b = new Bundle();
                b.putString("Score", Score1);
                in.putExtras(b);
                startActivity(in);
            }
        });
    }
}
