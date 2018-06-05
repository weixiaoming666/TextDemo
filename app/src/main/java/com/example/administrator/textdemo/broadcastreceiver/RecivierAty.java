package com.example.administrator.textdemo.broadcastreceiver;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.ToastUtils;

import javax.security.auth.callback.CallbackHandler;

public class RecivierAty extends AppCompatActivity {
    private MyBroadcastReceiver receiver;
    private  ChangeTextView changeTextView;
    private TextView textView;
    private boolean change = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recivier_aty);
        setTitle("测试广播");
        textView  = (TextView) findViewById(R.id.textView2);
        changeTextView = new ChangeTextView() {
            @Override
            public void giveA(String s) {
                textView.setText(s);
            }
        };
        receiver = new MyBroadcastReceiver(changeTextView);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("guo.com.example.MyBroadcast");
        registerReceiver(receiver, intentFilter);//接口回调的时候 必须使用静态注册；
    }

    public void sendA(View view) {

        Intent intent = new Intent();
        intent.setAction("guo.com.example.MyBroadcast");
        if (change){
            intent.putExtra("666","点击A");
            change =false;
        }else {
            change =true;
            intent.putExtra("666","变身卡布达");
        }

        sendBroadcast(intent);

    }

    public void sendB(View view) {
        Intent intent = new Intent();
        intent.setAction("guo.com.example.MyBroadcastB");
        intent.putExtra("666","我没启动B");
        sendBroadcast(intent);
    }
}
