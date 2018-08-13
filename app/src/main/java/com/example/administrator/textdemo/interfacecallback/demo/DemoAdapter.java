package com.example.administrator.textdemo.interfacecallback.demo;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;

import com.example.administrator.textdemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxm on 2018/8/9.
 */
public class DemoAdapter extends BaseAdapter {
    List<String> datas = new ArrayList<>();
    private LayoutInflater layoutInflater;

    public DemoAdapter(Context context) {
        layoutInflater = LayoutInflater.from(context);
        for (int i = 0; i < 6; i++) {
            datas.add("");
        }
    }
    public List<String>  getData(){
        return datas;
    }
    @Override
    public int getCount() {

        return 6;
    }

    @Override
    public Object getItem(int i) {
        return getItem(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder ;
        final int position = i;
        if (view ==null){
           view =  layoutInflater.inflate(R.layout.item_demo_sumbit,null);
           viewHolder = new ViewHolder(view);
           view.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.et_sumbit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                  if (editable!=null&&!editable.toString().isEmpty()){
                      datas.add(position,editable.toString());
                  }

            }
        });
        return view;
    }

     class ViewHolder {
        private EditText et_sumbit;

         public ViewHolder(View view) {
             this.et_sumbit = view.findViewById(R.id.et_sumbit);
         }
     }
}
