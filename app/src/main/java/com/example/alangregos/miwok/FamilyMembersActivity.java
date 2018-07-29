package com.example.alangregos.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.miwok.R;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<ListEntry> wordPairs = new ArrayList<ListEntry>();

        wordPairs.add(new ListEntry(R.drawable.placeholder, "әpә", "father"));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "әṭa", "mother"));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "angsi", "son"));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "tune", "daughter"));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "taachi", "older brother"));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "chalitti", "younger brother"));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "teṭe", "older sister"));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "kolliti", "younger sister"));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "ama", "grandmother"));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "paapa", "grandfather"));


        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)

        WordAdapter adapter = new WordAdapter(this, wordPairs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}

