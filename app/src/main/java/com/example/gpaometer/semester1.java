package com.example.gpaometer;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class semester1 extends SQLiteOpenHelper {

    public static String databaseName = "sem.db";
    SQLiteDatabase sem;

    public semester1(Context context) {
        super (context,databaseName,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table semester1(subject text ," +
                "grade text,credits text )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion) {
        db.execSQL("drop table if exists semester1");
        onCreate(db);
    }


    public void createNewSubject(String subject,String grade,String credits) {
        ContentValues row = new ContentValues();
        row.put("subject",subject);
        row.put("grade",grade);
        row.put("credits",credits);
        sem = getWritableDatabase();
        sem.insert("semester1",null,row);
        sem.close();
    }

    public Cursor fetchAllSubjects() {
        sem = getReadableDatabase();
        String query = "SELECT * FROM semester1";
        Cursor c =null;
        if(sem != null) {
            c = sem.rawQuery(query,null);
        }
        return c;
    }
    public void deleteAll()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("semester1",null,null);
        db.execSQL("delete from  "+ "semester1");
        db.close();
    }

}
