package com.example.gpaometer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView infoButton;
    TextView infoTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.white));
        MediaPlayer mp= MediaPlayer.create(this,R.raw.piano);
        mp.start();
        infoButton = (ImageView) findViewById(R.id.imageView3);
        infoTextView = (TextView) findViewById(R.id.textvieww);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("                  Gpa Scaler").setMessage(
                "                        A+        4.0\n" +
                "                        A          4.0\n" +
                "                        A-         3.7\n" +
                "                        B+        3.3\n" +
                "                        B          3.0\n" +
                "                        B-         2.7\n" +
                "                        C+        2.3\n" +
                "                        C          2.0\n" +
                "                        C-         1.7\n" +
                "                        D+        1.3\n" +
                "                        D          1.0\n" +
                "                        D-         0.7").setPositiveButton("OK",null);
        AlertDialog dialog =  builder.create();
        dialog.getWindow().getAttributes().windowAnimations = R.style.MyDialogAnimation;
        findViewById(R.id.imageView3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
            }
        });

    }

    public void go(View view) {
        Intent i =new Intent(this ,Semesters.class);
        startActivity(i);
    }
}