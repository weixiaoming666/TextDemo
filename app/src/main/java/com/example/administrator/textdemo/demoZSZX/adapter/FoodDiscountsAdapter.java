package com.example.administrator.textdemo.demoZSZX.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.textdemo.MyBaseAdapter;
import com.example.administrator.textdemo.R;

/**
 * Created by wxm on 2018/11/14.
 * 限时优惠
 */
public class FoodDiscountsAdapter  extends MyBaseAdapter {
    LayoutInflater inflater;
    private Context context;
    public FoodDiscountsAdapter( Context context) {

        this.context = context;
        inflater = LayoutInflater.from(context);

    }
    @Override
    public View getContenView(int i, View view, ViewGroup viewGroup) {
       ViewHolder holder;
        if (view == null){
            view = inflater.inflate(R.layout.item_food_discount,null);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        return view;

    }



    @Override
    public int getNum() {
        return 8;
    }
    class ViewHolder{
        TextView tv;
        public ViewHolder(View view) {

            tv =  view.findViewById(R.id.tv_parce2);
            tv.getPaint().setFlags(Paint. STRIKE_THRU_TEXT_FLAG); //中划线
//            setFlags(Paint. STRIKE_THRU_TEXT_FLAG|Paint.ANTI_ALIAS_FLAG); // 设置中划线并加清晰

        }
    }
}

