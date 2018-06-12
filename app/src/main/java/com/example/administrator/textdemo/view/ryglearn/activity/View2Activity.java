package com.example.administrator.textdemo.view.ryglearn.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.view.ryglearn.MyImageView;
import com.example.administrator.textdemo.view.ryglearn.ViewText;

/**
 * Created by wxm on 2018/6/11.
 */

public  class View2Activity   extends AppCompatActivity {
    ViewText viewText ;
    MyImageView myImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view2);
        myImageView = (MyImageView) findViewById(R.id.myImageView);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        myImageView.bringToFront();
        return super.onTouchEvent(event);
    }
}
