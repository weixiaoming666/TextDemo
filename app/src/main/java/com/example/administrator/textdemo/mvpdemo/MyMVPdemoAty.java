package com.example.administrator.textdemo.mvpdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.utils.ToastUtils;

/**
 * Created by Administrator on 2018/4/4.
 */
//mvp 调用顺序
//    https://www.jianshu.com/p/734d3693da02
public class MyMVPdemoAty extends AppCompatActivity {
    private AutoCompleteTextView mEmailView;
    private EditText mPasswordView;
    private ProgressBar mProgressView;
    private UserLoginView loginView;
    private UserLoginPresenter userLoginPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_my_mvp_demo);
        setTitle("MVP模式的测试demo");
        mProgressView = (ProgressBar) findViewById(R.id.login_progress);
        mPasswordView = (EditText) findViewById(R.id.password);
        mEmailView = (AutoCompleteTextView) findViewById(R.id.email);
        initLogView();
    }

    private void initLogView() {
        loginView = new UserLoginView() {//声明并且创建一个引用 登录接口  可以本aty实现这个接口 这里其实可以在P内实现做操作的 传一个aty 可以
            @Override
            public String getUserName() {
                return mEmailView.getText().toString().trim();
            }

            @Override
            public String getPassword() {
                return mPasswordView.getText().toString().trim();
            }

            @Override
            public void clearUserName() {
                mEmailView.setText("");
            }

            @Override
            public void clearPassword() {
                mPasswordView.setText("");
            }

            @Override
            public void showLoading() {
                mProgressView.setVisibility(View.VISIBLE);
            }

            @Override
            public void hideLoading() {
                mProgressView.setVisibility(View.GONE);
            }

            @Override
            public void toMainActivity(User user) {
                ToastUtils.shortgmsg(MyMVPdemoAty.this,"登录成功");
            }

            @Override
            public void showFailedError() {
                ToastUtils.shortgmsg(MyMVPdemoAty.this,"登录失败");
            }
        };
        userLoginPresenter = new UserLoginPresenter(loginView);//创建 桥梁 P
    }

    public void sign(View view) {//通过监听 调用 P 处理 View 逻辑
        userLoginPresenter.login();
    }
}
