package com.example.android.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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
}