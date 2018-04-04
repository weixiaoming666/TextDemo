package com.example.administrator.textdemo.mvpdemo;

import android.view.View;

import java.security.PrivateKey;

/**
 * Created by Administrator on 2018/4/4.
 */
//view 逻辑层
public interface UserLoginView {
    String getUserName();
    String getPassword();
    void clearUserName();
    void clearPassword();
    void showLoading();
    void hideLoading();
    void toMainActivity(User user);
    void showFailedError();
}
