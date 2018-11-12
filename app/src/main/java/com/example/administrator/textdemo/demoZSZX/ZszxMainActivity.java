package com.example.administrator.textdemo.demoZSZX;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.demoZSZX.adapter.VpAdapter;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZszxMainActivity extends ZSZXBaseActivity {
    private ViewPager vp_guide;
    private VpAdapter vpAdapter;
    List<Integer> images = new ArrayList<>()  ;
    List<String> title = new ArrayList<>()  ;
    private  int[] imgs = {R.drawable.add_task_more, R.drawable.ic_account_box_black_24dp, R.drawable.blue_duigou};
    private  String[] titles = {"666", "777", "888"};
    private ArrayList<ImageView> imageViews;
    private ImageView[] dotViews;//小圆点
    private VpAdapter adapter;
    private LinearLayout dot_Layout;
    private ViewPager vp;
    private Banner banner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setViewLoad(R.layout.activity_zszx_main, R.id.ll_base_title, R.id.ll_content);
        setBaseTitle("测试demo首页");
        initView();
        initBinner();
    }

    private void initBinner() {
         banner = (Banner) findViewById(R.id.banner);
        title.addAll(Arrays.asList(titles));
        images.add(0,imgs[0]);
        images.add(1,imgs[1]);
        images.add(2,imgs[2]);
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

    private void initView() {
        dot_Layout = (LinearLayout) findViewById(R.id.dot_Layout);
        initImages();
        initDots();
        vp = (ViewPager) findViewById(R.id.vp);
        vpAdapter = new VpAdapter(imageViews);
        vp.setAdapter(vpAdapter);
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < dotViews.length; i++) {
                    if (position == i) {
                        dotViews[i].setSelected(true);
                    } else {
                        dotViews[i].setSelected(false);
                    }
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }

    private void initDots() {
        LinearLayout layout = (LinearLayout) findViewById(R.id.dot_Layout);
        LinearLayout.LayoutParams mParams = new LinearLayout.LayoutParams(20, 20);
        mParams.setMargins(10, 0, 10, 0);//设置小圆点左右之间的间隔
        dotViews = new ImageView[imgs.length]; //判断小圆点的数量，从0开始，0表示第一个
        for (int i = 0; i < imageViews.size(); i++) {
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(mParams);
            imageView.setImageResource(R.drawable.ic_3d_rotation_black_24dp);
            if (i == 0) {
                imageView.setSelected(true);//默认启动时，选中第一个小圆点
            } else {
                imageView.setSelected(false);
            }
            dotViews[i] = imageView;//得到每个小圆点的引用，用于滑动页面时，（onPageSelected方法中）更改它们的状态。
            layout.addView(imageView);//添加到布局里面显示
        }
    }

    private void initImages() { //设置每一张图片都填充窗口
        ViewPager.LayoutParams mParams = new ViewPager.LayoutParams();
        imageViews = new ArrayList<ImageView>();
        for (int i = 0; i < imgs.length; i++) {
            ImageView iv = new ImageView(this);
            iv.setLayoutParams(mParams);//设置布局
            iv.setImageResource(imgs[i]);//为ImageView添加图片资源
            iv.setScaleType(ImageView.ScaleType.FIT_XY);//这里也是一个图片的适配
            imageViews.add(iv);
            if (i == imgs.length - 1) { //为最后一张图片添加点击事件
                iv.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {

                        return true;
                    }
                });
            }
        }
    }
}
