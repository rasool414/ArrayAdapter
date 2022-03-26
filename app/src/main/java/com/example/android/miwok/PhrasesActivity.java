package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("where are you going?", "minto wuksus"));
        words.add(new Word("what is your name/", "tinna oyaasina"));
        words.add(new Word("my name is ", "oyyasit"));
        words.add(new Word("how are you feeling?", "michaksas"));
        words.add(new Word("i m feeling good", "kuchi achit"));
        words.add(new Word("are you coming", "aanas aa"));
        words.add(new Word("yes i am coming ", "haa aanam"));
        words.add(new Word("i ma coming", "anam"));



        WordAdapter Adapter = new WordAdapter(this,  words,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);


    }
}