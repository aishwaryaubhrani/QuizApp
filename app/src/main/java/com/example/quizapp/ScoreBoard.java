package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ScoreBoard extends AppCompatActivity {
    String number, Score1;
    int Score, lastScore, wrong;
    TextView t19, t20, t21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board);
        Bundle b = getIntent().getExtras();
        number = b.getString("Score");
        Score = Integer.parseInt(number);
        wrong = 5-Score;
        lastScore = Score;
        t19 = findViewById(R.id.textView19);
        t20 = findViewById(R.id.textView20);
        t21 = findViewById(R.id.textView21);
        t19.setText("YOUR SCORE: "+Score);
        t20.setText("Correct Answers: "+Score);
        t21.setText("Wrong Answers: "+wrong);


    }
}
