package com.example.administrator.textdemo.view.ryglearn;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.administrator.textdemo.utils.ToastUtils;
import com.nineoldandroids.view.ViewHelper;

/**
 * Created by wxm on 2018/6/11.
 */

@SuppressLint("AppCompatCustomView")
public class MyImageView extends ImageView{
    private  int heigth;
    private  int width;
    int left ;
    int right ;
    int top ;
    int boom ;
    boolean move_left = true;
    public MyImageView(Context context) {
        super(context);

    }

    public MyImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        WindowManager wm = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);

    }

    public MyImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

//    Android动画进阶—使用开源动画库nineoldandroids  http://blog.csdn.net/singwhatiwanna/article/details/17639987
    int mLastX = -1;
    int mLastY = -1;
    @Override
    public boolean onTouchEvent(MotionEvent event) {

        boolean click = true;
        ViewGroup group = (ViewGroup) this.getParent();
        heigth = group.getMeasuredHeight();
        width = group.getMeasuredWidth();
        int left =group.getLeft();
        this.left = getLeft();//view 在父布局中的左侧view
        int left2 = (int) getX();//  子view 在父view 中左侧的距离
        int left22 = (int) getY();//  子view 在父view 中左侧的距离
        int left3 = (int) getPivotX();//x 到 view 边缘的距离
        float left4 =  getScaleX();
        int left5 = (int) getScrollX();
        int left8 =  getMeasuredWidth();
        int right =group.getRight();
        this.right = getRight();
        int top =group.getTop();
        this.boom = this.getBottom();
        int bottom =group.getBottom();

        int x = (int) event.getRawX();//屏幕位置  手指点击的位置
        int y = (int) event.getRawY();
//        int x = (int) event.getX();//父view位置
//        int y = (int) event.getY();
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

                if ( getX()>0 && getX()+getMeasuredWidth()<group.getWidth()){
                    int translationX = (int) ViewHelper.getTranslationX(this)+delaX;
                    ViewHelper.setTranslationX(this,translationX);
                }else {
                    if (getX()+getMeasuredWidth()>=group.getWidth()){
                        if (delaX<=0){
                            int translationX = (int) ViewHelper.getTranslationX(this)+delaX;
                            ViewHelper.setTranslationX(this,translationX);
                        }
                    }
                    if (getX()<=0 ){
                        if (delaX>=0){
                            int translationX = (int) ViewHelper.getTranslationX(this)+delaX;
                            ViewHelper.setTranslationX(this,translationX);
                    }

                    }
                }
                if (getY()>0 && getY()+getMeasuredHeight()<group.getHeight()){
                    int translationY = (int) ViewHelper.getTranslationY(this)+delaY;
                    ViewHelper.setTranslationY(this,translationY);
                }

                    if (getY()+getMeasuredWidth()>=group.getHeight()){
                        if (delaY<=0){
                            int translationY = (int) ViewHelper.getTranslationY(this)+delaY;
                            ViewHelper.setTranslationY(this,translationY);
                        }
                    }
                    if (getY()<=0 ) {
                        if (delaY >= 0) {
                            int translationY = (int) ViewHelper.getTranslationY(this) + delaY;
                            ViewHelper.setTranslationY(this, translationY);
                        }
                    }
//                    if (Math.abs(y)>group.getTop() && y<group.getBottom()){
//                        int translationY = (int) ViewHelper.getTranslationY(this)+delaY;
//                        ViewHelper.setTranslationY(this,translationY);
//                    }
                break;

            }
            case MotionEvent.ACTION_UP:{
                ToastUtils.centermsg(getContext(),"点OOO击到了");
//               if (getX()<0){
//                   int translationX = (int) ((int) ViewHelper.getTranslationX(this)+getX());
//                   ViewHelper.setTranslationX(this,translationX);
//               }
//               if (getX()+getMeasuredWidth()>group.getMeasuredWidth()){
//                   int translationX = (int) ((int) ViewHelper.getTranslationX(this)+getX()+getMeasuredWidth()-group.getMeasuredWidth());
//                   ViewHelper.setTranslationX(this,translationX);
//               }
//               if (getY()<0){
//                   int translationY = (int) ((int) ViewHelper.getTranslationY(this) + getY());
//                   ViewHelper.setTranslationY(this, translationY);
//               }
//               if (getY()+getMeasuredHeight()>group.getMeasuredHeight()){
//                   int translationY = (int) ((int) ViewHelper.getTranslationY(this) + getY()+getMeasuredHeight()-group.getMeasuredHeight());
//                   ViewHelper.setTranslationY(this, translationY);
//               }
                click =false;
//                https://blog.csdn.net/u013531824/article/details/54910809
                callOnClick();//触发view 的点击事件
//                performClick();

                break;
            }
            default:
                break;
        }
        mLastX =x;
        mLastY =y;
        return click;
    }


//    private int text(MotionEvent event){
//
//        VelocityTracker velocityTracker= VelocityTracker.obtain();;
//        velocityTracker.addMovement(event);
////   获取当前的xy 滑动速度 速度作为矢量 可以为负
//        velocityTracker.computeCurrentVelocity(1000);//计算速度 1000毫秒  //单位：当前括号内 s 内划过的像素数（当前）
//        int vX = (int) velocityTracker.getXVelocity();
//        int vY = (int) velocityTracker.getYVelocity();
//// 不用的时候注意回收
//        velocityTracker.clear();
//        velocityTracker.recycle();
//        return vX;
//    }


}
