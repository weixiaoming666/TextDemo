package com.example.administrator.textdemo.view.ryglearn;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.ListViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.example.administrator.textdemo.view.ryglearn.activity.MyScroView;

/**
 * Created by wxm on 2018/6/8.
 */
//https://www.cnblogs.com/Sweet-Candy/p/6252639.html

public class AllShowListView extends ListViewCompat {
    MyScroView myScroView;
    private int mLastX =0;
    private int mLastY = 0;

    //    https://blog.csdn.net/hp910315/article/details/51375000
    @SuppressLint("RestrictedApi")
    public AllShowListView(Context context) {
        super(context);
    }

    @SuppressLint("RestrictedApi")
    public AllShowListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @SuppressLint("RestrictedApi")
    public AllShowListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

//    @Override
//    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,MeasureSpec.AT_MOST);
//        super.onMeasure(widthMeasureSpec, expandSpec);
//    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {//是否分发事件

        int x = (int) ev.getX();
        int y = (int) ev.getY();
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:{
                getParent().requestDisallowInterceptTouchEvent(true);
                break;
            }
            case MotionEvent.ACTION_MOVE:{
                int deltaX = x - mLastX;
                int deltay = x - mLastY;
                if (Math.abs(deltaX)>Math.abs(deltay)){//父容器需要此类事件
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                break;
            }
            case MotionEvent.ACTION_UP:{
                break;
            }
        }
        return super.dispatchTouchEvent(ev);
    }
}
