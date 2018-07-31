package com.example.administrator.textdemo.view.ryglearn.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.ToastUtils;
import com.example.administrator.textdemo.view.ryglearn.MyImageView;
import com.example.administrator.textdemo.view.ryglearn.ViewText;

/**
 * Created by wxm on 2018/6/11.
 */

public  class View2Activity   extends AppCompatActivity implements View.OnClickListener{
    ViewText viewText ;
    MyImageView myImageView;
    private FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view2);
        myImageView = (MyImageView) findViewById(R.id.myImageView);
        frameLayout = (FrameLayout) findViewById(R.id.fl);
        myImageView.setOnClickListener(this);


    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        myImageView.bringToFront();
        return super.onTouchEvent(event);
    }

    @Override
    public void onClick(View view) {
        ToastUtils.centermsg(View2Activity.this,"点击到了");
    }
}
