package com.example.gpaometer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Stack;


public class GPA_Adder<f> extends AppCompatActivity {

    semester1 sem = new semester1(this);
    semester2 sem2 = new semester2(this);
    semester3 sem3 = new semester3(this);
    semester4 sem4 = new semester4(this);
    semester5 sem5 = new semester5(this);
    semester6 sem6 = new semester6(this);
    semester7 sem7 = new semester7(this);
    semester8 sem8 = new semester8(this);

    ArrayList<String> subject1 = new ArrayList<>();
    ArrayList<String> grade1 = new ArrayList<>();
    ArrayList<String> credits1 = new ArrayList<>();

    ArrayList<String> subject2 = new ArrayList<>();
    ArrayList<String> grade2 = new ArrayList<>();
    ArrayList<String> credits2 = new ArrayList<>();

    ArrayList<String> subject3 = new ArrayList<>();
    ArrayList<String> grade3 = new ArrayList<>();
    ArrayList<String> credits3 = new ArrayList<>();

    ArrayList<String> subject4 = new ArrayList<>();
    ArrayList<String> grade4 = new ArrayList<>();
    ArrayList<String> credits4 = new ArrayList<>();

    ArrayList<String> subject5 = new ArrayList<>();
    ArrayList<String> grade5 = new ArrayList<>();
    ArrayList<String> credits5 = new ArrayList<>();

    ArrayList<String> subject6 = new ArrayList<>();
    ArrayList<String> grade6 = new ArrayList<>();
    ArrayList<String> credits6 = new ArrayList<>();

    ArrayList<String> subject7 = new ArrayList<>();
    ArrayList<String> grade7 = new ArrayList<>();
    ArrayList<String> credits7 = new ArrayList<>();

    ArrayList<String> subject8 = new ArrayList<>();
    ArrayList<String> grade8 = new ArrayList<>();
    ArrayList<String> credits8 = new ArrayList<>();



    void display1() {
        Cursor c = sem.fetchAllSubjects();
        if(c.getCount()==0) {
           // Toast.makeText(this,"No Data Recorded",Toast.LENGTH_SHORT).show();
        }
        else {
            while(c.moveToNext()) {
                subject1.add(c.getString(0));
                grade1.add(c.getString(1));
                credits1.add(c.getString(2));
            }
        }
    }

    void display2() {
        Cursor c = sem2.fetchAllSubjects();
        if(c.getCount()==0) {
           // Toast.makeText(this,"No Data Recorded",Toast.LENGTH_SHORT).show();
        }
        else {
            while(c.moveToNext()) {
                subject2.add(c.getString(0));
                grade2.add(c.getString(1));
                credits2.add(c.getString(2));
            }
        }
    }

    void display3() {
        Cursor c = sem3.fetchAllSubjects();
        if(c.getCount()==0) {
           // Toast.makeText(this,"No Data Recorded",Toast.LENGTH_SHORT).show();
        }
        else {
            while(c.moveToNext()) {
                subject3.add(c.getString(0));
                grade3.add(c.getString(1));
                credits3.add(c.getString(2));
            }
        }
    }

    void display4() {
        Cursor c = sem4.fetchAllSubjects();
        if(c.getCount()==0) {
           // Toast.makeText(this,"No Data Recorded",Toast.LENGTH_SHORT).show();
        }
        else {
            while (c.moveToNext()) {
                subject4.add(c.getString(0));
                grade4.add(c.getString(1));
                credits4.add(c.getString(2));
            }
        }

    }

    void display5() {
        Cursor c = sem5.fetchAllSubjects();
        if(c.getCount()==0) {
            //Toast.makeText(this,"No Data Recorded",Toast.LENGTH_SHORT).show();
        }
        else {
            while(c.moveToNext()) {
                subject5.add(c.getString(0));
                grade5.add(c.getString(1));
                credits5.add(c.getString(2));
            }
        }
    }

    void display6() {
        Cursor c = sem6.fetchAllSubjects();
        if(c.getCount()==0) {
            Toast.makeText(this,"No Data Recorded",Toast.LENGTH_SHORT).show();
        }
        else {
            while(c.moveToNext()) {
                subject6.add(c.getString(0));
                grade6.add(c.getString(1));
                credits6.add(c.getString(2));
            }
        }
    }

    void display7() {
        Cursor c = sem7.fetchAllSubjects();
        if(c.getCount()==0) {
          //  Toast.makeText(this,"No Data Recorded",Toast.LENGTH_SHORT).show();
        }
        else {
            while(c.moveToNext()) {
                subject7.add(c.getString(0));
                grade7.add(c.getString(1));
                credits7.add(c.getString(2));
            }
        }
    }

    void display8() {
        Cursor c = sem8.fetchAllSubjects();
        if(c.getCount()==0) {
            //Toast.makeText(this,"No Data Recorded",Toast.LENGTH_SHORT).show();
        }
        else {
            while(c.moveToNext()) {
                subject8.add(c.getString(0));
                grade8.add(c.getString(1));
                credits8.add(c.getString(2));
            }
        }
    }


