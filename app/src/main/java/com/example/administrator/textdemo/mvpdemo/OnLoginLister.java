package com.example.administrator.textdemo.mvpdemo;

/**
 * Created by Administrator on 2018/4/4.
 */
//登录接口回调
interface OnLoginLister {
    void loginSuccess(User user);
    void loginFailed();
}
