package com.example.android.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}