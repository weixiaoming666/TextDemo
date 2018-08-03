package com.example.administrator.textdemo.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.ProgressBar;

import com.example.administrator.textdemo.R;

import java.util.List;

/**
 * Created by wxm on 2018/8/3.
 * 用在基类里面
 */
public  class ProgressPopwindon extends PopupWindow {
    Context mContext;
    private LayoutInflater mInflater;
    private View mContentView;
    private ProgressBar progressBar;
    private MyPopupWindow.SpinnerAdapter adapter;
    List<String> spData;
    public ProgressPopwindon(Context context) {
        super(context);
        this.mContext=context;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mContentView = mInflater.inflate(R.layout.base_popload,null);
        progressBar = mContentView.findViewById(R.id.pb_load);
        //设置View
        setContentView(mContentView);
        //设置宽与高
//        setWidth(WindowManager.LayoutParams.MATCH_PARENT);
//        setHeight(WindowManager.LayoutParams.MATCH_PARENT);
        /**
         * 设置进出动画
         */
        setAnimationStyle(R.style.MyPopupWindow);
        /**
         * 设置背景只有设置了这个才可以点击外边和BACK消失
         */
        setBackgroundDrawable(new ColorDrawable());


//        /**
//         * 设置可以获取集点       点击外部消失  默认支持   不需要下面的操作设置
//         */
//        setFocusable(true);
//
//        /**
//         * 设置点击外边可以消失
//         */
//        setOutsideTouchable(false);//不需要就可以
//
//        /**
//         *设置可以触摸
//         */
//        setTouchable(true);
//

        /**
         * 设置点击外部可以消失
         */

//        setTouchInterceptor(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//
//                /**
//                 * 判断是不是点击了外部
//                 */
//                if(event.getAction()==MotionEvent.ACTION_OUTSIDE){
//                    return true;
//                }
//                //不是点击外部
//                return false;
//            }
//        });


        /**
         * 初始化View与监听器
         */
        initView();

        initListener();
    }




    private void initView() {

    }

    private void initListener() {

    }


}
