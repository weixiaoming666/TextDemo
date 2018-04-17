package com.example.administrator.textdemo.view.adddelview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.administrator.textdemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/16.
 */

public class RecyclerViewTextAty extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RVAdapter rvAdapter;
    List<AddDelBean> datas;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_rlv_text);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        setData();
    }

    private void setData() {
        datas = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            AddDelBean addDelBean = new AddDelBean(i*10,i);
            AddDelBean addDelBean2 = new AddDelBean(i*5,i+1);
            datas.add(addDelBean);
            datas.add(addDelBean2);
        }
        rvAdapter = new RVAdapter(datas);
        recyclerView.setAdapter(rvAdapter);
    }
  private int num = 1;
    public void changeItemNum(View view) {
        recyclerView.setLayoutManager(new GridLayoutManager(this, num));
        if (num<5){
            num++;
        }else {
            num=1;
        }
    }
}
