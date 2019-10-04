package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Question5 extends AppCompatActivity {
    String number, Score1;
    int Score, lastScore;
    TextView t16;

    public void checkAns5(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.radioButton15:
                Score = lastScore;
                Score1 = Integer.toString(Score);
                break;

            case R.id.radioButton16:
                Score= lastScore;
                Score1 = Integer.toString(Score);
                break;

            case R.id.radioButton17:
                Score = lastScore;
                Score1 = Integer.toString(Score);
                break;

            case R.id.radioButton18:
                Score= lastScore+1;
                Score1 = Integer.toString(Score);
                break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
        t16 = findViewById(R.id.textView16);
        Bundle b = getIntent().getExtras();
        number = b.getString("Score");
        Score = Integer.parseInt(number);
        lastScore = Score;
        t16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Question5.this, ScoreBoard.class);
                Bundle b = new Bundle();
                b.putString("Score", Score1);
                in.putExtras(b);
                startActivity(in);
            }
        });

    }
}
