package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.ArrayAdapter;



import java.util.ArrayList;




public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);



        //Create a list of words
       ArrayList<word> words = new ArrayList<word>();

        words.add(new word("one", "Lutti"));
        words.add(new word("two", "otiiko"));
        words.add(new word("three", "tolookosu"));
        words.add(new word("four", "oyyisa"));
        words.add(new word("five", "massokka"));
        words.add(new word("six", "temmokka"));
        words.add(new word("seven", "kenekaku"));
        words.add(new word("eight", "kawinta"));
        words.add(new word("nine", "wo’e"));
        words.add(new word("ten", "na’aacha"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter layoutadapter = new WordAdapter(this, words);


        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(layoutadapter);
    }
    }



