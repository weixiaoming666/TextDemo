package com.example.administrator.textdemo.grep;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.textdemo.BaseActivity;
import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.utils.ToastUtils;
import com.example.administrator.textdemo.view.MyPopupWindow;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Thread.sleep;

/**
 * Created by wxm on 2018/7/31.
 */
public class GrepAty extends BaseActivity{
    private TextView textView;
    private EditText et_grep;
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
        et_grep = findViewById(R.id.et_grep);

    }
   private String pattern ="0";
    public void showPop(View view) {
        switch (view.getId()){
            case R.id.textView4: {
                if (myPopupWindow == null){
                    myPopupWindow = new MyPopupWindow(context) {
                        @Override
                        public void getChose(String chose, int i, String patternTem) {
                            textView.setText(chose+"---->"+i);
                            pattern = patternTem;
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

    public void verityGrep(View view) {
        if (et_grep.getText()==null ||et_grep.getText().toString().isEmpty()){
            ToastUtils.centermsg(context,"请填写验证信息");
            return;
        }
        if (pattern.equals("0")){
            ToastUtils.centermsg(context,"请选择验证类型");
            return;
        }
        String str = et_grep.getText().toString();
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        if (m.matches()){
            et_grep.setTextColor(getResources().getColor(R.color.black));
            ToastUtils.centermsg(context,"信息正确");
        }else {
            ToastUtils.centermsg(context,"信息格式错误");
            et_grep.setTextColor(getResources().getColor(R.color.red));
        }
    }
}
