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

    public MyBroadcastReceiver() {
        //java.lang.InstantiationException  出现这个异常，如果没有无参构造的时候
//      java  在对象建立中，会使用不带参数的构造函数来 建立成员回调对象
//        https://blog.csdn.net/guobaolinghao/article/details/78017359
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
