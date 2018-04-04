package com.example.administrator.textdemo.view.viewpage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.textdemo.R;

import comulez.github.droplibrary.DropIndicator;
import comulez.github.droplibrary.DropViewPager;

// https://github.com/Ulez/DropIndicator
//https://blog.csdn.net/s122ktyt/article/details/55798658
public class ViewPageDemo1 extends AppCompatActivity {
    private DropIndicator dropIndicator;
    private DropViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_page_demo1);
        dropIndicator = (DropIndicator) findViewById(R.id.circleIndicator);
        viewPager = (DropViewPager) findViewById(R.id.DropViewPager);
        FragmentManager manager =getSupportFragmentManager();

        viewPager.setAdapter(new FragmentStatePagerAdapter(manager) {

            @Override
            public Fragment getItem(int position) {
                return new TextFragment(position);
            }

            @Override
            public int getCount() {
                return 4;
            }
        });
        dropIndicator.setViewPager(viewPager);
    }
}
