package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("father", "әpә", R.drawable.family_father));
        words.add(new word("mother", "әṭa", R.drawable.family_mother));
        words.add(new word("son", "angsi", R.drawable.family_son));
        words.add(new word("daughter", "tune", R.drawable.family_daughter));
        words.add(new word("older brother", "taachi", R.drawable.family_older_brother));
        words.add(new word("younger brother", "chalitti", R.drawable.family_younger_brother));
        words.add(new word("older sister", "teṭe", R.drawable.family_older_sister));
        words.add(new word("younger sister", "kolliti", R.drawable.family_younger_sister));
        words.add(new word("grandmother ", "ama", R.drawable.family_grandmother));
        words.add(new word("grandfather", "paapa", R.drawable.family_grandfather));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
