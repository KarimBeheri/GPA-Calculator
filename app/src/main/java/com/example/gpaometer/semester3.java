package com.example.gpaometer;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class semester3 extends SQLiteOpenHelper {

    public static String databaseName = "sem3.db";
    SQLiteDatabase sem3;

    public semester3(Context context) {
        super(context, databaseName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table semester3(subject text ," +
                "grade text,credits text )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists semester3");
        onCreate(db);
    }


    public void createNewSubject(String subject, String grade, String credits) {
        ContentValues row = new ContentValues();
        row.put("subject", subject);
        row.put("grade", grade);
        row.put("credits", credits);
        sem3 = getWritableDatabase();
        sem3.insert("semester3", null, row);
        sem3.close();
    }

    public Cursor fetchAllSubjects() {
        sem3 = getReadableDatabase();
        String query = "SELECT * FROM semester3";
        Cursor c = null;
        if (sem3 != null) {
            c = sem3.rawQuery(query, null);
        }
        return c;
    }

    public void deleteAll() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("semester3", null, null);
        db.execSQL("delete from  " + "semester3");
        db.close();
    }
}
