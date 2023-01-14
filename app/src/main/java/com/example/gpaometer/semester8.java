package com.example.gpaometer;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class semester8 extends SQLiteOpenHelper {

    public static String databaseName = "sem8.db";
    SQLiteDatabase sem8;

    public semester8(Context context) {
        super(context, databaseName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table semester8(subject text ," +
                "grade text,credits text )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists semester8");
        onCreate(db);
    }


    public void createNewSubject(String subject, String grade, String credits) {
        ContentValues row = new ContentValues();
        row.put("subject", subject);
        row.put("grade", grade);
        row.put("credits", credits);
        sem8 = getWritableDatabase();
        sem8.insert("semester8", null, row);
        sem8.close();
    }

    public Cursor fetchAllSubjects() {
        sem8 = getReadableDatabase();
        String query = "SELECT * FROM semester8";
        Cursor c = null;
        if (sem8 != null) {
            c = sem8.rawQuery(query, null);
        }
        return c;
    }

    public void deleteAll() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("semester8", null, null);
        db.execSQL("delete from  " + "semester8");
        db.close();
    }
}
