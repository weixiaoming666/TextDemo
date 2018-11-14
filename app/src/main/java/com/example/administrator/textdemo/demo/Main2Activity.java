package com.example.administrator.textdemo.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.textdemo.BaseActivity;
import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.demo.fingerprint.LoginActivity;
import com.example.administrator.textdemo.demo.recyclerview.RecyclerviewActivity;
import com.example.administrator.textdemo.demoZSZX.Main3Activity;
import com.example.administrator.textdemo.utils.TimeUtils;

public class Main2Activity extends BaseActivity {
    private TextView tv_back_show;
    private TextView tv_time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setViewTitle(R.layout.activity_main2);
        setBaseTitle("一些突然想写的demo");
        tv_back_show = findViewById(R.id.tv_back_show);
        tv_time = findViewById(R.id.tv_time);
    }


    public void demoIntentData(View view) {
        Intent intent = new Intent(this,ShowDemoIntentData.class);

        intent.putExtra("name","卫晓明");
        intent.putExtra("age",26);
        Bundle bundle = new Bundle();
        bundle.putInt("id",89757);
        bundle.putString("who","me");
        intent.putExtras(bundle);
        intent.putExtra("user", new UserBean("序列化的卫晓明","乐成大厦A座 706"));
        startActivityForResult(intent,666);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==666&&resultCode==1){//requestCode 请求码  判断那个请求，以及请求意义（配置）
           String name =  data.getStringExtra("name");
            tv_back_show.setTextColor(getResources().getColor(R.color.red));
            tv_back_show.setText(name);
        }
    }

    public void timeChange(View view) {
        tv_time.setText(TimeUtils.date2TimeStamp("2018-08-29",TimeUtils.BAR_YMD)+"");
    }

    public void demoFingerprintTest(View view) {
        startActivity(new Intent(this,LoginActivity.class));
    }

    public void demoRecyclerview(View view) {
        startActivity(new Intent(this,RecyclerviewActivity.class));
    }

    public void demoZSZX(View view) {

//        startActivity(new Intent(this,ZszxMainActivity.class));
        startActivity(new Intent(this,Main3Activity.class));
    }
}
