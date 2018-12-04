package com.example.administrator.textdemo.demoZSZX.net;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import android.widget.TextView;

import com.example.administrator.textdemo.R;

/**
 * Created by wxm on 2018/12/4.
 */
class Util {
    public static Dialog createProgressDialog(Context context,String prompt){
        final AlertDialog alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setCanceledOnTouchOutside(false);
        showDialog(alertDialog,context);
        alertDialog.dismiss();
//		WindowManager wm = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
//		int screenWidth = wm.getDefaultDisplay().getWidth();
//		WindowManager.LayoutParams params =
//				alertDialog.getWindow().getAttributes();
//				params.width = screenWidth-Util.dip2px(context, 60);
//				alertDialog.getWindow().setAttributes(params);
        Window window = alertDialog.getWindow();
        window.setContentView(R.layout.base_dialog_progress);
        TextView tv_prompt = (TextView) window.findViewById(R.id.tv_prompt_base_dialog_progress);
        tv_prompt.setText(prompt);
        return alertDialog;
    }
    //防止activity已经销毁 dialog仍然显示的问题
    public static void showDialog(Dialog dialog, Context context){
        if(isActivityRun(context)){
            dialog.show();
        }
    }
    //判断当前activity是否销毁
    public static boolean isActivityRun(Context context){
        boolean isRun=false;
        if(context instanceof Activity){
            Activity activity=(Activity)context;
            if(!activity.isFinishing()){
                isRun=true;
            }
        }
        return isRun;
    }
}
