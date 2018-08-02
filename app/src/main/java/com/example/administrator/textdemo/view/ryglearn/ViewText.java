package com.example.administrator.textdemo.view.ryglearn;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.Scroller;

import com.example.administrator.textdemo.utils.ToastUtils;

/**
 * Created by wxm on 2018/6/8.
 */

public class ViewText extends View implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener{
    GestureDetector.SimpleOnGestureListener listener;
    private Context context;
    Scroller scroller ;
    static final  String TAG = "66666666";
    public ViewText(Context context) {
        super(context);
//        弹性滑动按钮  用来滑动 view内容
        this.context = context;
        scroller = new Scroller(context);
    }

    public ViewText(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        scroller = new Scroller(context);

    }

    public ViewText(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        scroller = new Scroller(context);

    }


    private void smoothScrollTo(int destX, int destY) {//参数为相对于view 的位置坐标
            int scrollX = getScrollX();//当前水平坐标
             int delta = destX - scrollX;//差量
//        1000 毫秒内滑向 destX;
        scroller.startScroll(scrollX,0,delta,0,1000);
//        https://blog.csdn.net/mars2639/article/details/6650876/
//        invalidate()是用来刷新View的，必须是在UI线程中进行工作
        invalidate();
    }

    @Override
    public void computeScroll() {
        if (scroller.computeScrollOffset()){
            scrollTo(scroller.getCurrX(),scroller.getCurrY());
            postInvalidate();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
//        switch (event.getAction()){
//            case MotionEvent.ACTION_MOVE://移动
//
//            case MotionEvent.ACTION_DOWN://按下
//
//            case MotionEvent.ACTION_UP://抬起
//
//
//        }
//  1      速率选择器
        VelocityTracker velocityTracker = VelocityTracker.obtain();
        velocityTracker.addMovement(event);
//   获取当前的xy 滑动速度 速度作为矢量 可以为负
        velocityTracker.computeCurrentVelocity(1000);//计算速度 1000毫秒  //单位：当前括号内 s 内划过的像素数（当前）
        int vX = (int) velocityTracker.getXVelocity();
        int vY = (int) velocityTracker.getYVelocity();
// 不用的时候注意回收
        velocityTracker.clear();
        velocityTracker.recycle();
//2    手势检测
        GestureDetector gestureDetector = new GestureDetector(context,this);//可以直接new 接口实现
//        解决长按屏幕后无法拖动的情况
        gestureDetector.setOnDoubleTapListener(this);


//        接管onTouch 方法
//        boolean consume = gestureDetector.onTouchEvent(event);
//        judge(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
//    手指轻触屏幕的一瞬间  一个 ACTION_DOWN 触发
//        这里需要自己操作写出单击 双击的分发等

        ToastUtils.centermsg(context," 手指轻触屏幕的一瞬间  一个 ACTION_DOWN 触发");
        Log.d(TAG, "onDown: 手指轻触屏幕的一瞬间");
        return true;
    }
    private long oneDoewTime = System.currentTimeMillis();
    private void judge(MotionEvent motionEvent) {
        int startX = scroller.getCurrX();
        int endX = scroller.getCurrX();
        int startY = scroller.getCurrY();
        int endY = scroller.getCurrX();
        long TwoDoewTime =System.currentTimeMillis() ;

        switch (motionEvent.getAction()){

            case MotionEvent.ACTION_DOWN://按下

                if (System.currentTimeMillis()-oneDoewTime>2000){
//                    双击事件
                    oneDoewTime = System.currentTimeMillis();

                }else {
                    onDoubleTapEvent(motionEvent);
                }
            case MotionEvent.ACTION_MOVE://移动
                endX = scroller.getFinalX();
                endY = scroller.getFinalY();
                int delaX = startX - endX;
                int delaY = startY - endY;
                if (delaX>10){
                    onScroll(motionEvent,motionEvent,delaX,delaX);
                }
            case MotionEvent.ACTION_UP://抬起
                if (System.currentTimeMillis()-TwoDoewTime>2000){
                    onLongPress(motionEvent);
                }else {
//                    单击事件
                    onSingleTapUp(motionEvent);
                }

            case MotionEvent.ACTION_SCROLL://滑动



        }

    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
//  按压状态 没有松开 或者 拖动状态
//        judge(motionEvent);
        ToastUtils.centermsg(context,"按压状态 没有松开 或者 拖动状态");
        Log.d(TAG, "onShowPress:按压状态 没有松开 或者 拖动状态 ");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        //单击行为
        ToastUtils.centermsg(context,"单击行为");
        Log.d(TAG, "onSingleTapUp:单击行为 ");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        //滑动行为
        ToastUtils.centermsg(context,"滑动行为");
        Log.d(TAG, "onScroll: 滑动行为");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
//        长按事件
        ToastUtils.centermsg(context,"长按事件");
        Log.d(TAG, "onLongPress: 长按事件");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
//        快速滑动行为
        ToastUtils.centermsg(context,"快速滑动行为");
        Log.d(TAG, "onFling:快速滑动行为 ");
        return false;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
//        严格单机行为
        ToastUtils.centermsg(context,"严格单击");
        Log.d(TAG, "onSingleTapConfirmed:严格单击 ");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
//        双击 不能和严格单击中共存
        ToastUtils.centermsg(context,"双击");
        Log.d(TAG, "onDoubleTap: 双击");
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
//        发生了双击行为
        ToastUtils.centermsg(context,"双击了");
        Log.d(TAG, "onDoubleTapEvent: 双击完成");
        return false;
    }
}
