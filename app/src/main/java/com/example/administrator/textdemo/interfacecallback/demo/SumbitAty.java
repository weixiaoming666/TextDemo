package com.example.administrator.textdemo.interfacecallback.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ListView;

import com.example.administrator.textdemo.BaseActivity;
import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.utils.ToastUtils;

import java.util.List;

/**
 * Created by wxm on 2018/8/9.
 */
public class SumbitAty extends BaseActivity{
    private ListView lv_demo;
    private DemoAdapter adapter;
    List<String> data;
    private DataIterfaceIml dataIterfaceIml = new DataIterfaceIml() {
        @Override
        public void getData(List<String> datas) {
//           获取adapter中数据
            data = datas;
        }
    };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setViewTitle(R.layout.sumbit_aty);
        setBaseTitle("aty中提交数据");
        lv_demo = findViewById(R.id.lv_demo);
        initData();

    }

    private void initData() {
        if (adapter == null){
            adapter = new DemoAdapter(context);
        }
        lv_demo.setAdapter(adapter);
        

    }

    //提交数据
    public void bt_subitok(View view) {
//        处理传递出来的数据
        data = adapter.getData();
        ToastUtils.centermsg(context,data.toString());
    }
}
