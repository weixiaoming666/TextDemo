package com.example.administrator.textdemo.demoZSZX.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by wxm on 2018/11/14.
 */
public class FragmentAdapter extends FragmentPagerAdapter {

    private List<Fragment> list;
    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }
    public FragmentAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int postion) {
        return list.get(postion);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}

