package com.example.administrator.textdemo.interfacecallback;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SimpleCursorTreeAdapter;
import android.widget.TextView;

import com.example.administrator.textdemo.R;
//  https://blog.csdn.net/phenixyf/article/details/52050302   在一个aty中调用别的aty 方法 不适用
// 所谓接口回调  说白了  就是在 a 中 声明一个接口，实例化这个接口；在别的类中调用这个引用的方法 便是接口回调
//说白了就是本身声明一个接口后并且实例化后，别的地方进行了方法的调用，方法中的参数这些便是传递的信息等
//例子 在 retrofit  mvc  mvp 的demo 下都有用到
public class Aaty extends AppCompatActivity implements DataChanged{
    private TextView tv_interfact_callback_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aaty);
        tv_interfact_callback_text = (TextView) findViewById(R.id.tv_interfact_callback_text);
    }

    @Override
    public void DataChanged(String s) {
        tv_interfact_callback_text.setText(s);
        tv_interfact_callback_text.setTextColor(Color.BLUE);
    }

    public void jupB(View view) {
        Intent intent = new Intent(this,Baty.class);
        AtyFactory.activity = this;
        startActivity(intent);
    }
}
