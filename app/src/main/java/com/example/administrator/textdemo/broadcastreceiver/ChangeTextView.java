package com.example.administrator.textdemo.broadcastreceiver;

import android.widget.TextView;

/**
 * Created by wxm on 2018/5/28.
 * 卫晓明
 */

public interface ChangeTextView {
//    abstract void changeA(TextView view);//传当前view 直接去处理修改
    abstract void giveA(String s);// 广播传递字段出去
}
