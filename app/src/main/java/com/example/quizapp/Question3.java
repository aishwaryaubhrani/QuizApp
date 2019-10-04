package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Question3 extends AppCompatActivity {
    String number, Score1;
    int Score, lastScore;
    TextView t10;

    public void checkAns3(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.radioButton7:
                Score = lastScore+1;
                Score1 = Integer.toString(Score);
                break;

            case R.id.radioButton8:
                Score= lastScore;
                Score1 = Integer.toString(Score);
                break;

            case R.id.radioButton9:
                Score = lastScore;
                Score1 = Integer.toString(Score);
                break;

            case R.id.radioButton10:
                Score= lastScore;
                Score1 = Integer.toString(Score);
                break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        t10 = findViewById(R.id.textView10);
        Bundle b = getIntent().getExtras();
        number = b.getString("Score");
        Score = Integer.parseInt(number);
        lastScore = Score;
        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Question3.this, Question4.class);
                Bundle b = new Bundle();
                b.putString("Score", Score1);
                in.putExtras(b);
                startActivity(in);
            }
        });
    }
}
