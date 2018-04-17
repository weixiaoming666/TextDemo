package com.example.administrator.textdemo.view.adddelview;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.administrator.textdemo.R;

/**
 * Created by Administrator on 2018/4/16.
 */

public class AnimButtonAty extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_animo_button);
    }


    public void jumAtyRV(View view) {
        startActivity(new Intent(AnimButtonAty.this,RecyclerViewTextAty.class));
    }
}
