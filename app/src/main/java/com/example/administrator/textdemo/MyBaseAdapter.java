package com.example.administrator.textdemo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by wxm on 2018/8/1.
 */
public abstract class MyBaseAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return getNum();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return getContenView(i, view,viewGroup);

    }
    public abstract View getContenView(int i, View view, ViewGroup viewGroup);
    public abstract int getNum();

}
