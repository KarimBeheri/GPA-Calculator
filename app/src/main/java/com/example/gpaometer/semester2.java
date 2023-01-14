package com.example.gpaometer;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class semester2 extends SQLiteOpenHelper {

    public static String databaseName = "sem2.db";
    SQLiteDatabase sem2;

    public semester2(Context context) {
        super(context, databaseName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table semester2(subject text ," +
                "grade text,credits text )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists semester2");
        onCreate(db);
    }


    public void createNewSubject(String subject, String grade, String credits) {
        ContentValues row = new ContentValues();
        row.put("subject", subject);
        row.put("grade", grade);
        row.put("credits", credits);
        sem2 = getWritableDatabase();
        sem2.insert("semester2", null, row);
        sem2.close();
    }

    public Cursor fetchAllSubjects() {
        sem2 = getReadableDatabase();
        String query = "SELECT * FROM semester2";
        Cursor c = null;
        if (sem2 != null) {
            c = sem2.rawQuery(query, null);
        }
        return c;
    }

    public void deleteAll() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("semester2", null, null);
        db.execSQL("delete from  " + "semester2");
        db.close();
    }
}