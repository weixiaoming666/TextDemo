package com.example.administrator.textdemo.horizontallistView;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.ToastUtils;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import okhttp3.internal.Util;

public class DemoOne extends AppCompatActivity {
//测试能否滑动到滑动位置
    HorizontalListView listView;
    List<String> datas =new ArrayList<>();
    String [] data = {"张三","张三","张三","张三","张三","张三","张三","张三","张三","张三","张三","张三","张三","张三"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_one);
        datas= Arrays.asList(data);
        listView = (HorizontalListView) findViewById(R.id.hlv);//横向滑动到指定位置
        listView.setAdapter(new DemoOneAdapter(datas,this));}

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if(hasFocus){
            Random random1 = new Random(70);
            int posiyion =(int) (Math.random()*70+1);
            ToastUtils.shortgmsg(this,""+posiyion);
            listView.setSelection( posiyion);

        }
    }


}