    public static double Gpa_vals(String s){
        double v=0.0;
        switch (s) {
            case "A":
                v = 4.0;
                break;
            case "A-":
                v = 3.7;
                break;
            case "B+":
                v = 3.3;
                break;
            case "B":
                v = 3.0;
                break;
            case "B-":
                v = 2.7;
                break;
            case "C+":
                v = 2.3;
                break;
            case "C":
                v = 2.0;
                break;
            case "C-":
                v = 1.7;
                break;
            case "D+":
                v = 1.3;
                break;
            case "D":
                v = 1.0;
                break;
            case "D-":
                v = 0.7;
                break;
            case "F":
                v = 0.0;
                break;
            default:
                v = 0.0;
        }
        return v;
    }
    public static int sems(String n) {
        int x=0;
        switch (n){
            case"Semester 1":
                x=1;
                break;
            case"Semester 2":
                x=2;
                break;
            case"Semester 3":
                x=3;
                break;
            case"Semester 4":
                x=4;
                break;
            case"Semester 5":
                x=5;
                break;
            case"Semester 6":
                x=6;
                break;
            case"Semester 7":
                x=7;
                break;
            case"Semester 8":
                x=8;
                break;
        }
        return x;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa_adder);
        getSupportActionBar().hide();
        getWindow().setStatusBarColor(ContextCompat.getColor(GPA_Adder.this, R.color.white));

