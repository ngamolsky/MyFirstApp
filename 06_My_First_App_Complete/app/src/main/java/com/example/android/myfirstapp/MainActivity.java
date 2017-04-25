package com.example.android.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";
    private int mCount = 0;
    private TextView mCountTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the TextView by ID
        mCountTextView = (TextView) findViewById(R.id.textview_count);
    }

    /**
     * OnClick method for displaying a "Toast" message
     * @param view The "Toast" button
     */
    public void toastMe(View view) {
        String toastMessage = getString(R.string.hello_toast);
        int toastLength = Toast.LENGTH_SHORT;
        Toast.makeText(this, toastMessage, toastLength).show();
    }

    /**
     * OnClick method for increasing the count by one and updating the TextView
     * @param view The "Count" button
     */
    public void countMe(View view) {
        // Increment and display the the count
        mCount++;
        mCountTextView.setText(String.valueOf(mCount));
    }

    /**
     * OnClick method for starting a new activity that displays a random score between 0 and mCount
     * @param view The "Random" button
     */
    public void randomMe(View view) {
        // Create an Intent with the random integer and count as Intent extras
        Intent randomIntent = new Intent(this, SecondActivity.class);
        randomIntent.putExtra(TOTAL_COUNT, mCount);

        // Start the new Activity
        startActivity(randomIntent);
    }
}