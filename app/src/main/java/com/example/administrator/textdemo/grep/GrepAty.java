package com.example.administrator.textdemo.grep;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.textdemo.BaseActivity;
import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.view.MyPopupWindow;

import static java.lang.Thread.sleep;

/**
 * Created by wxm on 2018/7/31.
 */
public class GrepAty extends BaseActivity{
    TextView textView;
    MyPopupWindow  myPopupWindow;
    private int  state_net = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setViewTitle(R.layout.activity_grep);
        setBaseTitle("正则表达式");
        setLeftVisible(View.VISIBLE);
        setRight1Text("设置");
        setRight2Text("弹出");
        bindView();
        setlistener();


    }

    private void setlistener() {
        baseLayout.bt_load_restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                net();
            }
        });
    }

    private void bindView() {
        textView = findViewById(R.id.textView4);
    }

    public void showPop(View view) {
        switch (view.getId()){
            case R.id.textView4: {
                if (myPopupWindow == null){
                    myPopupWindow = new MyPopupWindow(context) {
                        @Override
                        public void getChose(String chose, int i) {
                            textView.setText(chose+"---->"+i);
                        }
                    };
                }
                myPopupWindow.showAsDropDown(textView);

            }
            break;
            case R.id.tv_load_demo:
                net();

                break;
        }

    }

    private void net() {
        baseLayout.loadStart();
        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    sleep(2000); // 休眠1秒
                } catch (InterruptedException e) {

                }

                /**
                 * 延时执行的代码
                 */
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (state_net ==0){
                            baseLayout.loadSuccess();
                        }else if (state_net==1){
                            baseLayout.loadNonet();
                        }else if (state_net==2){
                            baseLayout.loadNoData();

                        }else {
                            state_net = -1;
                        }
                        state_net++;

                    }
                });

            }
        }).start();

    }
}
