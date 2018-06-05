package com.example.administrator.textdemo.view.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.support.v7.widget.AppCompatSpinner;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.ToastUtils;

import okhttp3.internal.Util;

/**
 * Created by Administrator on 2018/4/20.
 */

public class TextDialog extends Dialog {
    private Context context;
    AppCompatSpinner spinner;
    private  String spData;
    private RadioGroup radioGroup;
    private RadioButton left,right,temp_rb;
    private boolean isShow;//确定是否是施工任务  施工任务不显示

    public TextDialog(@NonNull Context context, boolean b) {
        super(context);
        this.context = context;
        isShow = b;
    }

    public TextDialog(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);
        this.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setGravity(Gravity.CENTER);
        setContentView(R.layout.add_task_dialog_view);
        spinner = findViewById(R.id.sp_chose);
        if (!isShow){
            spinner.setVisibility(View.GONE);

        }
        radioGroup =  findViewById(R.id.rg_add_task);
        setCanceledOnTouchOutside(true);
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        int screenWidth = wm.getDefaultDisplay().getWidth();
        final int screenHight = wm.getDefaultDisplay().getHeight();
        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.width = screenWidth*4/5;
        params.height = screenHight*3/5;
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ToastUtils.shortgmsg(context,spinner.isShown()+"2");
//                switch (i){
//                    case 0:
//                        setSpData("准备工作");
//                        break;
//                    case 1:
//                        setSpData("重点检查");
//                        break;
//                    case 2:
//                        setSpData("常规检查");
//                        break;
//                    case 3:
//                        setSpData("旁站见证");
//                        break;
//                    case 4:
//                        setSpData("质量验收");
//                        break;
//                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }

        });
        spinner.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if ( motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    ToastUtils.shortgmsg(context,spinner.isShown()+"1");
                }
                return false;
            }
        });
        left =  findViewById(R.id.rb_left_add_task);
        left.setChecked(true);
        right =  findViewById(R.id.rb_right_add_task);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

                if (i == R.id.rb_left_add_task){
                    left.setChecked(true);
                    right.setChecked(false);
                    spinner.setVisibility(View.VISIBLE);
                    ToastUtils.shortgmsg(context,"质量");
                }else {
                    left.setChecked(false);
                    right.setChecked(true);
                    ToastUtils.shortgmsg(context,"安全");
                    spinner.setVisibility(View.INVISIBLE);
                }
            }
        });
    }


    public String getSpData() {
        return spData;
    }

    public void setSpData(String spData) {
        ToastUtils.shortgmsg(context,spData);
        if (spinner.isShown()){

        }
        this.spData = spData;
    }
}