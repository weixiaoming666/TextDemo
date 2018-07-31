package com.example.administrator.textdemo.litepal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.EditText;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.ToastUtils;
import com.example.administrator.textdemo.litepal.table.BookBean;

import org.litepal.LitePal;

import java.util.List;

public class LitepalAty extends AppCompatActivity {
    private EditText et_name;
    private EditText et_id;
    private EditText et_address;
    private EditText et_price;
    private EditText et_cotent;
    private EditText et_location;
    private EditText et_author;
    private EditText et_find;
    private String      name_find;
    private String      name_del;
    private EditText et_del;
    private ListViewCompat lv;
    private MyDB myDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liteoal_aty);
        bindView();


    }

    private void bindView() {
        et_name = (EditText) findViewById(R.id.et_name);
        et_id = (EditText) findViewById(R.id.et_id);
        et_address = (EditText) findViewById(R.id.et_address);
        et_price = (EditText) findViewById(R.id.et_price);
        et_cotent = (EditText) findViewById(R.id.et_cotent);
        et_location = (EditText) findViewById(R.id.et_location);
        et_author = (EditText) findViewById(R.id.et_author);
        et_find = (EditText) findViewById(R.id.find);
        et_del = (EditText) findViewById(R.id.del);
        lv = (ListViewCompat) findViewById(R.id.lv);

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

        switch (Type){
            case ConfigType.DB_ADD_TYPE:
                BookBean bookBean = new BookBean(name,id,price,content,author,address);
                bookBean.save();
                break;
            case ConfigType.DB_DEL_TYPE:
                LitePal.deleteAll(BookBean.class,"name=?",name_del);
                break;
            case ConfigType.DB_UP_TYPE:
                BookBean bookBean1 = new BookBean(name,id,price,content,author,address);
                bookBean1.saveOrUpdate("name=?",name_find);
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
        if (et_del.getText().toString().isEmpty()){
            ToastUtils.centermsg(this,"删除的书名");
        }else {
            name_del =et_del.getText().toString();
            LitePal.deleteAll(BookBean.class,"name=?",name_del);
        }

    }


    private BookAdapter adapter;
    public void findBook(View view) {
        List<BookBean> beanList = LitePal.findAll(BookBean.class);
        if (beanList.isEmpty()){
            ToastUtils.centermsg(this,"查无此书");
        }else {
            if (adapter == null){
                adapter = new BookAdapter(beanList,this);
                lv.setAdapter(adapter);
            }else {
             adapter.dataChanges(beanList);
            }


        }
    }

    public void upBook(View view) {
        if (et_find.getText().toString().isEmpty()){
            ToastUtils.centermsg(this,"请输入更新书名");
        }else {
            name_find =et_find.getText().toString();
            findBookByName(name_find);
        }

    }

    private void findBookByName(String name ){
        List<BookBean> beanList = LitePal.where("name=?",name).find(BookBean.class);
        if (beanList.isEmpty()){
            ToastUtils.centermsg(this,"查无此书");
        }else {
            if (adapter == null){
                adapter = new BookAdapter(beanList,this);
                lv.setAdapter(adapter);
            }else {
                adapter.dataChanges(beanList);
            }


        }
    }
}
