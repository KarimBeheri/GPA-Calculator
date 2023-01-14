package com.example.gpaometer;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class semester4 extends SQLiteOpenHelper {

    public static String databaseName = "sem4.db";
    SQLiteDatabase sem4;

    public semester4(Context context) {
        super(context, databaseName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table semester4(subject text ," +
                "grade text,credits text )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists semester4");
        onCreate(db);
    }


    public void createNewSubject(String subject, String grade, String credits) {
        ContentValues row = new ContentValues();
        row.put("subject", subject);
        row.put("grade", grade);
        row.put("credits", credits);
        sem4 = getWritableDatabase();
        sem4.insert("semester4", null, row);
        sem4.close();
    }

    public Cursor fetchAllSubjects() {
        sem4 = getReadableDatabase();
        String query = "SELECT * FROM semester4";
        Cursor c = null;
        if (sem4 != null) {
            c = sem4.rawQuery(query, null);
        }
        return c;
    }

    public void deleteAll() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("semester4", null, null);
        db.execSQL("delete from  " + "semester4");
        db.close();
    }
}