        String[] Grades = getResources().getStringArray(R.array.grades);
        String[] Credits = getResources().getStringArray(R.array.credits);
        String[] semesters = getResources().getStringArray(R.array.semesters);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, Grades);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, Credits);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, semesters);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner19 = findViewById(R.id.selectSemester);

        display1();
        display2();
        display3();
        display4();
        display5();
        display6();
        display7();
        display8();

        ArrayAdapter g1 = new ArrayAdapter(this, com.airbnb.lottie.R.layout.support_simple_spinner_dropdown_item, grade1);
        ArrayAdapter c1 = new ArrayAdapter(this, com.airbnb.lottie.R.layout.support_simple_spinner_dropdown_item, credits1);


        ArrayAdapter g2 = new ArrayAdapter(this, com.airbnb.lottie.R.layout.support_simple_spinner_dropdown_item, grade2);
        ArrayAdapter c2 = new ArrayAdapter(this, com.airbnb.lottie.R.layout.support_simple_spinner_dropdown_item, credits2);


        ArrayAdapter g3 = new ArrayAdapter(this, com.airbnb.lottie.R.layout.support_simple_spinner_dropdown_item, grade3);
        ArrayAdapter c3 = new ArrayAdapter(this, com.airbnb.lottie.R.layout.support_simple_spinner_dropdown_item, credits3);


        ArrayAdapter g4 = new ArrayAdapter(this, com.airbnb.lottie.R.layout.support_simple_spinner_dropdown_item, grade4);
        ArrayAdapter c4 = new ArrayAdapter(this, com.airbnb.lottie.R.layout.support_simple_spinner_dropdown_item, credits4);


        ArrayAdapter g5 = new ArrayAdapter(this, com.airbnb.lottie.R.layout.support_simple_spinner_dropdown_item, grade5);
        ArrayAdapter c5 = new ArrayAdapter(this, com.airbnb.lottie.R.layout.support_simple_spinner_dropdown_item, credits5);


        ArrayAdapter g6 = new ArrayAdapter(this, com.airbnb.lottie.R.layout.support_simple_spinner_dropdown_item, grade6);
        ArrayAdapter c6 = new ArrayAdapter(this, com.airbnb.lottie.R.layout.support_simple_spinner_dropdown_item, credits6);


        ArrayAdapter g7 = new ArrayAdapter(this, com.airbnb.lottie.R.layout.support_simple_spinner_dropdown_item, grade7);
        ArrayAdapter c7 = new ArrayAdapter(this, com.airbnb.lottie.R.layout.support_simple_spinner_dropdown_item, credits7);


        ArrayAdapter g8 = new ArrayAdapter(this, com.airbnb.lottie.R.layout.support_simple_spinner_dropdown_item, grade8);
        ArrayAdapter c8 = new ArrayAdapter(this, com.airbnb.lottie.R.layout.support_simple_spinner_dropdown_item, credits8);


        Spinner spinner1 = findViewById(R.id.spinner1);
        Spinner spinner2 = findViewById(R.id.spinner2);
        Spinner spinner3 = findViewById(R.id.spinner3);
        Spinner spinner4 = findViewById(R.id.spinner4);
        Spinner spinner5 = findViewById(R.id.spinner5);
        Spinner spinner6 = findViewById(R.id.spinner6);
        Spinner spinner7 = findViewById(R.id.spinner7);
        Spinner spinner8 = findViewById(R.id.spinner8);
        Spinner spinner9 = findViewById(R.id.spinner9);

        Spinner spinner10 = findViewById(R.id.spinner10);
        Spinner spinner11 = findViewById(R.id.spinner11);
        Spinner spinner12 = findViewById(R.id.spinner12);
        Spinner spinner13 = findViewById(R.id.spinner13);
        Spinner spinner14 = findViewById(R.id.spinner14);
        Spinner spinner15 = findViewById(R.id.spinner15);
        Spinner spinner16 = findViewById(R.id.spinner16);
        Spinner spinner17 = findViewById(R.id.spinner17);
        Spinner spinner18 = findViewById(R.id.spinner18);



        Button res_btn = (Button) findViewById(R.id.button3);
        Button calc_btn = (Button) findViewById(R.id.button);
        Button Re_btn = (Button) findViewById(R.id.button9);

        EditText txt1 = (EditText) findViewById(R.id.editTextText9);
        EditText txt2 = (EditText) findViewById(R.id.editTextText2);
        EditText txt3 = (EditText) findViewById(R.id.editTextText10);
        EditText txt4 = (EditText) findViewById(R.id.editTextText11);
        EditText txt5 = (EditText) findViewById(R.id.editTextText13);
        EditText txt6 = (EditText) findViewById(R.id.editTextText12);
        EditText txt7 = (EditText) findViewById(R.id.editTextText14);
        EditText txt8 = (EditText) findViewById(R.id.editTextText16);
        EditText txt9 = (EditText) findViewById(R.id.editTextText15);

        TextView vew_1 = (TextView) findViewById(R.id.textView9);
        TextView vew_2 = (TextView) findViewById(R.id.textView10);

        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);
        spinner4.setAdapter(adapter);
        spinner5.setAdapter(adapter);
        spinner6.setAdapter(adapter);
        spinner9.setAdapter(adapter);
        spinner7.setAdapter(adapter);
        spinner8.setAdapter(adapter);

        spinner10.setAdapter(adapter1);
        spinner11.setAdapter(adapter1);
        spinner12.setAdapter(adapter1);
        spinner13.setAdapter(adapter1);
        spinner14.setAdapter(adapter1);
        spinner15.setAdapter(adapter1);
        spinner16.setAdapter(adapter1);
        spinner17.setAdapter(adapter1);
        spinner18.setAdapter(adapter1);
        spinner19.setAdapter(adapter2);


  //      Intent i = new Intent(this, Semesters.class);
        res_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
                txt4.setText("");
                txt5.setText("");
                txt6.setText("");
                txt7.setText("");
                txt8.setText("");
                txt9.setText("");

                spinner1.setAdapter(adapter);
                spinner2.setAdapter(adapter);
                spinner3.setAdapter(adapter);
                spinner4.setAdapter(adapter);
                spinner5.setAdapter(adapter);
                spinner6.setAdapter(adapter);
                spinner9.setAdapter(adapter);
                spinner7.setAdapter(adapter);
                spinner8.setAdapter(adapter);

                spinner10.setAdapter(adapter1);
                spinner11.setAdapter(adapter1);
                spinner12.setAdapter(adapter1);
                spinner13.setAdapter(adapter1);
                spinner14.setAdapter(adapter1);
                spinner15.setAdapter(adapter1);
                spinner16.setAdapter(adapter1);
                spinner17.setAdapter(adapter1);
                spinner18.setAdapter(adapter1);

                vew_1.setText("0.0");
                vew_2.setText("0");

                if(sems(spinner19.getSelectedItem().toString())==1) {
                    sem.deleteAll();
                }
                else if(sems(spinner19.getSelectedItem().toString())==2) {
                    sem2.deleteAll();
                }
                else if(sems(spinner19.getSelectedItem().toString())==3) {
                    sem3.deleteAll();
                }
                else if(sems(spinner19.getSelectedItem().toString())==4) {
                    sem4.deleteAll();
                }
                else if(sems(spinner19.getSelectedItem().toString())==5) {
                    sem5.deleteAll();
                }
                else if(sems(spinner19.getSelectedItem().toString())==6) {
                    sem6.deleteAll();
                }
                else if(sems(spinner19.getSelectedItem().toString())==7) {
                    sem7.deleteAll();
                }
                else if(sems(spinner19.getSelectedItem().toString())==8) {
                    sem8.deleteAll();
                }
            }
        });

        calc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int cre_1 = Integer.parseInt(spinner10.getSelectedItem().toString());
                int cre_2 = Integer.parseInt(spinner11.getSelectedItem().toString());
                int cre_3 = Integer.parseInt(spinner12.getSelectedItem().toString());
                int cre_4 = Integer.parseInt(spinner13.getSelectedItem().toString());
                int cre_5 = Integer.parseInt(spinner14.getSelectedItem().toString());
                int cre_6 = Integer.parseInt(spinner15.getSelectedItem().toString());
                int cre_7 = Integer.parseInt(spinner16.getSelectedItem().toString());
                int cre_8 = Integer.parseInt(spinner17.getSelectedItem().toString());
                int cre_9 = Integer.parseInt(spinner18.getSelectedItem().toString());

                int sum_hours = cre_1 + cre_2 + cre_3 + cre_4 + cre_5 + cre_6 + cre_7 + cre_8 + cre_9;

                vew_2.setText(String.valueOf(sum_hours));

                double spin1 = Gpa_vals(spinner1.getSelectedItem().toString());
                double spin2 = Gpa_vals(spinner2.getSelectedItem().toString());
                double spin3 = Gpa_vals(spinner3.getSelectedItem().toString());
                double spin4 = Gpa_vals(spinner4.getSelectedItem().toString());
                double spin5 = Gpa_vals(spinner5.getSelectedItem().toString());
                double spin6 = Gpa_vals(spinner6.getSelectedItem().toString());
                double spin7 = Gpa_vals(spinner7.getSelectedItem().toString());
                double spin8 = Gpa_vals(spinner8.getSelectedItem().toString());
                double spin9 = Gpa_vals(spinner9.getSelectedItem().toString());

                double Gpa = ((spin2 * cre_1) + (spin1 * cre_2) + (spin3 * cre_3) + (spin4 * cre_4) + (spin5 * cre_6) + (spin6 * cre_5)
                        + (spin9 * cre_8) + (spin8 * cre_7) + (spin7 * cre_9)) / sum_hours;

                double round = Math.round(Gpa * 100) / 100.0;

                vew_1.setText(String.valueOf(round));

                if(sems(spinner19.getSelectedItem().toString())==1) {

                    sem.createNewSubject(txt1.getText().toString().trim(), spinner2.getSelectedItem().toString().trim(), spinner10.getSelectedItem().toString().trim());
                    sem.createNewSubject(txt2.getText().toString().trim(), spinner1.getSelectedItem().toString().trim(), spinner11.getSelectedItem().toString().trim());
                    sem.createNewSubject(txt3.getText().toString().trim(), spinner3.getSelectedItem().toString().trim(), spinner12.getSelectedItem().toString().trim());
                    sem.createNewSubject(txt4.getText().toString().trim(), spinner4.getSelectedItem().toString().trim(), spinner13.getSelectedItem().toString().trim());
                    sem.createNewSubject(txt5.getText().toString().trim(), spinner5.getSelectedItem().toString().trim(), spinner15.getSelectedItem().toString().trim());
                    sem.createNewSubject(txt6.getText().toString().trim(), spinner6.getSelectedItem().toString().trim(), spinner14.getSelectedItem().toString().trim());
                    sem.createNewSubject(txt7.getText().toString().trim(), spinner7.getSelectedItem().toString().trim(), spinner18.getSelectedItem().toString().trim());
                    sem.createNewSubject(txt8.getText().toString().trim(), spinner8.getSelectedItem().toString().trim(), spinner16.getSelectedItem().toString().trim());
                    sem.createNewSubject(txt9.getText().toString().trim(), spinner9.getSelectedItem().toString().trim(), spinner17.getSelectedItem().toString().trim());
                }
                else if(sems(spinner19.getSelectedItem().toString())==2) {
                    sem2.createNewSubject(txt1.getText().toString().trim(), spinner2.getSelectedItem().toString().trim(), spinner10.getSelectedItem().toString().trim());
                    sem2.createNewSubject(txt2.getText().toString().trim(), spinner1.getSelectedItem().toString().trim(), spinner11.getSelectedItem().toString().trim());
                    sem2.createNewSubject(txt3.getText().toString().trim(), spinner3.getSelectedItem().toString().trim(), spinner12.getSelectedItem().toString().trim());
                    sem2.createNewSubject(txt4.getText().toString().trim(), spinner4.getSelectedItem().toString().trim(), spinner13.getSelectedItem().toString().trim());
                    sem2.createNewSubject(txt5.getText().toString().trim(), spinner5.getSelectedItem().toString().trim(), spinner15.getSelectedItem().toString().trim());
                    sem2.createNewSubject(txt6.getText().toString().trim(), spinner6.getSelectedItem().toString().trim(), spinner14.getSelectedItem().toString().trim());
                    sem2.createNewSubject(txt7.getText().toString().trim(), spinner7.getSelectedItem().toString().trim(), spinner18.getSelectedItem().toString().trim());
                    sem2.createNewSubject(txt8.getText().toString().trim(), spinner8.getSelectedItem().toString().trim(), spinner16.getSelectedItem().toString().trim());
                    sem2.createNewSubject(txt9.getText().toString().trim(), spinner9.getSelectedItem().toString().trim(), spinner17.getSelectedItem().toString().trim());
                }
                else if(sems(spinner19.getSelectedItem().toString())==3) {

                    sem3.createNewSubject(txt1.getText().toString().trim(), spinner2.getSelectedItem().toString().trim(), spinner10.getSelectedItem().toString().trim());
                    sem3.createNewSubject(txt2.getText().toString().trim(), spinner1.getSelectedItem().toString().trim(), spinner11.getSelectedItem().toString().trim());
                    sem3.createNewSubject(txt3.getText().toString().trim(), spinner3.getSelectedItem().toString().trim(), spinner12.getSelectedItem().toString().trim());
                    sem3.createNewSubject(txt4.getText().toString().trim(), spinner4.getSelectedItem().toString().trim(), spinner13.getSelectedItem().toString().trim());
                    sem3.createNewSubject(txt5.getText().toString().trim(), spinner5.getSelectedItem().toString().trim(), spinner15.getSelectedItem().toString().trim());
                    sem3.createNewSubject(txt6.getText().toString().trim(), spinner6.getSelectedItem().toString().trim(), spinner14.getSelectedItem().toString().trim());
                    sem3.createNewSubject(txt7.getText().toString().trim(), spinner7.getSelectedItem().toString().trim(), spinner18.getSelectedItem().toString().trim());
                    sem3.createNewSubject(txt8.getText().toString().trim(), spinner8.getSelectedItem().toString().trim(), spinner16.getSelectedItem().toString().trim());
                    sem3.createNewSubject(txt9.getText().toString().trim(), spinner9.getSelectedItem().toString().trim(), spinner17.getSelectedItem().toString().trim());
                }
                else if(sems(spinner19.getSelectedItem().toString())==4) {
                    sem4.createNewSubject(txt1.getText().toString().trim(), spinner2.getSelectedItem().toString().trim(), spinner10.getSelectedItem().toString().trim());
                    sem4.createNewSubject(txt2.getText().toString().trim(), spinner1.getSelectedItem().toString().trim(), spinner11.getSelectedItem().toString().trim());
                    sem4.createNewSubject(txt3.getText().toString().trim(), spinner3.getSelectedItem().toString().trim(), spinner12.getSelectedItem().toString().trim());
                    sem4.createNewSubject(txt4.getText().toString().trim(), spinner4.getSelectedItem().toString().trim(), spinner13.getSelectedItem().toString().trim());
                    sem4.createNewSubject(txt5.getText().toString().trim(), spinner5.getSelectedItem().toString().trim(), spinner15.getSelectedItem().toString().trim());
                    sem4.createNewSubject(txt6.getText().toString().trim(), spinner6.getSelectedItem().toString().trim(), spinner14.getSelectedItem().toString().trim());
                    sem4.createNewSubject(txt7.getText().toString().trim(), spinner7.getSelectedItem().toString().trim(), spinner18.getSelectedItem().toString().trim());
                    sem4.createNewSubject(txt8.getText().toString().trim(), spinner8.getSelectedItem().toString().trim(), spinner16.getSelectedItem().toString().trim());
                    sem4.createNewSubject(txt9.getText().toString().trim(), spinner9.getSelectedItem().toString().trim(), spinner17.getSelectedItem().toString().trim());
                }
                else if(sems(spinner19.getSelectedItem().toString())==5) {
                    sem5.createNewSubject(txt1.getText().toString().trim(), spinner2.getSelectedItem().toString().trim(), spinner10.getSelectedItem().toString().trim());
                    sem5.createNewSubject(txt2.getText().toString().trim(), spinner1.getSelectedItem().toString().trim(), spinner11.getSelectedItem().toString().trim());
                    sem5.createNewSubject(txt3.getText().toString().trim(), spinner3.getSelectedItem().toString().trim(), spinner12.getSelectedItem().toString().trim());
                    sem5.createNewSubject(txt4.getText().toString().trim(), spinner4.getSelectedItem().toString().trim(), spinner13.getSelectedItem().toString().trim());
                    sem5.createNewSubject(txt5.getText().toString().trim(), spinner5.getSelectedItem().toString().trim(), spinner15.getSelectedItem().toString().trim());
                    sem5.createNewSubject(txt6.getText().toString().trim(), spinner6.getSelectedItem().toString().trim(), spinner14.getSelectedItem().toString().trim());
                    sem5.createNewSubject(txt7.getText().toString().trim(), spinner7.getSelectedItem().toString().trim(), spinner18.getSelectedItem().toString().trim());
                    sem5.createNewSubject(txt8.getText().toString().trim(), spinner8.getSelectedItem().toString().trim(), spinner16.getSelectedItem().toString().trim());
                    sem5.createNewSubject(txt9.getText().toString().trim(), spinner9.getSelectedItem().toString().trim(), spinner17.getSelectedItem().toString().trim());
                }
                else if(sems(spinner19.getSelectedItem().toString())==6) {
                    sem6.createNewSubject(txt1.getText().toString().trim(), spinner2.getSelectedItem().toString().trim(), spinner10.getSelectedItem().toString().trim());
                    sem6.createNewSubject(txt2.getText().toString().trim(), spinner1.getSelectedItem().toString().trim(), spinner11.getSelectedItem().toString().trim());
                    sem6.createNewSubject(txt3.getText().toString().trim(), spinner3.getSelectedItem().toString().trim(), spinner12.getSelectedItem().toString().trim());
                    sem6.createNewSubject(txt4.getText().toString().trim(), spinner4.getSelectedItem().toString().trim(), spinner13.getSelectedItem().toString().trim());
                    sem6.createNewSubject(txt5.getText().toString().trim(), spinner5.getSelectedItem().toString().trim(), spinner15.getSelectedItem().toString().trim());
                    sem6.createNewSubject(txt6.getText().toString().trim(), spinner6.getSelectedItem().toString().trim(), spinner14.getSelectedItem().toString().trim());
                    sem6.createNewSubject(txt7.getText().toString().trim(), spinner7.getSelectedItem().toString().trim(), spinner18.getSelectedItem().toString().trim());
                    sem6.createNewSubject(txt8.getText().toString().trim(), spinner8.getSelectedItem().toString().trim(), spinner16.getSelectedItem().toString().trim());
                    sem6.createNewSubject(txt9.getText().toString().trim(), spinner9.getSelectedItem().toString().trim(), spinner17.getSelectedItem().toString().trim());
                }
                else if(sems(spinner19.getSelectedItem().toString())==7) {
                    sem7.createNewSubject(txt1.getText().toString().trim(), spinner2.getSelectedItem().toString().trim(), spinner10.getSelectedItem().toString().trim());
                    sem7.createNewSubject(txt2.getText().toString().trim(), spinner1.getSelectedItem().toString().trim(), spinner11.getSelectedItem().toString().trim());
                    sem7.createNewSubject(txt3.getText().toString().trim(), spinner3.getSelectedItem().toString().trim(), spinner12.getSelectedItem().toString().trim());
                    sem7.createNewSubject(txt4.getText().toString().trim(), spinner4.getSelectedItem().toString().trim(), spinner13.getSelectedItem().toString().trim());
                    sem7.createNewSubject(txt5.getText().toString().trim(), spinner5.getSelectedItem().toString().trim(), spinner15.getSelectedItem().toString().trim());
                    sem7.createNewSubject(txt6.getText().toString().trim(), spinner6.getSelectedItem().toString().trim(), spinner14.getSelectedItem().toString().trim());
                    sem7.createNewSubject(txt7.getText().toString().trim(), spinner7.getSelectedItem().toString().trim(), spinner18.getSelectedItem().toString().trim());
                    sem7.createNewSubject(txt8.getText().toString().trim(), spinner8.getSelectedItem().toString().trim(), spinner16.getSelectedItem().toString().trim());
                    sem7.createNewSubject(txt9.getText().toString().trim(), spinner9.getSelectedItem().toString().trim(), spinner17.getSelectedItem().toString().trim());
                }
                else if(sems(spinner19.getSelectedItem().toString())==8) {
                    sem8.createNewSubject(txt1.getText().toString().trim(), spinner2.getSelectedItem().toString().trim(), spinner10.getSelectedItem().toString().trim());
                    sem8.createNewSubject(txt2.getText().toString().trim(), spinner1.getSelectedItem().toString().trim(), spinner11.getSelectedItem().toString().trim());
                    sem8.createNewSubject(txt3.getText().toString().trim(), spinner3.getSelectedItem().toString().trim(), spinner12.getSelectedItem().toString().trim());
                    sem8.createNewSubject(txt4.getText().toString().trim(), spinner4.getSelectedItem().toString().trim(), spinner13.getSelectedItem().toString().trim());
                    sem8.createNewSubject(txt5.getText().toString().trim(), spinner5.getSelectedItem().toString().trim(), spinner15.getSelectedItem().toString().trim());
                    sem8.createNewSubject(txt6.getText().toString().trim(), spinner6.getSelectedItem().toString().trim(), spinner14.getSelectedItem().toString().trim());
                    sem8.createNewSubject(txt7.getText().toString().trim(), spinner7.getSelectedItem().toString().trim(), spinner18.getSelectedItem().toString().trim());
                    sem8.createNewSubject(txt8.getText().toString().trim(), spinner8.getSelectedItem().toString().trim(), spinner16.getSelectedItem().toString().trim());
                    sem8.createNewSubject(txt9.getText().toString().trim(), spinner9.getSelectedItem().toString().trim(), spinner17.getSelectedItem().toString().trim());
                }
            }
        });
        Re_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sems(spinner19.getSelectedItem().toString())==1) {
                    txt1.setText(subject1.get(0).toString().trim());
                    txt2.setText(subject1.get(1).toString().trim());
                    txt3.setText(subject1.get(2).toString().trim());
                    txt4.setText(subject1.get(3).toString().trim());
                    txt5.setText(subject1.get(4).toString().trim());
                    txt6.setText(subject1.get(5).toString().trim());
                    txt7.setText(subject1.get(6).toString().trim());
                    txt8.setText(subject1.get(7).toString().trim());
                    txt9.setText(subject1.get(8).toString().trim());

                    spinner2.setAdapter(g1);
                    spinner1.setAdapter(g1);
                    spinner3.setAdapter(g1);
                    spinner4.setAdapter(g1);
                    spinner5.setAdapter(g1);
                    spinner6.setAdapter(g1);
                    spinner9.setAdapter(g1);
                    spinner8.setAdapter(g1);
                    spinner7.setAdapter(g1);

                    spinner2.setSelection(0);
                    spinner1.setSelection(1);
                    spinner3.setSelection(2);
                    spinner4.setSelection(3);
                    spinner5.setSelection(4);
                    spinner6.setSelection(5);
                    spinner9.setSelection(6);
                    spinner8.setSelection(7);
                    spinner7.setSelection(8);

                    spinner10.setAdapter(c1);
                    spinner11.setAdapter(c1);
                    spinner12.setAdapter(c1);
                    spinner13.setAdapter(c1);
                    spinner15.setAdapter(c1);
                    spinner14.setAdapter(c1);
                    spinner18.setAdapter(c1);
                    spinner16.setAdapter(c1);
                    spinner17.setAdapter(c1);

                    spinner10.setSelection(0);
                    spinner11.setSelection(1);
                    spinner12.setSelection(2);
                    spinner13.setSelection(3);
                    spinner15.setSelection(4);
                    spinner14.setSelection(5);
                    spinner18.setSelection(6);
                    spinner16.setSelection(7);
                    spinner17.setSelection(8);
                }

                else if(sems(spinner19.getSelectedItem().toString())==2) {
                    txt1.setText(subject2.get(0).toString().trim());
                    txt2.setText(subject2.get(1).toString().trim());
                    txt3.setText(subject2.get(2).toString().trim());
                    txt4.setText(subject2.get(3).toString().trim());
                    txt5.setText(subject2.get(4).toString().trim());
                    txt6.setText(subject2.get(5).toString().trim());
                    txt7.setText(subject2.get(6).toString().trim());
                    txt8.setText(subject2.get(7).toString().trim());
                    txt9.setText(subject2.get(8).toString().trim());

                    spinner2.setAdapter(g2);
                    spinner1.setAdapter(g2);
                    spinner3.setAdapter(g2);
                    spinner4.setAdapter(g2);
                    spinner5.setAdapter(g2);
                    spinner6.setAdapter(g2);
                    spinner9.setAdapter(g2);
                    spinner8.setAdapter(g2);
                    spinner7.setAdapter(g2);

                    spinner2.setSelection(0);
                    spinner1.setSelection(1);
                    spinner3.setSelection(2);
                    spinner4.setSelection(3);
                    spinner5.setSelection(4);
                    spinner6.setSelection(5);
                    spinner9.setSelection(6);
                    spinner8.setSelection(7);
                    spinner7.setSelection(8);

                    spinner10.setAdapter(c2);
                    spinner11.setAdapter(c2);
                    spinner12.setAdapter(c2);
                    spinner13.setAdapter(c2);
                    spinner15.setAdapter(c2);
                    spinner14.setAdapter(c2);
                    spinner18.setAdapter(c2);
                    spinner16.setAdapter(c2);
                    spinner17.setAdapter(c2);

                    spinner10.setSelection(0);
                    spinner11.setSelection(1);
                    spinner12.setSelection(2);
                    spinner13.setSelection(3);
                    spinner15.setSelection(4);
                    spinner14.setSelection(5);
                    spinner18.setSelection(6);
                    spinner16.setSelection(7);
                    spinner17.setSelection(8);
                }

                else if(sems(spinner19.getSelectedItem().toString())==3) {
                    txt1.setText(subject3.get(0).toString().trim());
                    txt2.setText(subject3.get(1).toString().trim());
                    txt3.setText(subject3.get(2).toString().trim());
                    txt4.setText(subject3.get(3).toString().trim());
                    txt5.setText(subject3.get(4).toString().trim());
                    txt6.setText(subject3.get(5).toString().trim());
                    txt7.setText(subject3.get(6).toString().trim());
                    txt8.setText(subject3.get(7).toString().trim());
                    txt9.setText(subject3.get(8).toString().trim());

                    spinner2.setAdapter(g3);
                    spinner1.setAdapter(g3);
                    spinner3.setAdapter(g3);
                    spinner4.setAdapter(g3);
                    spinner5.setAdapter(g3);
                    spinner6.setAdapter(g3);
                    spinner9.setAdapter(g3);
                    spinner8.setAdapter(g3);
                    spinner7.setAdapter(g3);

                    spinner2.setSelection(0);
                    spinner1.setSelection(1);
                    spinner3.setSelection(2);
                    spinner4.setSelection(3);
                    spinner5.setSelection(4);
                    spinner6.setSelection(5);
                    spinner9.setSelection(6);
                    spinner8.setSelection(7);
                    spinner7.setSelection(8);

                    spinner10.setAdapter(c3);
                    spinner11.setAdapter(c3);
                    spinner12.setAdapter(c3);
                    spinner13.setAdapter(c3);
                    spinner15.setAdapter(c3);
                    spinner14.setAdapter(c3);
                    spinner18.setAdapter(c3);
                    spinner16.setAdapter(c3);
                    spinner17.setAdapter(c3);

                    spinner10.setSelection(0);
                    spinner11.setSelection(1);
                    spinner12.setSelection(2);
                    spinner13.setSelection(3);
                    spinner15.setSelection(4);
                    spinner14.setSelection(5);
                    spinner18.setSelection(6);
                    spinner16.setSelection(7);
                    spinner17.setSelection(8);
                }

                else if(sems(spinner19.getSelectedItem().toString())==4) {
                    txt1.setText(subject4.get(0).toString().trim());
                    txt2.setText(subject4.get(1).toString().trim());
                    txt3.setText(subject4.get(2).toString().trim());
                    txt4.setText(subject4.get(3).toString().trim());
                    txt5.setText(subject4.get(4).toString().trim());
                    txt6.setText(subject4.get(5).toString().trim());
                    txt7.setText(subject4.get(6).toString().trim());
                    txt8.setText(subject4.get(7).toString().trim());
                    txt9.setText(subject4.get(8).toString().trim());

                    spinner2.setAdapter(g4);
                    spinner1.setAdapter(g4);
                    spinner3.setAdapter(g4);
                    spinner4.setAdapter(g4);
                    spinner5.setAdapter(g4);
                    spinner6.setAdapter(g4);
                    spinner9.setAdapter(g4);
                    spinner8.setAdapter(g4);
                    spinner7.setAdapter(g4);

                    spinner2.setSelection(0);
                    spinner1.setSelection(1);
                    spinner3.setSelection(2);
                    spinner4.setSelection(3);
                    spinner5.setSelection(4);
                    spinner6.setSelection(5);
                    spinner9.setSelection(6);
                    spinner8.setSelection(7);
                    spinner7.setSelection(8);

                    spinner10.setAdapter(c4);
                    spinner11.setAdapter(c4);
                    spinner12.setAdapter(c4);
                    spinner13.setAdapter(c4);
                    spinner15.setAdapter(c4);
                    spinner14.setAdapter(c4);
                    spinner18.setAdapter(c4);
                    spinner16.setAdapter(c4);
                    spinner17.setAdapter(c4);

                    spinner10.setSelection(0);
                    spinner11.setSelection(1);
                    spinner12.setSelection(2);
                    spinner13.setSelection(3);
                    spinner15.setSelection(4);
                    spinner14.setSelection(5);
                    spinner18.setSelection(6);
                    spinner16.setSelection(7);
                    spinner17.setSelection(8);
                }

                else if(sems(spinner19.getSelectedItem().toString())==5) {
                    txt1.setText(subject5.get(0).toString().trim());
                    txt2.setText(subject5.get(1).toString().trim());
                    txt3.setText(subject5.get(2).toString().trim());
                    txt4.setText(subject5.get(3).toString().trim());
                    txt5.setText(subject5.get(4).toString().trim());
                    txt6.setText(subject5.get(5).toString().trim());
                    txt7.setText(subject5.get(6).toString().trim());
                    txt8.setText(subject5.get(7).toString().trim());
                    txt9.setText(subject5.get(8).toString().trim());

                    spinner2.setAdapter(g5);
                    spinner1.setAdapter(g5);
                    spinner3.setAdapter(g5);
                    spinner4.setAdapter(g5);
                    spinner5.setAdapter(g5);
                    spinner6.setAdapter(g5);
                    spinner9.setAdapter(g5);
                    spinner8.setAdapter(g5);
                    spinner7.setAdapter(g5);

                    spinner2.setSelection(0);
                    spinner1.setSelection(1);
                    spinner3.setSelection(2);
                    spinner4.setSelection(3);
                    spinner5.setSelection(4);
                    spinner6.setSelection(5);
                    spinner9.setSelection(6);
                    spinner8.setSelection(7);
                    spinner7.setSelection(8);

                    spinner10.setAdapter(c5);
                    spinner11.setAdapter(c5);
                    spinner12.setAdapter(c5);
                    spinner13.setAdapter(c5);
                    spinner15.setAdapter(c5);
                    spinner14.setAdapter(c5);
                    spinner18.setAdapter(c5);
                    spinner16.setAdapter(c5);
                    spinner17.setAdapter(c5);

                    spinner10.setSelection(0);
                    spinner11.setSelection(1);
                    spinner12.setSelection(2);
                    spinner13.setSelection(3);
                    spinner15.setSelection(4);
                    spinner14.setSelection(5);
                    spinner18.setSelection(6);
                    spinner16.setSelection(7);
                    spinner17.setSelection(8);
                }

                else if(sems(spinner19.getSelectedItem().toString())==6) {
                    txt1.setText(subject6.get(0).toString().trim());
                    txt2.setText(subject6.get(1).toString().trim());
                    txt3.setText(subject6.get(2).toString().trim());
                    txt4.setText(subject6.get(3).toString().trim());
                    txt5.setText(subject6.get(4).toString().trim());
                    txt6.setText(subject6.get(5).toString().trim());
                    txt7.setText(subject6.get(6).toString().trim());
                    txt8.setText(subject6.get(7).toString().trim());
                    txt9.setText(subject6.get(8).toString().trim());

                    spinner2.setAdapter(g6);
                    spinner1.setAdapter(g6);
                    spinner3.setAdapter(g6);
                    spinner4.setAdapter(g6);
                    spinner5.setAdapter(g6);
                    spinner6.setAdapter(g6);
                    spinner9.setAdapter(g6);
                    spinner8.setAdapter(g6);
                    spinner7.setAdapter(g6);

                    spinner2.setSelection(0);
                    spinner1.setSelection(1);
                    spinner3.setSelection(2);
                    spinner4.setSelection(3);
                    spinner5.setSelection(4);
                    spinner6.setSelection(5);
                    spinner9.setSelection(6);
                    spinner8.setSelection(7);
                    spinner7.setSelection(8);

                    spinner10.setAdapter(c6);
                    spinner11.setAdapter(c6);
                    spinner12.setAdapter(c6);
                    spinner13.setAdapter(c6);
                    spinner15.setAdapter(c6);
                    spinner14.setAdapter(c6);
                    spinner18.setAdapter(c6);
                    spinner16.setAdapter(c6);
                    spinner17.setAdapter(c6);

                    spinner10.setSelection(0);
                    spinner11.setSelection(1);
                    spinner12.setSelection(2);
                    spinner13.setSelection(3);
                    spinner15.setSelection(4);
                    spinner14.setSelection(5);
                    spinner18.setSelection(6);
                    spinner16.setSelection(7);
                    spinner17.setSelection(8);
                }

                else if(sems(spinner19.getSelectedItem().toString())==7) {
                    txt1.setText(subject7.get(0).toString().trim());
                    txt2.setText(subject7.get(1).toString().trim());
                    txt3.setText(subject7.get(2).toString().trim());
                    txt4.setText(subject7.get(3).toString().trim());
                    txt5.setText(subject7.get(4).toString().trim());
                    txt6.setText(subject7.get(5).toString().trim());
                    txt7.setText(subject7.get(6).toString().trim());
                    txt8.setText(subject7.get(7).toString().trim());
                    txt9.setText(subject7.get(8).toString().trim());

                    spinner2.setAdapter(g7);
                    spinner1.setAdapter(g7);
                    spinner3.setAdapter(g7);
                    spinner4.setAdapter(g7);
                    spinner5.setAdapter(g7);
                    spinner6.setAdapter(g7);
                    spinner9.setAdapter(g7);
                    spinner8.setAdapter(g7);
                    spinner7.setAdapter(g7);

                    spinner2.setSelection(0);
                    spinner1.setSelection(1);
                    spinner3.setSelection(2);
                    spinner4.setSelection(3);
                    spinner5.setSelection(4);
                    spinner6.setSelection(5);
                    spinner9.setSelection(6);
                    spinner8.setSelection(7);
                    spinner7.setSelection(8);

                    spinner10.setAdapter(c7);
                    spinner11.setAdapter(c7);
                    spinner12.setAdapter(c7);
                    spinner13.setAdapter(c7);
                    spinner15.setAdapter(c7);
                    spinner14.setAdapter(c7);
                    spinner18.setAdapter(c7);
                    spinner16.setAdapter(c7);
                    spinner17.setAdapter(c7);

                    spinner10.setSelection(0);
                    spinner11.setSelection(1);
                    spinner12.setSelection(2);
                    spinner13.setSelection(3);
                    spinner15.setSelection(4);
                    spinner14.setSelection(5);
                    spinner18.setSelection(6);
                    spinner16.setSelection(7);
                    spinner17.setSelection(8);
                }

                else if(sems(spinner19.getSelectedItem().toString())==8) {
                    txt1.setText(subject8.get(0).toString().trim());
                    txt2.setText(subject8.get(1).toString().trim());
                    txt3.setText(subject8.get(2).toString().trim());
                    txt4.setText(subject8.get(3).toString().trim());
                    txt5.setText(subject8.get(4).toString().trim());
                    txt6.setText(subject8.get(5).toString().trim());
                    txt7.setText(subject8.get(6).toString().trim());
                    txt8.setText(subject8.get(7).toString().trim());
                    txt9.setText(subject8.get(8).toString().trim());

                    spinner2.setAdapter(g8);
                    spinner1.setAdapter(g8);
                    spinner3.setAdapter(g8);
                    spinner4.setAdapter(g8);
                    spinner5.setAdapter(g8);
                    spinner6.setAdapter(g8);
                    spinner9.setAdapter(g8);
                    spinner8.setAdapter(g8);
                    spinner7.setAdapter(g8);

                    spinner2.setSelection(0);
                    spinner1.setSelection(1);
                    spinner3.setSelection(2);
                    spinner4.setSelection(3);
                    spinner5.setSelection(4);
                    spinner6.setSelection(5);
                    spinner9.setSelection(6);
                    spinner8.setSelection(7);
                    spinner7.setSelection(8);

                    spinner10.setAdapter(c8);
                    spinner11.setAdapter(c8);
                    spinner12.setAdapter(c8);
                    spinner13.setAdapter(c8);
                    spinner15.setAdapter(c8);
                    spinner14.setAdapter(c8);
                    spinner18.setAdapter(c8);
                    spinner16.setAdapter(c8);
                    spinner17.setAdapter(c8);

                    spinner10.setSelection(0);
                    spinner11.setSelection(1);
                    spinner12.setSelection(2);
                    spinner13.setSelection(3);
                    spinner15.setSelection(4);
                    spinner14.setSelection(5);
                    spinner18.setSelection(6);
                    spinner16.setSelection(7);
                    spinner17.setSelection(8);
                }
            }
        });
    }



}
