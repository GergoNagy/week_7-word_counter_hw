package com.example.user.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        TextView numberOfWords = (TextView)findViewById(R.id.numberOfWords);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int count = extras.getInt("count");

        numberOfWords.setText(Integer.toString(count));
    }
}