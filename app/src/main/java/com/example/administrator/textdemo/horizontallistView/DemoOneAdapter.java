package com.example.administrator.textdemo.horizontallistView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.textdemo.R;

import java.util.List;
import java.util.zip.Inflater;

import static com.example.administrator.textdemo.R.id.iv_demo_one;
import static com.example.administrator.textdemo.R.id.tv_demo_one;

/**
 * Created by Administrator on 2018/3/30.
 */

public class DemoOneAdapter extends BaseAdapter{
    List<String> datas;
    LayoutInflater layoutInflater;
    Context context;

    public DemoOneAdapter(List<String> datas, Context context) {
        this.datas = datas;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return 70;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder= null;
//        if (convertView ==null){
            convertView = layoutInflater.inflate(R.layout.item_demo_one_hlv,parent, false);
            holder = new ViewHolder(convertView);
//            convertView.setTag(holder);
//        }else{
//            holder = (ViewHolder) convertView.getTag();
//        }
        if (position ==1||position%2!=0){
            holder.tv.setText("张三"+position);
            ViewGroup.LayoutParams params = holder.iv.getLayoutParams();
            params.height =300;
            params.width = 263*2;
            holder.iv.setLayoutParams(params);
            holder.iv.setBackgroundColor(666);
            return convertView;
        }

            holder.tv.setText("张三"+position);

        return convertView;
    }
    class ViewHolder{
        ImageView iv;
        TextView tv;

        public ViewHolder(View contenView) {
            iv = (ImageView) contenView.findViewById(iv_demo_one);
            tv = (TextView) contenView.findViewById(tv_demo_one);
        }
    }
}
