package com.example.androiddb.DatabaseUtils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.androiddb.DatabaseUtils.ExampleContract.ExampleContractEntries;

/**
 * DB Helper class used to set up and upgrade database on device
 */
public class ExampleDBHelper extends SQLiteOpenHelper {

    /**
     * Database Name
     */
    public static final String DATABASE_NAME = "example.db";
    /**
     * Database Version
     */
    public static final int DATABASE_VERSION = 1;

    public ExampleDBHelper(Context context) {
        super(context, DATABASE_NAME, null,DATABASE_VERSION);
    }

    private String createDatabaseQuery() {
        return "CREATE TABLE " + ExampleContractEntries.TABLE_NAME + " (" +
                ExampleContractEntries._ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ExampleContractEntries.EXAMPLE_COLUMN_NAME + " TEXT NOT NULL, " +
                ExampleContractEntries.EXAMPLE_COLUMN_NUMBER_SIZE + " INTEGER NOT NULL, " +
                ExampleContractEntries.EXAMPLE_COLUMN_TIMESTAMP + " TIMESTAMP DEFAULT CURRENT_TIMESTAMP " +
                "); " ;
    }

    //Database Version
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createDatabaseQuery());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + ExampleContractEntries.TABLE_NAME);
        onCreate(db);
    }
}
