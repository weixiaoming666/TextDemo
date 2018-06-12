package com.example.administrator.textdemo.litepal;

import android.content.ContentValues;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.ToastUtils;

import org.litepal.LitePal;

import static android.R.attr.type;

public class LitepalAty extends AppCompatActivity {
    private EditText et_name;
    private EditText et_id;
    private EditText et_address;
    private EditText et_price;
    private EditText et_cotent;
    private EditText et_location;
    private EditText et_author;
    private MyDB myDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liteoal_aty);
        bindView();
        myDB = new MyDB(this, "book",null,1);

    }

    private void bindView() {
        et_name = (EditText) findViewById(R.id.et_name);
        et_id = (EditText) findViewById(R.id.et_id);
        et_address = (EditText) findViewById(R.id.et_address);
        et_price = (EditText) findViewById(R.id.et_price);
        et_cotent = (EditText) findViewById(R.id.et_cotent);
        et_location = (EditText) findViewById(R.id.et_location);
        et_author = (EditText) findViewById(R.id.et_author);

}
    private String getEtString(EditText editText) {
        String s = null;
        String hint = editText.getHint().toString();
        if (editText.getText()!=null&&!editText.getText().toString().isEmpty()){
            s = editText.getText().toString();
            return s;
        }else {

            return "...";
        }

    }
    private void getDatas(String name, int id, String price, String content, String author, String address,int Type){
        BookBean bookBean = new BookBean(name,id,price,content,author,address);
        switch (type){
            case ConfigType.DB_ADD_TYPE:
                bookBean.save();
                break;
            case ConfigType.DB_DEL_TYPE:
                LitePal.delete(BookBean.class,2);
                break;
            case ConfigType.DB_INSERT_TYPE:
                BookBean bean = LitePal.find(BookBean.class, 1);
                break;
            case ConfigType.DB_UP_TYPE:
                ContentValues values = new ContentValues();
                values.put("name", "卫晓明传");
                LitePal.update(BookBean.class,values,2);
                break;
        }
    }

    private void judge(int type) {
        String name = getEtString(et_name),price = getEtString(et_price),content = getEtString(et_cotent),location = getEtString(et_location),address = getEtString(et_address);
        String author = getEtString(et_author);
        int id = 0;
        if (name.equals("...")){
            ToastUtils.centermsg(this,"书名");
            return;
        }
        if (getEtString(et_id).equals("...")){
            ToastUtils.centermsg(this,"id");
            return;
        }else {
            id = Integer.parseInt(getEtString(et_id));
        }
        if ( address.equals("...")){
            ToastUtils.centermsg(this,"地址");
            return;
        }
        if ( price.equals("...")){
            ToastUtils.centermsg(this,"价钱");
            return;
        }
        if (content.equals("...")){
            ToastUtils.centermsg(this,"内容");

            return;
        }
        if ( location.equals("...")){
            location = "";
        }
        if ( author.equals("...")){
            ToastUtils.centermsg(this,"作者");
            return;
        }
        getDatas(name,id,price,content,author,address,type);
    }
// 增删改查
    public void addBook(View view) {
        judge(ConfigType.DB_ADD_TYPE);

    }

    public void delBook(View view) {
        judge(ConfigType.DB_DEL_TYPE);
    }

    public void upBook(View view) {
        judge(ConfigType.DB_UP_TYPE);
    }

    public void insertBook(View view) {
        BookBean bean = LitePal.findFirst(BookBean.class);
        BookBean bean1 = LitePal.findFirst(BookBean.class);


    }
}
