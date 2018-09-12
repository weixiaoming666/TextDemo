package com.example.administrator.textdemo.view.dialog;

import android.content.Context;

import com.example.administrator.textdemo.view.MyPopupWindow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxm on 2018/8/16.
 * 随便写的弹出 windon
 */
public abstract class MapChosePopwindon extends MyPopupWindow {


    public MapChosePopwindon(Context context, List<String> showDatas) {
        super(context,showDatas);


    }

    @Override
    public void setShowData() {
        spData= new ArrayList<>();
        strData= new ArrayList<>();
        for (int i = 0; i < datas.size(); i++) {
            spData.add(datas.get(i));
            strData.add(i+"");
        }
    }

    @Override
    public void getChose(String chose, int i, String pattern) {
        getChose(chose,i);
    }
    public abstract void getChose(String chose, int i);
}
