package com.example.administrator.textdemo.view.ryglearn;

import android.content.Context;
import android.support.v7.widget.ListViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by wxm on 2018/6/8.
 */
//https://www.cnblogs.com/Sweet-Candy/p/6252639.html

public class AllShowListView extends ListViewCompat {
    public AllShowListView(Context context) {
        super(context);
    }

    public AllShowListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AllShowListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if(ev.getAction() == MotionEvent.ACTION_MOVE){
            return true;
        }
        return super.dispatchTouchEvent(ev);
    }
}
