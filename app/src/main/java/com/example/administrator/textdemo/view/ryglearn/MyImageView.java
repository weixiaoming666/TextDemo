package com.example.administrator.textdemo.view.ryglearn;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;

import com.nineoldandroids.view.ViewHelper;

/**
 * Created by wxm on 2018/6/11.
 */

@SuppressLint("AppCompatCustomView")
public class MyImageView extends ImageView{


    public MyImageView(Context context) {
        super(context);
    }

    public MyImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

//    Android动画进阶—使用开源动画库nineoldandroids  http://blog.csdn.net/singwhatiwanna/article/details/17639987
    int mLastX = -1;
    int mLastY = -1;
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getRawX();
        int y = (int) event.getRawY();
        if (mLastX==-1){
            mLastX = getScrollX();
        }
         if (mLastY==-1){
             mLastY = getScrollY();
         }

        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:{
                break;
            }
            case MotionEvent.ACTION_MOVE:{
                int delaX = x - mLastX;
                int delaY = y - mLastY;
                int translationX = (int) ViewHelper.getTranslationX(this)+delaX;
                int translationY = (int) ViewHelper.getTranslationY(this)+delaY;
                ViewHelper.setTranslationX(this,translationX);
                ViewHelper.setTranslationY(this,translationY);
            }
            case MotionEvent.ACTION_UP:{
                break;
            }
            default:
                break;
        }
        mLastX =x;
        mLastY =y;

        return true;
    }
}
