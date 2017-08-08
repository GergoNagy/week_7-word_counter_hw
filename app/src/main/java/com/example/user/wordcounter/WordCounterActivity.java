package com.example.user.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WordCounterActivity extends AppCompatActivity {

    EditText sentence;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        sentence =  (EditText) findViewById(R.id.sentence);
        button = (Button) findViewById(R.id.counter);
    }

    public void onButtonClicked(View button){
        String st = sentence.getText().toString();

        WordCounter wordCounter = new WordCounter(st);
        int count = wordCounter.getNumberOfWord();

        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("count", count);
        startActivity(intent);

    }
}