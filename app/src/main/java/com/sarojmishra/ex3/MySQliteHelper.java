package com.sarojmishra.ex3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class MySQliteHelper extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "bus_data.db";


    ArrayList<DatabaseInfo> comboList = new ArrayList<>();
    String combo_treat, comboNoComma;
    float sum = 0;
    public MySQliteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {

        // create bus table
        db.execSQL(DatabaseInfo.CREATE_BUS_TABLE);



    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + DatabaseInfo.BUS_TABLE);


        // Create tables again
        onCreate(db);
    }

    public boolean insertbusStopData(String stopName, String keyword) {
        // get writable database as we want to write data
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(DatabaseInfo.NAME, stopName);
        values.put(DatabaseInfo.KEYWORD, keyword);


        // insert row
        db.insert(DatabaseInfo.BUS_TABLE, null, values);

        // close db connection
        db.close();

        // return newly inserted row id
        return true;
    }



    public List<DatabaseInfo> getStop() {
        List<DatabaseInfo> menu = new ArrayList<>();

        // Select All Query
        String selectQuery = "SELECT  * FROM " + DatabaseInfo.BUS_TABLE + " ORDER BY " +
                DatabaseInfo.NAME + " DESC";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                DatabaseInfo info = new DatabaseInfo();
                info.setUnique_name(cursor.getString(cursor.getColumnIndex(DatabaseInfo.NAME)));
                info.setKeyword(cursor.getString(cursor.getColumnIndex(DatabaseInfo.KEYWORD)));

                menu.add(info);
            } while (cursor.moveToNext());
        }
        // close db connection
        db.close();

        // return menu list
        return menu;
    }

}