package com.example.administrator.textdemo.view;

/**
 * Created by wxm on 2018/8/1.
 */


import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.administrator.textdemo.MyBaseAdapter;
import com.example.administrator.textdemo.R;

import java.util.ArrayList;
import java.util.List;


/**
 * 学习PopupWindow
 * Created by 卫晓明
 */
public abstract class MyPopupWindow extends PopupWindow {

    Context mContext;
    private  LayoutInflater mInflater;
    private  View mContentView;
    private ListView lv_pop;
    private SpinnerAdapter adapter;
    List<String> spData;
    public MyPopupWindow(Context context) {
        super(context);

        this.mContext=context;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mContentView = mInflater.inflate(R.layout.layout_dialog,null);
        lv_pop = mContentView.findViewById(R.id.lv_pop);
         spData= new ArrayList<>();
        spData.add("请选择类型");
        spData.add("准备工作");
        spData.add("重点检查");
        spData.add("常规检查");
        spData.add("旁站见证");
        spData.add("质量验收");
        adapter=new SpinnerAdapter(spData);

        //设置View
        setContentView(mContentView);


        //设置宽与高
        setWidth(WindowManager.LayoutParams.MATCH_PARENT);

        setHeight(WindowManager.LayoutParams.WRAP_CONTENT);


        /**
         * 设置进出动画
         */
        setAnimationStyle(R.style.MyPopupWindow);


        /**
         * 设置背景只有设置了这个才可以点击外边和BACK消失
         */
        setBackgroundDrawable(new ColorDrawable());


        /**
         * 设置可以获取集点
         */
        setFocusable(true);//点击外边可以消失

//        /**
//         * 设置点击外边可以消失
//         */
//        setOutsideTouchable(true);
//
//        /**
//         *设置可以触摸
//         */
//        setTouchable(true);
//
//
//        /**
//         * 设置点击外部可以消失
//         */
//
//        setTouchInterceptor(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//
//                /**
//                 * 判断是不是点击了外部
//                 */
//                if(event.getAction()==MotionEvent.ACTION_OUTSIDE){
//                    return true;
//                }
//                //不是点击外部
//                return false;
//            }
//        });


        /**
         * 初始化View与监听器
         */
        initView();

        initListener();
    }




    private void initView() {
        lv_pop.setAdapter(adapter);
    }

    private void initListener() {
        lv_pop.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                getChose(spData.get(i),i);
                dismiss();
            }
        });
    }

    public class SpinnerAdapter extends MyBaseAdapter {
        List<String> spData;
        private LayoutInflater inflate = LayoutInflater.from(mContext);


        public SpinnerAdapter(List<String> spData) {
            this.spData = spData;
        }

        @Override
        public View getContenView(int i, View view, ViewGroup viewGroup) {
            final int position = i;
            ViewHolder holder ;
            if (view == null){
                view = inflate.inflate(R.layout.item_add_task_spinner, null);
                holder = new ViewHolder(view);
                view.setTag(holder);
            }else {
                holder = (ViewHolder) view.getTag();
            }
            holder.tv.setText(spData.get(i));
            return view;
        }

        @Override
        public int getNum() {
            return spData.size();
        }

        class ViewHolder{
            private TextView tv;
            private ImageView iv;

            public ViewHolder(View view) {
                tv= (TextView) view.findViewById(R.id.tv);
                iv= (ImageView) view.findViewById(R.id.iv);
            }
        }
    }
    public abstract void getChose(String chose, int i);
}
