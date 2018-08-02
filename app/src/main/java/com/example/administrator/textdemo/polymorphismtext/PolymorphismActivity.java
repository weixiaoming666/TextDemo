package com.example.administrator.textdemo.polymorphismtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.utils.ToastUtils;

public class PolymorphismActivity extends AppCompatActivity {
    // Content View Elements
    private Father father;
    private TextView textView;
    private Button button;
    private Button button1;
    int type  = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polymorphism);
        bindViews();
        initData();
    }

    private void initData() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (father == null||type ==1){
                    SonOne sonOne  =  new SonOne(PolymorphismActivity.this);
                    sonOne.myname();
                    father = sonOne;
                    father.setListener(sonOne);
                textView.setText("我是老大");}
                else{
                    SonTwo two  =  new SonTwo(PolymorphismActivity.this);
                    two.myname();//可以做自己的操作，父类再去做父类操作
                    father = two;
                    father.setListener(two);
                    textView.setText("我是老二");}
                if (type == 1){
                    type = 2;
                }else {
                    type = 1;
                }
                }

        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(father == null){
                    ToastUtils.shortgmsg(PolymorphismActivity.this,"快变身");
                }else {
                    if (type ==1){
                        father.diaoLong((long) 50.6F);
                    }else {
                        father.papapaWith("波多野结衣");
                    }
                }
            }
        });
    }

    // End Of Content View Elements

    private void bindViews() {
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button1);
    }


}
