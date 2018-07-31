package com.example.administrator.textdemo.broadcastreceiver;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.textdemo.R;

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
                textView.setText(s);//这里也是接口回调
            }
        };
        receiver = new MyBroadcastReceiver(changeTextView);
//        receiver.setChangeTextView(changeTextView);

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("guo.com.example.MyBroadcast");
        registerReceiver(receiver, intentFilter);//接口回调的时候 必须使用静态注册；
    }

    public void sendA(View view) {
        receiver.setChangeTextView(changeTextView);
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

    @Override
    protected void onDestroy() {
        unregisterReceiver(receiver);//接口回调的时候 必须使用静态注册；
        super.onDestroy();
    }
}
