package com.example.alangregos.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.miwok.R;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<ListEntry> wordPairs = new ArrayList<ListEntry>();

        wordPairs.add(new ListEntry(R.drawable.placeholder, "weṭeṭṭi", "red"));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "chokokki", "green"));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "ṭakaakki", "brown"));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "ṭopoppi", "gray"));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "kululli", "black"));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "kelelli", "white"));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "ṭopiisә", "dusty yellow"));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "chiwiiṭә", "mustard yellow"));


        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)

        WordAdapter adapter = new WordAdapter(this, wordPairs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

