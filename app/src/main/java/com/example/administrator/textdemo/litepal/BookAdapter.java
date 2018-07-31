package com.example.administrator.textdemo.litepal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.litepal.table.BookBean;
import com.example.administrator.textdemo.view.dialog.MyDialog;

import java.util.List;

/**
 * Created by wxm on 2018/6/14.
 */
public class BookAdapter extends BaseAdapter {
    private List<BookBean> datas;
    private LayoutInflater layoutInflater;
    private Context context;

    public BookAdapter(List<BookBean> datas, Context context) {
        this.datas = datas;
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public int getCount() {
        return datas.size()>0?datas.size():0;
    }

    @Override
    public BookBean getItem(int i) {
        return datas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, final ViewGroup viewGroup) {
        ViewHolder holder ;
        if (view == null){
            view = layoutInflater.inflate(R.layout.item_litepal_book,viewGroup,false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        holder.price.setText(getItem(i).getPrice());
        holder.name.setText(getItem(i).getName());
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             View   view1 = layoutInflater.inflate(R.layout.item_dialog_book,null);
                setData(view1,getItem(i));
                MyDialog myDialog  = new MyDialog(context,view1);
              myDialog.show();
            }
        });
        return view;
    }

    private void setData(View view1, BookBean item) {

        ((TextView) view1.findViewById(R.id.et_name)).setText("书名--->"+item.getName());
        ((TextView) view1.findViewById(R.id.et_id)).setText("id--->"+item.getId()+"");
        ((TextView) view1.findViewById(R.id.et_address)).setText("地址--->"+item.getAddress());
        ((TextView) view1.findViewById(R.id.et_price)).setText("单价--->"+item.getPrice());
        ((TextView) view1.findViewById(R.id.et_cotent)).setText("内容简介--->"+item.getContet());
        ((TextView) view1.findViewById(R.id.et_author)).setText("作者--->"+item.getAuthor());

;

    }

    class ViewHolder{
        private TextView name,price;
        public ViewHolder(View view) {
                name  = view.findViewById(R.id.tv_name);
                price  = view.findViewById(R.id.tv_price);
        }
    }
    public void dataChanges( List<BookBean> datas){
        this.datas.clear();
        this.datas .addAll(datas) ;
        notifyDataSetChanged();
    }


}
