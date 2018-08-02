package com.example.administrator.textdemo.intentfilter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.textdemo.R;

/**
 * Created by Administrator on 2018/4/2.
 */

public class TextInfilter extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_filter_demo_aty);
        setTitle("我不喜欢你");
        setTitle(R.layout.activity_demo_one);
    }
}
