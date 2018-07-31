package com.example.administrator.textdemo.view.ryglearn.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/**
 * Created by wxm on 2018/6/20.
 */
public class MyScrollView3 extends ScrollView {
    private int mLastInteceptX = -1;
    private int mLastInteceptY = -1;
    private Context context ;

    public MyScrollView3(Context context) {
        super(context);
    }

    public MyScrollView3(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    public MyScrollView3(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean intercept = false;
        int x = (int) ev.getX();
        int y = (int) ev.getY();
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:{
                intercept =false;
                break;
            }
            case MotionEvent.ACTION_MOVE:{
                if (true){//父容器如要的点击事件
                    intercept = true;
                    intercept = true;
                    intercept = true;
                }else {
                    intercept =false;
                }
                break;
            }
            case MotionEvent.ACTION_UP:{
                intercept = true;
                break;
            }
            default:
                intercept = true;
                break;
        }
        mLastInteceptX = x;
        mLastInteceptY = y;
        return intercept;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return super.onTouchEvent(ev);
    }
}
