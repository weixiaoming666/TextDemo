package com.example.administrator.textdemo;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.textdemo.aidl.AIDLAty;
import com.example.administrator.textdemo.broadcastreceiver.RecivierAty;
import com.example.administrator.textdemo.demo.Main2Activity;
import com.example.administrator.textdemo.gaodemap.MainMapActivity;
import com.example.administrator.textdemo.grep.GrepAty;
import com.example.administrator.textdemo.horizontallistView.DemoOne;
import com.example.administrator.textdemo.intentfilter.IntentFilterDemoAty;
import com.example.administrator.textdemo.interfacecallback.Aaty;
import com.example.administrator.textdemo.litepal.LitepalAty;
import com.example.administrator.textdemo.mvc.WeatherAtyTest;
import com.example.administrator.textdemo.mvpdemo.MvpDemoAty;
import com.example.administrator.textdemo.mvpdemo.MyMVPdemoAty;
import com.example.administrator.textdemo.polymorphismtext.PolymorphismActivity;
import com.example.administrator.textdemo.utils.ToastUtils;
import com.example.administrator.textdemo.video.VedioActivity;
import com.example.administrator.textdemo.view.MyPopupWindow;
import com.example.administrator.textdemo.view.ShowMePop;
import com.example.administrator.textdemo.view.adddelview.AnimButtonAty;
import com.example.administrator.textdemo.view.dialog.TextDialog;
import com.example.administrator.textdemo.view.groupviewaddviewanimotion.DiscrollViewAty;
import com.example.administrator.textdemo.view.miclockview.MIClockViewAty;
import com.example.administrator.textdemo.view.myview.MyViewAty;
import com.example.administrator.textdemo.view.radarview.RadarActivity;
import com.example.administrator.textdemo.view.ryglearn.ViewRXGAty;
import com.example.administrator.textdemo.view.viewpage.ViewPageDemo1;
import com.google.gson.Gson;

public class MainActivity extends BaseActivity {

    private MyPopupWindow myPopupWindow;
    private TextView tv_demo;
    private  ShowMePop showMePop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setViewTitle(R.layout.activity_main);
        setBaseTitle("首页目录测试列表");
        setRight1ResouceId(R.mipmap.me_right);
        tv_demo = (TextView) findViewById(R.id.tv_demo);
        baseLayout.iv_base_right1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (showMePop == null){
                    showMePop   = new ShowMePop(context);
                }
                showMePop.showAtLocation( baseLayout.iv_base_right1,17,0,0);
            }
        });
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
// 购物车增减
    public void jumpDiscroll(View view) {
        jump2Aty(DiscrollViewAty.class);
    } public void shopAddDel(View view) {
        jump2Aty(AnimButtonAty.class);
    }
//
    public void learnView(View view) {
        jump2Aty(MyViewAty.class);
    }
//  显示dialog
    public void showDialog(View view) {
        TextDialog textDialog  = new TextDialog(this,true);
        textDialog.show();
    }

    public void showDuoTai(View view) {
        jump2Aty(PolymorphismActivity.class);
    }
//  测试广播
    public void showReciver(View view) {
        jump2Aty(RecivierAty.class);
    }

    public void viewLeanRYG(View view) {
        jump2Aty(ViewRXGAty.class);

    }

//litepal   数据库使用
    public void litepal(View view) {
        jump2Aty(LitepalAty.class);
    }

    String s = "{\n" +
            "    \"log_id\": 2648325511,\n" +
            "    \"direction\": 0,\n" +
            "    \"image_status\": \"normal\",\n" +
            "    \"idcard_type\": \"normal\",\n" +
            "    \"edit_tool\": \"Adobe Photoshop CS3 Windows\",\n" +
            "    \"words_result\": {\n" +
            "        \"住址\": {\n" +
            "            \"location\": {\n" +
            "                \"left\": 267,\n" +
            "                \"top\": 453,\n" +
            "                \"width\": 459,\n" +
            "                \"height\": 99\n" +
            "            },\n" +
            "            \"words\": \"南京市江宁区弘景大道3889号\"\n" +
            "        },\n" +
            "        \"公民身份号码\": {\n" +
            "            \"location\": {\n" +
            "                \"left\": 443,\n" +
            "                \"top\": 681,\n" +
            "                \"width\": 589,\n" +
            "                \"height\": 45\n" +
            "            },\n" +
            "            \"words\": \"330881199904173914\"\n" +
            "        },\n" +
            "        \"出生\": {\n" +
            "            \"location\": {\n" +
            "                \"left\": 270,\n" +
            "                \"top\": 355,\n" +
            "                \"width\": 357,\n" +
            "                \"height\": 45\n" +
            "            },\n" +
            "            \"words\": \"19990417\"\n" +
            "        },\n" +
            "        \"姓名\": {\n" +
            "            \"location\": {\n" +
            "                \"left\": 267,\n" +
            "                \"top\": 176,\n" +
            "                \"width\": 152,\n" +
            "                \"height\": 50\n" +
            "            },\n" +
            "            \"words\": \"伍云龙\"\n" +
            "        },\n" +
            "        \"性别\": {\n" +
            "            \"location\": {\n" +
            "                \"left\": 269,\n" +
            "                \"top\": 262,\n" +
            "                \"width\": 33,\n" +
            "                \"height\": 52\n" +
            "            },\n" +
            "            \"words\": \"男\"\n" +
            "        },\n" +
            "        \"民族\": {\n" +
            "            \"location\": {\n" +
            "                \"left\": 492,\n" +
            "                \"top\": 279,\n" +
            "                \"width\": 30,\n" +
            "                \"height\": 37\n" +
            "            },\n" +
            "            \"words\": \"汉\"\n" +
            "        }\n" +
            "    },\n" +
            "    \"words_result_num\": 6\n" +
            "}";

    public void gson2hanzi(View view) {
//        一个莫名其妙的中文解析
        Gson gson = new Gson();
        Bean bean =  gson.fromJson(s,Bean.class);
       String SS =  bean.getWords_result().toString();
       String SS1 =  bean.getWords_result().toString();
    }
//正则表达式
    public void grep(View view) {
//        if (myPopupWindow == null){
//            myPopupWindow = new MyPopupWindow(this) {
//                @Override
//                public void getChose(String chose, int i) {
//                    ToastUtils.centermsg(MainActivity.this,chose+"---->"+i);
//                }
//            };
//        }
//        myPopupWindow.showAsDropDown(tv_demo);
        jump2Aty(GrepAty.class);
    }

    public void jumpDemo(View view) {
        jump2Aty(Main2Activity.class);
    }

    public void jumpGaodeMap(View view) {
        jump2Aty(MainMapActivity.class);
    }public void jumpVideo(View view) {
        jump2Aty(VedioActivity.class);
    }
}



