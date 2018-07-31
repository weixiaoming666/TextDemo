package com.example.administrator.textdemo.view.ryglearn.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Scroller;

/**
 * Created by wxm on 2018/6/21.
 */
public class HorizontalScrollViewEx4 extends ViewGroup {

    private int mChildrenSize;
    private int mChildrenWidth;
    private int mChildrenIndex;
    private int mLastX = 0;
    private int mLastY = 0;
    //    分别记录上次的滑动坐标
    private int mLastXIntercept = 0;
    private int mLastYIntercept = 0;
    private Scroller scroller;
    private VelocityTracker tracker;
    private void init(){
        scroller = new Scroller(getContext());
        tracker = VelocityTracker.obtain();


    }
    public HorizontalScrollViewEx4(Context context) {
        super(context);
    }

    public HorizontalScrollViewEx4(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public HorizontalScrollViewEx4(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

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

    private int horizontalSpace = 10;//水平间距
    private int verticalSpace = 10;//垂直间距
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //遍历子View，测量每个View的大小
        for (int i = 0; i < getChildCount(); i++) {
            View view = getChildAt(i);
            measureChild(view, widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {//拦截事件
        boolean intercept = true;
        int x = (int) ev.getX();
        int y = (int) ev.getY();
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:{
                mLastX =x;
                mLastY = y;

                intercept =false;
                if (!scroller.isFinished()){//滑动时候拦截down
                    scroller.abortAnimation();
                }else {
                    intercept=false;
                }
                break;
            }
            default:
                break;
        }

        return intercept;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {//所有事件都被 消费  onTouchListener 被调用的话  会被屏蔽
        mChildrenSize = getChildCount();
        tracker.addMovement(event);
        int x = (int) event.getX();
        int y = (int) event.getY();
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:{
                if (!scroller.isFinished()){
                    scroller.abortAnimation();
                }
                break;
            }
            case MotionEvent.ACTION_MOVE:{
                int deltaX = x - mLastX;
                int deltaY = y - mLastY;
                scrollBy(-deltaX,-deltaY);
                break;
            }
            case MotionEvent.ACTION_UP:{
                int scrollX = getScrollX();
                int scrollToChildIndex = scrollX/mChildrenWidth;
                tracker.computeCurrentVelocity(1000);
                float vTracker = tracker.getXVelocity();
                if (Math.abs(vTracker)>=50){
                    mChildrenIndex = vTracker>0?mChildrenIndex-1:mChildrenIndex+1;
                }else {
                    mChildrenIndex = (scrollX + mChildrenWidth/2)/mChildrenWidth;
                }
                mChildrenIndex = Math.max(0,Math.min(mChildrenIndex,mChildrenSize-1));
                int dx = x-mLastX;
                int dy = y-mLastY;
                smoothScrollBy(dx,dy);
                tracker.clear();
                break;
            }
            default:
                break;

        }
        mLastX = x;
        mLastY = y;
        return true;
    }

    private void smoothScrollBy(int dx, int i) {
        scroller.startScroll(getScrollX(),getScrollY(),dx,i);
        invalidate();
    }

    @Override
    public void computeScroll() {
        if (scroller.computeScrollOffset()){
            scrollTo(scroller.getCurrX(),scroller.getCurrY());
            postInvalidate();
        }
        super.computeScroll();
    }
}
