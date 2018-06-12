package com.example.administrator.textdemo.view.ryglearn.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.view.ryglearn.ViewText;

public class View1Activity extends AppCompatActivity {
    ViewText viewText ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view1);
        viewText = (ViewText) findViewById(R.id.vt);
        viewText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        viewText.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                return false;
            }
        });
    }
}
