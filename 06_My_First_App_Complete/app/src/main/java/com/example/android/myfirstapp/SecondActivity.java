package com.example.android.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Find both the label and count display TextViews by ID
        TextView randomIntTextView = (TextView) findViewById(R.id.textview_random);
        TextView labelTextView= (TextView) findViewById(R.id.textview_label);

        // Check if the Intent that started this activity has the Intent extra
        if(getIntent().hasExtra(TOTAL_COUNT)) {

            // Get the count from the intent
            int count = getIntent().getIntExtra(TOTAL_COUNT, 0);

            // Generate a random number between zero and the count (exclusive)
            Random random = new Random();
            int randomInt = 0;
            if(count>0) {
                randomInt = random.nextInt(count);
            }

            // Populate the TextViews
            labelTextView.setText(getString(R.string.random_label_text, count));
            randomIntTextView.setText(String.valueOf(randomInt));
        } else {
            // Otherwise, set show an error message
            randomIntTextView.setText(R.string.intent_extra_not_found);
        }
    }
}
