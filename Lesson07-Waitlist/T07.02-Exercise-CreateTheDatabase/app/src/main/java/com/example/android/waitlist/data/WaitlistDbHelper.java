package com.example.android.waitlist.data;

import android.database.sqlite.SQLiteOpenHelper;

public class WaitlistDbHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "waitlist.db";
    public static final int DATABASE_VERSION = 1;

    // TODO (4) Create a Constructor that takes a context and calls the parent constructor

    // TODO (5) Override the onCreate method

        // TODO (6) Inside, create an String query called SQL_CREATE_WAITLIST_TABLE that will create the table

        // TODO (7) Execute the query by calling execSQL on sqLiteDatabase and pass the string query SQL_CREATE_WAITLIST_TABLE

    // TODO (8) Override the onUpgrade method

        // TODO (9) Inside, execute a drop table query, and then call onCreate to re-create it

}