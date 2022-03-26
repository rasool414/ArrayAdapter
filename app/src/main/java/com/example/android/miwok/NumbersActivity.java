    package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();


        words.add(new Word("one", "lutti", R.drawable.number_one));
        words.add(new Word("two", "otiiko",  R.drawable.number_two));
        words.add(new Word("three", "tolookasu",  R.drawable.number_three));
        words.add(new Word("four", "oyyisa",  R.drawable.number_four));
        words.add(new Word("five", "massokka",  R.drawable.number_five));
        words.add(new Word("six", "massokka",  R.drawable.number_six));
        words.add(new Word("seven", "temmokka",  R.drawable.number_seven));
        words.add(new Word("eight", "kenekkaku",  R.drawable.number_eight));
        words.add(new Word("nine", "kawinta",  R.drawable.number_nine));
        words.add(new Word("ten", "na' aacha",  R.drawable.number_ten));




        WordAdapter Adapter = new WordAdapter(this,  words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }


}