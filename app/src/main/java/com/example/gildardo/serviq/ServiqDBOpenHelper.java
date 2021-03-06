package com.example.gildardo.serviq;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by gildardo on 8/12/16.
 */

public class ServiqDBOpenHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "serviq.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_COMIDA = "comida";
    public static final String COLUMN_ID = "cId";
    public static final String COLUMN_TITLE = "comida";
    public static final String COLUMN_DESC = "descripcion";
    public static final String COLUMN_PRICE = "precio";
    public static final String COLUMN_TIME = "tiempo";
    public static final String COLUMN_IMAGE = "imagen";

    private static final String TABLE_CREATE =
            "CREATE TABLE " + TABLE_COMIDA +  " (" +
            COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COLUMN_TITLE + " TEXT, " + COLUMN_DESC + " TEXT," +
            COLUMN_PRICE + " NUMERIC, " + COLUMN_TIME + " NUMERIC, " +
            COLUMN_IMAGE + " TEXT " + ")";

    public ServiqDBOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLE_CREATE);
        Log.i("ServiQ", "Table has been created ;D");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_COMIDA);
        onCreate(sqLiteDatabase);
    }
}
