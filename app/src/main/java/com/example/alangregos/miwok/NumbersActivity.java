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

        wordPairs.add(new ListEntry(R.drawable.number_one,"lutti", "one"));
        wordPairs.add(new ListEntry(R.drawable.number_two, "otiiko","two"));
        wordPairs.add(new ListEntry(R.drawable.number_three,"tolookosu" ,"three"));
        wordPairs.add(new ListEntry(R.drawable.number_four,"oyyisa","four"));
        wordPairs.add(new ListEntry(R.drawable.number_five,"massokka","five"));
        wordPairs.add(new ListEntry(R.drawable.number_six,"temmokka","six"));
        wordPairs.add(new ListEntry(R.drawable.number_seven,"kenekaku","seven"));
        wordPairs.add(new ListEntry(R.drawable.number_eight,"kawinta","eight"));
        wordPairs.add(new ListEntry(R.drawable.number_nine,"wo’e","nine"));
        wordPairs.add(new ListEntry(R.drawable.number_ten,"na’aacha","ten"));


        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)

       WordAdapter adapter = new WordAdapter(this, wordPairs, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
