package com.example.administrator.textdemo.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.ToastUtils;

public class BtextAty extends AppCompatActivity {
//专门的测试
    private  MyBroadcastReceiverB receiver = new MyBroadcastReceiverB();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btext_aty);
    }


    static class MyBroadcastReceiverB extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            ToastUtils.shortgmsg(context,intent.getStringExtra("666"));
        }
    }
}
