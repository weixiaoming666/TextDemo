package com.example.administrator.textdemo.view.ryglearn.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.ToastUtils;
import com.example.administrator.textdemo.view.ryglearn.view.MyListview4;

public class View4Activity extends AppCompatActivity {
    MyListview4 myListview4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view4);
        myListview4 = (MyListview4) findViewById(R.id.lv_ryg_lv4);
        myListview4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ToastUtils.centermsg(View4Activity.this,"单击了 :"+i);
            }
        });

        myListview4.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                ToastUtils.centermsg(View4Activity.this,"长点击了 :"+i);
                return true;//是否消费点击事件
            }
        });
    }
}
