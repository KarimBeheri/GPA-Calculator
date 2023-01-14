package com.example.gpaometer;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class semester5 extends SQLiteOpenHelper {

    public static String databaseName = "sem5.db";
    SQLiteDatabase sem5;

    public semester5(Context context) {
        super(context, databaseName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table semester5(subject text ," +
                "grade text,credits text )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists semester5");
        onCreate(db);
    }


    public void createNewSubject(String subject, String grade, String credits) {
        ContentValues row = new ContentValues();
        row.put("subject", subject);
        row.put("grade", grade);
        row.put("credits", credits);
        sem5 = getWritableDatabase();
        sem5.insert("semester5", null, row);
        sem5.close();
    }

    public Cursor fetchAllSubjects() {
        sem5 = getReadableDatabase();
        String query = "SELECT * FROM semester5";
        Cursor c = null;
        if (sem5 != null) {
            c = sem5.rawQuery(query, null);
        }
        return c;
    }

    public void deleteAll() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("semester5", null, null);
        db.execSQL("delete from  " + "semester5");
        db.close();
    }
}
