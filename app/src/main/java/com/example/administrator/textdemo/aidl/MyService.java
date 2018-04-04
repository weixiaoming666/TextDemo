package com.example.administrator.textdemo.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
//https://blog.csdn.net/u011974987/article/details/51243539
public class MyService extends Service {
    public final static String TAG = "MyService";
    private  IBinder binder = new IMyAidlInterface.Stub() {
        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

        }

        @Override
        public String getInfo(String s) throws RemoteException {
            Log.i(TAG, s);
            return "我喜欢你是sercive";
        }
    };

    public MyService() {

    }



    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "onCreat");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return  binder;
    }
}
