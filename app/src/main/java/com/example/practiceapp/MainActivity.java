package com.example.practiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void happy(View view){
        TextView myTV = findViewById(R.id.textView3);
        myTV.setText("your mood is happy!");
    }
    public void sad(View view){
        TextView myTV = findViewById(R.id.textView3);
        myTV.setText("your mood is sad");
    }

    public void tired(View view){
        TextView myTV = findViewById(R.id.textView3);
        myTV.setText("your mood is tired");
    }

    public void mad(View view){
        TextView myTV = findViewById(R.id.textView3);
        myTV.setText("your mood is mad");
    }

}