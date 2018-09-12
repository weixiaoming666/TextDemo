package com.example.administrator.textdemo.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.textdemo.BaseActivity;
import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.utils.ToastUtils;

/**
 * Created by wxm on 2018/8/13.
 * Intent 传递数据
 */
public class ShowDemoIntentData extends BaseActivity{
    private TextView tv_intent;
    private TextView tv_bundle;
    private TextView tv_parcelable;
    private EditText editText;
    private Button bt_back;
    private String backString="";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setViewTitle(R.layout.show_demo_intent_data_aty);
        tv_intent =  findViewById(R.id.tv_intent);
        tv_bundle = findViewById(R.id.tv_bundle);
        tv_parcelable = findViewById(R.id.tv_parcelable);
        editText = findViewById(R.id.editText);
        bt_back = findViewById(R.id.bt_back);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        UserBean userBean = intent.getParcelableExtra("user");
//         java字符串格式化：String.format()方法的使用 http://kgd1120.iteye.com/blog/1293633
//      基本传递方式
        tv_intent.setText(String.format("name=%s,age=%d,demo=%f",intent.getStringExtra("name"),intent.getIntExtra("age",6),8.00));
//        bundle 传递
        tv_bundle.setText(String.format("who=%s,id=%d",bundle.getString("who"),bundle.getInt("id",-100)));
//      自定义类型序列化传值
        tv_parcelable.setText(String.format("userBean Info(username=%s,address=%s)",userBean.getName(),userBean.getAddress()));
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                backString = editable.toString();
            }
        });
        bt_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (backString.isEmpty()){
                    ToastUtils.centermsg(context,"请填写返回name");
                }else {
                    Intent intent = new Intent();
                    intent.putExtra("name",backString);
                    setResult(1,intent);//结果码  可以做成常量配置  判断结果意义
                    finish();
                }
            }
        });

    }
}
