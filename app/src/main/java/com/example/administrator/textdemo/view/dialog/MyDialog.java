package com.example.administrator.textdemo.view.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by wxm on 2018/6/14.
 */
public class MyDialog  extends Dialog {
    private View view;
    private Context context;
    public MyDialog(@NonNull Context context,View view) {
        super(context);
        this.view = view;
        this.context = context;
    }

    public MyDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    protected MyDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(view);
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        int screenWidth = wm.getDefaultDisplay().getWidth();
        final int screenHight = wm.getDefaultDisplay().getHeight();
        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.width = screenWidth*4/5;
        params.height = screenHight*3/5;
        getWindow().setBackgroundDrawableResource(android.R.color.holo_blue_dark);
    }
}
