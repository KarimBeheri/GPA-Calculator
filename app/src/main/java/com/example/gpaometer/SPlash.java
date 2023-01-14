package com.example.gpaometer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.ContextCompat;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SPlash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        getWindow().setStatusBarColor(ContextCompat.getColor(SPlash.this,R.color.white));
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                Intent intent = new Intent (SPlash.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },1500);
    }
}