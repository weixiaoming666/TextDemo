package com.example.administrator.textdemo.view.ryglearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.widget.Scroller;

import com.example.administrator.textdemo.R;
//任玉刚 关于安卓开发艺术 view 的系统学习
public class ViewRXGAty extends AppCompatActivity implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_rxgaty);
        Scroller scroller = new Scroller(this);
        smoothScrollTo();
    }

    private void smoothScrollTo() {
        

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (1){
            case MotionEvent.ACTION_MOVE://移动
            case MotionEvent.ACTION_DOWN://按下
            case MotionEvent.ACTION_UP://抬起

        }
//        速率选择器
        VelocityTracker velocityTracker = VelocityTracker.obtain();
        velocityTracker.addMovement(event);
//   获取当前的xy 滑动速度 速度作为矢量 可以为负
        velocityTracker.computeCurrentVelocity(1000);//计算速度 1000毫秒  //单位：当前括号内 s 内划过的像素数（当前）
        int vX = (int) velocityTracker.getXVelocity();
        int vY = (int) velocityTracker.getYVelocity();
// 不用的时候注意回收
        velocityTracker.clear();
        velocityTracker.recycle();
//手势检测
        GestureDetector gestureDetector = new GestureDetector(this);
//        解决长按屏幕后无法拖动的情况
        gestureDetector.setIsLongpressEnabled(false);
//        接管onTouch 方法
        boolean consume = gestureDetector.onTouchEvent(event);
        return consume;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
//    手指轻触屏幕的一瞬间  一个 ACTION_DOWN 触发
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
//  按压状态 没有松开 或者 拖动状态
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        //单击行为
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        //滑动行为
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
//        长按事件
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
//        快速滑动行为
        return false;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
//        严格单机行为
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
//        双击 不能和严格单击中共存
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
//        发生了双击行为
        return false;
    }
}
