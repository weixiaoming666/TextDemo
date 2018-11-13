package com.example.administrator.textdemo.demoZSZX;

import android.os.Bundle;

import com.example.administrator.textdemo.R;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZszxMainActivity extends ZSZXBaseActivity {
    List<String> title = new ArrayList<>()  ;
    private  Integer[] imgs = {R.drawable.add_task_more, R.drawable.ic_account_box_black_24dp, R.drawable.blue_duigou};
    private  String[] titles = {"666", "777", "888"};

    private Banner banner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setViewLoad(R.layout.activity_zszx_main, R.id.ll_base_title, R.id.ll_content);
        setBaseTitle("测试demo首页");
        initBinner();
    }

    private void initBinner() {
         banner = (Banner) findViewById(R.id.banner);
        title.addAll(Arrays.asList(titles));
        //设置banner样式

         //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合

        banner.setImages(Arrays.asList(imgs));
        //设置banner动画效果
         banner.setBannerAnimation(Transformer.DepthPage);
        // 设置标题集合（当banner样式有显示title时）

         //设置自动轮播，默认为true
        banner.isAutoPlay(true);
        //设置轮播时间
        banner.setDelayTime(1500);
        //设置指示器位置（当banner模式中有指示器时）
        banner.setIndicatorGravity(BannerConfig.CENTER);
        //banner设置方法全部调用完毕时最后调用
        banner.start();


    }


}
