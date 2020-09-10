package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ProgressBar progressBar = findViewById(R.id.progressBar);
        final Handler mHandler = new Handler();
        Runnable runnable = new Runnable() {
            public void run() {
                int progress = progressBar.getProgress() + 5;
                progressBar.setProgress(progress);
                if (progress > 100) {
                    progressBar.setProgress(0);
                }
                mHandler.postDelayed(this, 100);
            }
        };
        mHandler.postDelayed(runnable, 100);
    }
}