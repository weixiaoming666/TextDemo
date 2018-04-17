package com.example.administrator.textdemo;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.administrator.textdemo.aidl.AIDLAty;
import com.example.administrator.textdemo.horizontallistView.DemoOne;
import com.example.administrator.textdemo.intentfilter.IntentFilterDemoAty;
import com.example.administrator.textdemo.interfacecallback.Aaty;
import com.example.administrator.textdemo.mvc.WeatherAtyTest;
import com.example.administrator.textdemo.mvpdemo.MvpDemoAty;
import com.example.administrator.textdemo.mvpdemo.MyMVPdemoAty;
import com.example.administrator.textdemo.view.adddelview.AnimButtonAty;
import com.example.administrator.textdemo.view.groupviewaddviewanimotion.DiscrollViewAty;
import com.example.administrator.textdemo.view.miclockview.MIClockViewAty;
import com.example.administrator.textdemo.view.radarview.RadarActivity;
import com.example.administrator.textdemo.view.viewpage.ViewPageDemo1;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void start(View view) {
        startActivity(new Intent(this, DemoOne.class));
    }


    public void intentFilter(View view) {//测试aty过滤条件
        Intent intent = new Intent("woxihaunni");
//        intent.addCategory("android.intent.category.TEXT_ONE");
//        intent.addCategory("android.intent.category.TEXT_TWO");
//        intent.setDataAndType(Uri.parse("http://www.baidu.com"),"image/*");
           getPackageManager().resolveActivity(intent, PackageManager.MATCH_DEFAULT_ONLY);//获取所有符合条件的aty
        if (intent.resolveActivity(getPackageManager())!=null){//判断是否含有这样的aty
            ToastUtils.shortgmsg(this,"符合条件的aty"+intent.resolveActivity(getPackageManager()).toShortString());
            startActivity(intent);
        }else {
            ToastUtils.shortgmsg(this,"没有符合条件的aty");
            intent = new Intent(this, IntentFilterDemoAty.class);
            startActivity(intent);
        }
    }

//    aidl 的深入了解
    public void aidlText(View view) {
        startActivity(new Intent(this,AIDLAty.class));
    }

//  自定义 view 水滴view 的实现
    public void viewpageDemo1(View view) {
        startActivity(new Intent(this, ViewPageDemo1.class));
    }
// 自定义view 小米时钟
    public void miClock(View view) {
        jump2Aty(MIClockViewAty.class);
    }

//mvp 模式展示
    public void mvpDemo(View view) {
        jump2Aty(MyMVPdemoAty.class);
    }
    private void jump2Aty(Class aClass){
        startActivity(new Intent(this,aClass));
    }

    public void myClock(View view) {
        jump2Aty(MvpDemoAty.class);
    }
    //mvc 模式展示
    public void jumpmvc(View view) {
        jump2Aty(WeatherAtyTest.class);
    }
// 接口回调
    public void callback(View view) {
        jump2Aty(Aaty.class);}

    public void jumpRader(View view) {
        jump2Aty(RadarActivity.class);
    }

    public void jumpDiscroll(View view) {
        jump2Aty(DiscrollViewAty.class);
    } public void shopAddDel(View view) {
        jump2Aty(AnimButtonAty.class);
    }
}



