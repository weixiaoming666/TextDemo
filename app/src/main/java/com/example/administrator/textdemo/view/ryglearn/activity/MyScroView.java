package com.example.administrator.textdemo.view.ryglearn.activity;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/**
 * Created by wxm on 2018/6/12.
 */
public class MyScroView extends ScrollView {
    public MyScroView(Context context) {
        super(context);
    }

    public MyScroView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyScroView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {

        return false;
    }
}
