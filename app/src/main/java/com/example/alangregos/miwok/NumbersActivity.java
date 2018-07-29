package com.example.alangregos.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.miwok.R;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);



        ArrayList<ListEntry> wordPairs = new ArrayList<ListEntry>();

        wordPairs.add(new ListEntry(R.drawable.placeholder,"lutti", "one"));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "otiiko","two"));
        wordPairs.add(new ListEntry(R.drawable.placeholder,"tolookosu" ,"three"));
        wordPairs.add(new ListEntry(R.drawable.placeholder,"oyyisa","four"));
        wordPairs.add(new ListEntry(R.drawable.placeholder,"massokka","five"));
        wordPairs.add(new ListEntry(R.drawable.placeholder,"temmokka","six"));
        wordPairs.add(new ListEntry(R.drawable.placeholder,"kenekaku","seven"));
        wordPairs.add(new ListEntry(R.drawable.placeholder,"kawinta","eight"));
        wordPairs.add(new ListEntry(R.drawable.placeholder,"wo’e","nine"));
        wordPairs.add(new ListEntry(R.drawable.placeholder,"na’aacha","ten"));


        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)

       WordAdapter adapter = new WordAdapter(this, wordPairs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
