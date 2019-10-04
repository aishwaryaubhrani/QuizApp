package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Question4 extends AppCompatActivity {
    String number, Score1;
    int Score, lastScore;
    TextView t13;

    public void checkAns4(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.radioButton11:
                Score = lastScore;
                Score1 = Integer.toString(Score);
                break;

            case R.id.radioButton12:
                Score= lastScore;
                Score1 = Integer.toString(Score);
                break;

            case R.id.radioButton13:
                Score = lastScore+1;
                Score1 = Integer.toString(Score);
                break;

            case R.id.radioButton14:
                Score= lastScore;
                Score1 = Integer.toString(Score);
                break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        t13 = findViewById(R.id.textView13);
        Bundle b = getIntent().getExtras();
        number = b.getString("Score");
        Score = Integer.parseInt(number);
        lastScore = Score;
        t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Question4.this, Question5.class);
                Bundle b = new Bundle();
                b.putString("Score", Score1);
                in.putExtras(b);
                startActivity(in);
            }
        });
    }
}
