package com.example.pr2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("rrr", "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("rrr", "onStart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("rrr", "onStop: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("rrr", "onPause: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("rrr", "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("rrr", "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("rrr", "onDestroy: ");
    }
}