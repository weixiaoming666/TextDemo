package com.example.administrator.textdemo.mvpdemo;

/**
 * Created by Administrator on 2018/4/4.
 */
//业务接口  登录业务
public interface IUserBiz {
    public void login(String name,String password,OnLoginLister loginLister);
}
