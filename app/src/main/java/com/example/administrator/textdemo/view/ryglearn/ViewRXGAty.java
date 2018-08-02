package com.example.administrator.textdemo.view.ryglearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.utils.ToastUtils;
import com.example.administrator.textdemo.view.ryglearn.activity.View1Activity;
import com.example.administrator.textdemo.view.ryglearn.activity.View2Activity;
import com.example.administrator.textdemo.view.ryglearn.activity.View3Activity;
import com.example.administrator.textdemo.view.ryglearn.activity.View4Activity;

//任玉刚 关于安卓开发艺术 view 的系统学习
public class ViewRXGAty extends AppCompatActivity {
    private AllShowListView showListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_rxgaty);
        initView();
    }

    private void initView() {
        showListView = (AllShowListView) findViewById(R.id.lv);
        showListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ToastUtils.centermsg(ViewRXGAty.this,i+"");
               chose(i);
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    private void chose(int i) {
        switch (i){
            case 1:
               startActivity(new Intent(this, View1Activity.class));
                break;
            case 2:
                startActivity(new Intent(this, View2Activity.class));
                ToastUtils.centermsg(this,i+"");
                break;
            case 3:
                startActivity(new Intent(this, View3Activity.class));
                ToastUtils.centermsg(this,i+"");
                break;
            case 4:
                startActivity(new Intent(this, View4Activity.class));
                ToastUtils.centermsg(this,i+"");
                break;

        }
    }


}
