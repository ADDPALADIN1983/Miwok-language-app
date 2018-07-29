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

        wordPairs.add(new ListEntry(R.drawable.family_father, "әpә", "father"));
        wordPairs.add(new ListEntry(R.drawable.family_mother, "әṭa", "mother"));
        wordPairs.add(new ListEntry(R.drawable.family_son, "angsi", "son"));
        wordPairs.add(new ListEntry(R.drawable.family_daughter, "tune", "daughter"));
        wordPairs.add(new ListEntry(R.drawable.family_older_brother, "taachi", "older brother"));
        wordPairs.add(new ListEntry(R.drawable.family_younger_brother, "chalitti", "younger brother"));
        wordPairs.add(new ListEntry(R.drawable.family_older_sister, "teṭe", "older sister"));
        wordPairs.add(new ListEntry(R.drawable.family_younger_sister, "kolliti", "younger sister"));
        wordPairs.add(new ListEntry(R.drawable.family_grandmother, "ama", "grandmother"));
        wordPairs.add(new ListEntry(R.drawable.family_grandfather, "paapa", "grandfather"));


        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)

        WordAdapter adapter = new WordAdapter(this, wordPairs, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}

