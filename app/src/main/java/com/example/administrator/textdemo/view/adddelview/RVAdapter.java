package com.example.administrator.textdemo.view.adddelview;

import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.textdemo.R;

import java.util.List;

/**
 * Created by Administrator on 2018/4/16.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder> {
    private List<AddDelBean> datas;

    public RVAdapter(List<AddDelBean> datas) {
        this.datas = datas;
    }

    @Override
    public RVAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
            AddDelBean addDelBean = datas.get(position);
        if(position == 0){
            holder.bookImage.setImageResource(R.mipmap.ic_launcher_round);
            holder.bookadddel.setReplenish(true);
            return;
        }
            setData(holder,addDelBean,position);
    }

    private void setData(final ViewHolder holder, AddDelBean addDelBean, final int position) {
        if (position%2==0){
            holder.bookImage.setImageResource(R.drawable.bookdemo);
        }else {
            holder.bookImage.setImageResource(R.drawable.bookbg);
        }
        holder.bookadddel.setCount(addDelBean.getCount());
        holder.bookadddel.setMaxCount(addDelBean.getMaxCount());
        holder.bookadddel.setReplenish(addDelBean.isReplenish());
        holder.bookadddel.setOnAddDelListener(new IOnAddDelListener() {
            @Override
            public void onAddSuccess(int count) {
                holder.bookadddel.setCount(count);
            }

            @Override
            public void onAddFailed(int count, FailType failType) {

            }

            @Override
            public void onDelSuccess(int count) {
                holder.bookadddel.setCount(count);
            }

            @Override
            public void onDelFaild(int count, FailType failType) {

            }
        });
    }


    @Override
    public int getItemCount() {
        return datas.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView bookImage;
        AnimShopButton bookadddel;

        public ViewHolder(View view) {
            super(view);
            bookImage = view.findViewById(R.id.iv_rvtext);
            bookadddel =  view.findViewById(R.id.addDelView);
        }
    }
}
