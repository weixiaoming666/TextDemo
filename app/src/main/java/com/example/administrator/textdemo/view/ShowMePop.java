package com.example.administrator.textdemo.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.utils.ToastUtils;

import java.util.List;

/**
 * Created by wxm on 2018/8/3.
 */
public class ShowMePop extends PopupWindow {
    Context mContext;
    private LayoutInflater mInflater;
    private View mContentView;
    private ImageView iv;
    private MyPopupWindow.SpinnerAdapter adapter;
    List<String> spData;
    public ShowMePop(Context context) {
        super(context);
        this.mContext=context;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mContentView = mInflater.inflate(R.layout.base_show_me,null);
        iv = mContentView.findViewById(R.id.iv_me);
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

        initView();

        initListener();
    }




    private void initView() {
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.centermsg(mContext,"别乱摸，我是你得不到的男人");
                dismiss();
            }
        });
    }

    private void initListener() {

    }


}
