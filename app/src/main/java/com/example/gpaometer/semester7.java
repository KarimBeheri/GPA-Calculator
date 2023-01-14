package com.example.gpaometer;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class semester7 extends SQLiteOpenHelper {

    public static String databaseName = "sem7.db";
    SQLiteDatabase sem7;

    public semester7(Context context) {
        super(context, databaseName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table semester7(subject text ," +
                "grade text,credits text )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists semester7");
        onCreate(db);
    }


    public void createNewSubject(String subject, String grade, String credits) {
        ContentValues row = new ContentValues();
        row.put("subject", subject);
        row.put("grade", grade);
        row.put("credits", credits);
        sem7 = getWritableDatabase();
        sem7.insert("semester7", null, row);
        sem7.close();
    }

    public Cursor fetchAllSubjects() {
        sem7 = getReadableDatabase();
        String query = "SELECT * FROM semester7";
        Cursor c = null;
        if (sem7 != null) {
            c = sem7.rawQuery(query, null);
        }
        return c;
    }

    public void deleteAll() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("semester7", null, null);
        db.execSQL("delete from  " + "semester7");
        db.close();
    }
}
