package com.example.administrator.textdemo.litepal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by wxm on 2018/6/11.
 */

public class MyDB extends SQLiteOpenHelper {

    public static final String CREATE_NEWS = "create table book ("
            + "id integer primary key autoincrement, "
            + "name text, "
            + "id text,"
            + "address text,"
            + "price text,"
            + "author text,"
            + "contet text,"
            + "key integer)";
    public MyDB(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_NEWS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists books");
        onCreate(sqLiteDatabase);
    }
}
