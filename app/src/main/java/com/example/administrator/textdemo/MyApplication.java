package com.example.administrator.textdemo;

import org.litepal.LitePal;
import org.litepal.LitePalApplication;

/**
 * Created by wxm on 2018/6/14.
 */
public class MyApplication extends LitePalApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.getDatabase();
    }
}
