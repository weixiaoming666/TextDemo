package com.example.administrator.textdemo.polymorphismtext;

import android.app.Activity;

import com.example.administrator.textdemo.utils.ToastUtils;

/**
 * Created by wxm on 2018/5/16.
 * 子类
 */

public class SonOne implements Father {
    private Activity activity;

    public SonOne(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void diaoLong(long lenth) {
        ToastUtils.shortgmsg(activity,"老大长度："+lenth);
    }

    @Override
    public void papapaWith(String name) {
        ToastUtils.shortgmsg(activity,"老大和"+name+"在秀秀");
    }

    @Override
    public void setListener(Father type) {

    }

    public void myname(){
        ToastUtils.shortgmsg(activity,"我叫老大，师兄弟就来砍我");
    }
}
