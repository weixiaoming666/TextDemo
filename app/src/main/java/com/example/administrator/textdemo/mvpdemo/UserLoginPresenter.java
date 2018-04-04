package com.example.administrator.textdemo.mvpdemo;

import android.os.Handler;
import android.view.View;

/**
 * Created by Administrator on 2018/4/4.
 */

public class UserLoginPresenter {
    private View view;
    private UserLoginView loginView;
    private UserBizImp user;
    private Handler mHandler = new Handler();
    public UserLoginPresenter(UserLoginView userLoginView)
    {
        this.loginView = userLoginView;
        this.user = new UserBizImp();
    }
    public void login()
    {//本方法  通过取得 aty 的 loginView 的引用  和新建 UserBizImp 进行登录操作
        loginView.showLoading();
        user.login(loginView.getUserName(), loginView.getPassword(), new OnLoginLister()
        {
            @Override
            public void loginSuccess(final User user)
            {
                //需要在UI线程执行
                mHandler.post(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        loginView.toMainActivity(user);
                        loginView.hideLoading();
                    }
                });
            }
            @Override
            public void loginFailed()
            {
                //需要在UI线程执行
                mHandler.post(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        loginView.showFailedError();
                        loginView.hideLoading();
                    }
                });
            }
        });
    }
    public void clear()
    {
        loginView.clearUserName();
        loginView.clearPassword();
    }
}
