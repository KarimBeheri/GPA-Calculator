package com.example.gpaometer;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class semester6 extends SQLiteOpenHelper {

    public static String databaseName = "sem6.db";
    SQLiteDatabase sem6;

    public semester6(Context context) {
        super(context, databaseName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table semester6(subject text ," +
                "grade text,credits text )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists semester6");
        onCreate(db);
    }


    public void createNewSubject(String subject, String grade, String credits) {
        ContentValues row = new ContentValues();
        row.put("subject", subject);
        row.put("grade", grade);
        row.put("credits", credits);
        sem6 = getWritableDatabase();
        sem6.insert("semester6", null, row);
        sem6.close();
    }

    public Cursor fetchAllSubjects() {
        sem6 = getReadableDatabase();
        String query = "SELECT * FROM semester6";
        Cursor c = null;
        if (sem6 != null) {
            c = sem6.rawQuery(query, null);
        }
        return c;
    }

    public void deleteAll() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("semester6", null, null);
        db.execSQL("delete from  " + "semester6");
        db.close();
    }
}
