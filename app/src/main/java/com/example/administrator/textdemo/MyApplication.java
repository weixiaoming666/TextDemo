package com.example.administrator.textdemo;

import org.litepal.LitePal;
import org.litepal.LitePalApplication;

/**
 * Created by wxm on 2018/6/14.
 */
public class MyApplication extends LitePalApplication {
    @Override
    public void onCreate() {
        //替换为原来的主题，在onCreate之前调用
        super.onCreate();
        LitePal.getDatabase();
    }
}
