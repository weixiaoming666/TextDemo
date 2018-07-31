package com.example.administrator.textdemo.interfacecallback;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.administrator.textdemo.R;

public class Baty extends AppCompatActivity {
    private Interface anInterface ;
    Aaty aaty = (Aaty)AtyFactory.activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baty);
        anInterface =aaty.getAnInterface();

    }

    public void changeAaty(View view) {

        aaty.DataChanged("B里面的数据哦哦哦");
//        这种写法不安全不科学不好的一逼 因为存aty可能被回收，这不算是一个很标准的接口回调
//        一般情况下的接口回调   其实是写一个接口或者类 AInteface（这个接口或者类中有抽象方法，抽象方法便于自己处理数据，灵活的写法，
// 当然写死的方法调用也是可以的，只是不再那么灵活，这个例子就是写死的  ，且在b 中改a的 数据  这是不安全的 ），这个接口或者抽象类
//        的引用传入B中，B中调用相关抽象方法等，通过方法携带参数实现通信，有的参数需要实例化；
    }

    public void changeAatyInterface(View view) {
        if (anInterface!= null){
            anInterface.dataChanged("我是标准的接口回调哦");
        }

    }
}
