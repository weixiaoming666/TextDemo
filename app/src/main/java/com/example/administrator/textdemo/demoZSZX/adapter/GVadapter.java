package com.example.administrator.textdemo.demoZSZX.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.textdemo.MyBaseAdapter;
import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.demoZSZX.MyCircleImageView;

import java.util.List;

/**
 * Created by wxm on 2018/11/13.
 */
public class GVadapter extends MyBaseAdapter {
    List<String> names;
    List<Integer> images;
    LayoutInflater inflater;
    private Context context;
    int scrrenWidth=0;
    int scrrenHight=0;

    public GVadapter(List<String> names, List<Integer> images, Context context) {
        this.names = names;
        this.images = images;
        this.context = context;
        inflater = LayoutInflater.from(context);
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        scrrenWidth = wm.getDefaultDisplay().getWidth();
        scrrenHight = wm.getDefaultDisplay().getHeight();
    }

    @Override
    public View getContenView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            view = inflater.inflate(R.layout.item_image_show_gv,null);
            AbsListView.LayoutParams params=new AbsListView.LayoutParams(scrrenWidth/5,scrrenHight/10);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        Glide.with(context).load(images.get(i)).into(holder.iv);
        holder.tv.setText(names.get(i));
        return view;
    }

    @Override
    public int getNum() {
        return 8;
    }
    class ViewHolder{
        MyCircleImageView iv;
        TextView tv;
        public ViewHolder(View view) {
          iv =  view.findViewById(R.id.iv);
          tv =  view.findViewById(R.id.tv);
        }
    }
}
