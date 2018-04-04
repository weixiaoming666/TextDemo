package com.example.administrator.textdemo.aidl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.ToastUtils;

public class AIDLAty extends AppCompatActivity {
    public final static String TAG = "MainActivity";
    private  IMyAidlInterface iMyAidlInterface;
//    private IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() {//设置死亡代理 避免异常终止
//        @Override
//        public void binderDied() {
//            if (iMyAidlInterface==null)return;
//            iMyAidlInterface.asBinder().unlinkToDeath(deathRecipient,0);
//            iMyAidlInterface=null;
//        }
//    };

    String s;
    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            iMyAidlInterface = IMyAidlInterface.Stub.asInterface(service);
//            try {
//                service.linkToDeath(deathRecipient,0);
//            } catch (RemoteException e) {
//                e.printStackTrace();
//            }
            ToastUtils.shortgmsg(AIDLAty.this, "连接Service 成功");
            try {
                 s = iMyAidlInterface.getInfo("我是Activity传来的字符串");
                Log.i(TAG, "从Service得到的字符串：" + s);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        @Override
        public void onServiceDisconnected(ComponentName name) {
            ToastUtils.shortgmsg(AIDLAty.this, "连接Service失败");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aidlaty);
        textView = (TextView) findViewById(R.id.tv_aldl_show);
        startAndBindService();
    }

    private void startAndBindService() {
        Intent service = new Intent(this, MyService.class);
        //startService(service);
        bindService(service, serviceConnection, Context.BIND_AUTO_CREATE);
    }
    private TextView textView;
    public void showAIDLString(View view) {
        textView.setText(s);
    }
}
