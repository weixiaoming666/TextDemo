package com.example.administrator.textdemo.demoZSZX.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.demoZSZX.BaseFragment;
import com.example.administrator.textdemo.demoZSZX.GlideImageLoader;
import com.example.administrator.textdemo.demoZSZX.MyListview;
import com.example.administrator.textdemo.demoZSZX.adapter.FoodBuyShowAdapter;
import com.example.administrator.textdemo.demoZSZX.adapter.FoodDiscountsAdapter;
import com.example.administrator.textdemo.demoZSZX.adapter.GVadapter;
import com.example.administrator.textdemo.demoZSZX.adapter.SpecialAdapter;
import com.example.administrator.textdemo.demoZSZX.view.MyGradView;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wxm on 2018/11/14.
 * 首页
 */
public class HomePageFragment extends BaseFragment {
    View view;
    List<String> title = new ArrayList<>()  ;
    private  Integer[] imgs = {R.drawable.add_task_more, R.drawable.ic_account_box_black_24dp, R.drawable.blue_duigou};
    private  String[] titles = {"666", "777", "888"};
    private  String[] names_gv = {"1111", "222", "333", "444", "555", "6666", "777", "8888"};
    private  Integer[] imgs_gv = {R.drawable.add_task_more, R.drawable.ic_account_box_black_24dp, R.drawable.blue_duigou, R.drawable.ic_account_box_black_24dp, R.drawable.blue_duigou, R.drawable.ic_account_box_black_24dp, R.drawable.blue_duigou, R.drawable.ic_account_box_black_24dp};
    private Banner banner;
    private MyGradView gv;
    private Banner banner_title;
    private MyListview mlv_rm;
    private MyListview mlv_ts;
    private MyGradView gv_xpsj;
    private MyGradView gv_xsyh;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        if (view == null) {
            view = inflater.inflate(R.layout.activity_zszx_main, container, false);
            bindView(view);
            initBinner();
        }
        return view;
    }

    @Override
    public View initView() {
        return null;
    }

    private void bindView(View view) {
        banner = (Banner) view.findViewById(R.id.banner);
        gv = view.findViewById(R.id.gv);
        banner_title = (Banner) view.findViewById(R.id.banner_title);
        mlv_rm = view.findViewById(R.id.mlv_rm);
        mlv_ts = view.findViewById(R.id.mlv_ts);
        gv_xpsj = view.findViewById(R.id.gv_xpsj);
        gv_xsyh = view.findViewById(R.id.gv_xsyh);
    }
    private void initBinner() {
        title.addAll(Arrays.asList(titles));
        //设置banner样式
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        banner.setBannerStyle(BannerConfig.NUM_INDICATOR);
        banner.setImages(Arrays.asList(imgs));
        //设置banner动画效果
        banner.setBannerAnimation(Transformer.DepthPage);

        // 设置标题集合（当banner样式有显示title时）
//        banner_title.setBannerTitles(Arrays.asList(names_gv));
        //设置自动轮播，默认为true

        //设置轮播时间
        banner.setDelayTime(1500);
        //设置指示器位置（当banner模式中有指示器时）
        banner.setIndicatorGravity(BannerConfig.CENTER);
        //banner设置方法全部调用完毕时最后调用
        banner.start();

        banner_title.setBannerStyle(BannerConfig.NUM_INDICATOR_TITLE);
        banner_title.setImageLoader(new GlideImageLoader());
        banner_title.setBannerAnimation(Transformer.DepthPage);
        banner_title.isAutoPlay(true);
        banner_title.setDelayTime(1500);
        banner_title.setIndicatorGravity(BannerConfig.RIGHT);
        banner_title.setImages(Arrays.asList(imgs_gv));
        banner_title.setBannerTitles(Arrays.asList(names_gv));
        banner_title.start();
        gv.setAdapter(new GVadapter(Arrays.asList(names_gv),Arrays.asList(imgs_gv),context));
        mlv_rm.setAdapter(new FoodBuyShowAdapter(context));
        gv_xsyh.setAdapter(new FoodDiscountsAdapter(context));
        mlv_ts.setAdapter(new SpecialAdapter(context));
        gv_xpsj.setAdapter(new FoodDiscountsAdapter(context));

    }
}
