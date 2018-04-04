package com.example.administrator.textdemo.interfacecallback;

import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.retrofit.GetData;

public class Baty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baty);


    }

    public void changeAaty(View view) {
        Aaty aaty = (Aaty)AtyFactory.activity;
        aaty.DataChanged("B里面的数据哦哦哦");
//        这种写法不安全不科学不好的一逼 因为存aty可能被回收
    }
}
