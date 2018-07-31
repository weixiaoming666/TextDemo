package com.example.administrator.textdemo.view.ryglearn.activity;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

/**
 * Created by wxm on 2018/6/12.
 */
public class MyScroView extends ScrollView {
    private int mChildrenSize;
    private int mChildrenWidth;

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
    public boolean onInterceptTouchEvent(MotionEvent ev) {//事件拦截 是否拦截事件传递

        return false;
    }
    private int horizontalSpace = 10;//水平间距
    private int verticalSpace = 10;//垂直间距
    protected void onLayout(boolean b, int j, int i1, int i2, int i3) {//子 view 的放置
        int hadUsedHorizontal = 0;//水平已经使用的距离
        int hadUsedVertical = 0;//垂直已经使用的距离
        int width = getMeasuredWidth();
        int height = getMeasuredHeight();
//        https://blog.csdn.net/wxr_feixiang/article/details/56844915
//        该方法获取的只是次级下的view （包含viewgroup）的数量
        mChildrenSize = getChildCount();

        for (int i = 0; i < getChildCount(); i++) {
            View view = getChildAt(i);
            mChildrenWidth = view.getMeasuredWidth();
            if (view.getMeasuredWidth() + hadUsedHorizontal > width) {
                hadUsedVertical = hadUsedVertical + view.getMeasuredHeight() + verticalSpace;
                hadUsedHorizontal = 0;
            }
//            if (view.getMeasuredHeight() + hadUsedVertical > height) {
//                hadUsedHorizontal = hadUsedHorizontal + view.getMeasuredHeight() + horizontalSpace;
//                hadUsedVertical = 0;
//            }
            view.layout(hadUsedHorizontal, hadUsedVertical, hadUsedHorizontal + view.getMeasuredWidth(), hadUsedVertical + view.getMeasuredHeight());
            hadUsedHorizontal = hadUsedHorizontal + horizontalSpace + view.getMeasuredWidth();
//            hadUsedVertical = hadUsedVertical + verticalSpace + view.getMeasuredHeight();
        }

    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //遍历子View，测量每个View的大小
        for (int i = 0; i < getChildCount(); i++) {
            View view = getChildAt(i);
            measureChild(view, widthMeasureSpec, heightMeasureSpec);
        }
    }
}
