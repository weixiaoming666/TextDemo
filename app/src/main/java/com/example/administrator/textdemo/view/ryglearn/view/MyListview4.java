package com.example.administrator.textdemo.view.ryglearn.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;

/**
 * Created by wxm on 2018/6/20.
 */
public class MyListview4 extends ListView{
    private HorizontalScrollViewEx4 horizontalScrollViewEx4;
    private int mLastX= 0;
    private int mLastY= 0;

    public MyListview4(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        horizontalScrollViewEx4 = (HorizontalScrollViewEx4) getParent();
        int x = (int) ev.getX();
        int y = (int) ev.getY();
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:{
                horizontalScrollViewEx4.requestDisallowInterceptTouchEvent(true);
                break;
            }
            case MotionEvent.ACTION_MOVE:{
              int deltaX = x - mLastX;
              int deltay = x - mLastY;
              if (Math.abs(deltaX)>Math.abs(deltay)){//父容器需要此类事件
                  horizontalScrollViewEx4.requestDisallowInterceptTouchEvent(false);
              }
                break;
            }
            case MotionEvent.ACTION_UP:{
                break;
            }
        }
        mLastX =x;
        mLastY =y;
        return super.dispatchTouchEvent(ev);
    }
}
