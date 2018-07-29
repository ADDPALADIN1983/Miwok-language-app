package com.example.alangregos.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.miwok.R;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<ListEntry> wordPairs = new ArrayList<ListEntry>();

        wordPairs.add(new ListEntry(R.drawable.placeholder, "minto wuksus", "Where are you going?"));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "tinnә oyaase'nә", "What is your name?"));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "oyaaset...", "  My name is..."));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "michәksәs?", "How are you feeling?"));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "kuchi achit", "I’m feeling good."));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "әәnәs'aa?", "Are you coming?"));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "hәә’ әәnәm", "Yes, I’m coming."));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "әәnәm", "I’m coming."));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "yoowutis", "Let’s go."));
        wordPairs.add(new ListEntry(R.drawable.placeholder, "әnni'nem", "Come here."));

        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)

        WordAdapter adapter = new WordAdapter(this, wordPairs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}
