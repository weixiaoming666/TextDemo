package com.example.administrator.textdemo.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.administrator.textdemo.ToastUtils;

/**
 * Created by wxm on 2018/5/28.
 * 卫晓明
 */

public  class MyBroadcastReceiver extends BroadcastReceiver   {
    private  String textA = "public的暴露 字段";
    private ChangeTextView  changeTextView = null;
   public MyBroadcastReceiver(ChangeTextView changeTextView) {
        this.changeTextView = changeTextView;
    }

    public void setChangeTextView(ChangeTextView changeTextView) {
        this.changeTextView = changeTextView;
    }


    @Override
    public void onReceive(Context context, Intent intent) {
//        逻辑操作跟胡 intent 携带数据进行，也可以格局set进去的 接口判断
        String textA = intent.getStringExtra("666");
        ToastUtils.shortgmsg(context,intent.getStringExtra("666"));

        //其实重写构造  构造传接口是比较好的
        if (changeTextView!=null){
            changeTextView.giveA(textA);
        }else {

        }

    }


}
