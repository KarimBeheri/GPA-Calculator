package com.example.gpaometer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Semesters extends AppCompatActivity  {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semesters);
        getSupportActionBar().hide();
        getWindow().setStatusBarColor(ContextCompat.getColor(Semesters.this, R.color.white));

    }


    public void go1(View view) {

        Intent i =new Intent(this ,GPA_Adder.class);
        startActivity(i);
    }
    public void go2(View view) {
        Intent i = new Intent(this, GPA_Adder.class);
        startActivity(i);
    }
    public void go3(View view) {
        Intent i =new Intent(this ,GPA_Adder.class);
        startActivity(i);

    }
    public void go4(View view) {
        Intent i =new Intent(this ,GPA_Adder.class);
        startActivity(i);

    }
    public void go5(View view) {
        Intent i =new Intent(this ,GPA_Adder.class);
        startActivity(i);

    }
    public void go6(View view) {
        Intent i =new Intent(this ,GPA_Adder.class);
        startActivity(i);

    }
    public void go7(View view) {
        Intent i =new Intent(this ,GPA_Adder.class);
        startActivity(i);

    }
    public void go8(View view) {
        Intent i =new Intent(this ,GPA_Adder.class);
        startActivity(i);
    }


}