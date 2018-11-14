package com.example.administrator.textdemo.demoZSZX.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.demoZSZX.BaseFragment;

/**
 * Created by wxm on 2018/11/14.
 * 分类页面
 */
public class ClassifyFragment extends BaseFragment {
    View view;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        if (view == null) {
            view = inflater.inflate(R.layout.fragment_zszx_classify, container, false);
            bindView(view);
        }
        return view;
    }

    private void bindView(View view) {

    }

    @Override
    public View initView() {
        return null;
    }
}
