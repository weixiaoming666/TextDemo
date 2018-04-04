package com.example.administrator.textdemo.mvpdemo;

/**
 * Created by Administrator on 2018/4/4.
 */

public class UserBizImp implements IUserBiz {
    @Override
    public void login(final String name, final String password, final OnLoginLister loginLister) {
        new Thread(){
            @Override
            public void run() {
                try
                {
                    Thread.sleep(2000);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                //模拟登录成功
                if ("zhy".equals(name) && "123".equals(password))
                {
                    User user = new User();
                    user.setName(name);
                    user.setPassword(password);
                    loginLister.loginSuccess(user);
                } else
                {
                    loginLister.loginFailed();
                }
            }
        }.start();
    }
}
