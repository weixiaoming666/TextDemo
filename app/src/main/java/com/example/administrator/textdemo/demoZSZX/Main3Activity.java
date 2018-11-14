package com.example.administrator.textdemo.demoZSZX;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.demoZSZX.adapter.FragmentAdapter;
import com.example.administrator.textdemo.demoZSZX.fragment.ClassifyFragment;
import com.example.administrator.textdemo.demoZSZX.fragment.HomePageFragment;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {
    private android.support.v4.view.ViewPager vp;
    private RadioGroup rg;
    private RadioButton rb_1;
    private RadioButton rb_2;
    private RadioButton rb_3;
    private RadioButton rb_4;
    private RadioButton rb_5;
    private List<Fragment> list;
    private FragmentAdapter fragAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        hideBottomUIMenu();
        bindViews();
        bindListener();
        initData();
    }

    private void initData() {
        list = new ArrayList<Fragment>();
        list.add(new HomePageFragment());
        list.add(new ClassifyFragment());
        list.add(new HomePageFragment());
        list.add(new HomePageFragment());
        list.add(new HomePageFragment());
        fragAdapter = new FragmentAdapter(getSupportFragmentManager(), list);
        vp.setAdapter(fragAdapter);
        vp.setCurrentItem(0);
    }

    private void bindListener() {
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rb_1:
                        vp.setCurrentItem(0);
                        break;
                    case R.id.rb_2:
                        vp.setCurrentItem(1);
                        break;
                    case R.id.rb_3:
                        vp.setCurrentItem(2);
                        break;
                    case R.id.rb_4:
                        vp.setCurrentItem(3);
                        break;
                    case R.id.rb_5:
                        vp.setCurrentItem(4);
                        break;
                }

            }
        });
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        rb_1.setChecked(true);
                        break;
                    case 1:
                        rb_2.setChecked(true);
                        break;
                    case 2:
                        rb_3.setChecked(true);
                        break;
                    case 3:
                        rb_4.setChecked(true);
                        break;
                    case 4:
                        rb_5.setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void bindViews() {
        vp = (android.support.v4.view.ViewPager) findViewById(R.id.vp);
        rg = (RadioGroup) findViewById(R.id.rg);
        rb_1 = (RadioButton) findViewById(R.id.rb_1);
        rb_2 = (RadioButton) findViewById(R.id.rb_2);
        rb_3 = (RadioButton) findViewById(R.id.rb_3);
        rb_4 = (RadioButton) findViewById(R.id.rb_4);
        rb_5 = (RadioButton) findViewById(R.id.rb_5);
    }
    /**
  * 隐藏虚拟按键，并且全屏
     */
    protected void hideBottomUIMenu() {
//        //隐藏虚拟按键，并且全屏
//        if (Build.VERSION.SDK_INT > 11 && Build.VERSION.SDK_INT < 19) { // lower api
//            View v = this.getWindow().getDecorView();
//            v.setSystemUiVisibility(View.GONE);
//        } else if (Build.VERSION.SDK_INT >= 19) {
//            //for new api versions.
//            View decorView = getWindow().getDecorView();
//            int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
//                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_FULLSCREEN;
//            decorView.setSystemUiVisibility(uiOptions);
//        }

        if (Build.VERSION.SDK_INT >= 21) {
//            View decorView = getWindow().getDecorView();
//            int option = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
//            decorView.setSystemUiVisibility(option);
//            getWindow().setNavigationBarColor(Color.TRANSPARENT);
            getWindow().setStatusBarColor(Color.TRANSPARENT);

        }

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

}
