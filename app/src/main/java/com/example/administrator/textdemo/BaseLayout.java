package com.example.administrator.textdemo;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by wxm on 2018/7/31.
 */
public class BaseLayout extends LinearLayout  {
    private  ViewGroup view_content;////用户自己的内容 (包括标题)
    private  View view_content_no_title;//用户自己的内容 (无标题)
    private View personl_title;//个人自己的title(这个布局只有 type=BASE_LOAD的时候才有)
    private LayoutInflater inflater;
    private Context context;
    private View base_title;
    private View base_title_person;
    private int type;//1 使用通用加载的title 不使用通用加载的界面 2 使用通用加载的的界面 不使用title 3 使用通用加载的title  与加载的界面
    private LinearLayout ll_base_title;
    public View v_base_infobar;
    public LinearLayout ll_base_left;
    public ImageView iv_base_left1;
    public ImageView iv_base_title_left;
    public TextView tv_base_title;
    public LinearLayout ll_base_right;
    public TextView tv_base_right1;
    public ImageView iv_base_right1;
    public TextView tv_base_right2;
    public ImageView iv_base_right2;
    /***
     * base 加载数据部分
     */
    public View base_load;//通用加载的效果的内容
    private ProgressBar pb_load;
    public TextView tv_load_no_data;//无数据加载显示
    private LinearLayout ll_load_err;//加载错误
    public Button bt_load_restart;//从新加载
    private int titleId;
    public BaseLayout(Context context,int type,int viewId) {
        super(context);
        this.context =context;
        this.type=type;
        inflater= LayoutInflater.from(context);
        view_content=(ViewGroup) inflater.inflate(viewId, null);
        init();
    }



    public BaseLayout(Context context, int type,int resouceId,int titleId,int contentId) {
        super(context);
        this.context=context;
        this.type=type;
        this.titleId=titleId;
        inflater=LayoutInflater.from(context);
        view_content=(ViewGroup) inflater.inflate(resouceId, null);
        if(titleId!=0){ //自己的id
            personl_title=view_content.findViewById(titleId);
        }
        view_content_no_title=view_content.findViewById(contentId);

        init();
    }

    public BaseLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



    private void init() {
        this.setOrientation(VERTICAL);
        base_title=inflater.inflate(R.layout.base_title, null);
        iv_base_title_left = (ImageView) base_title.findViewById(R.id.iv_base_title_left);
        tv_base_title = (TextView) base_title.findViewById(R.id.tv_base_title);
        ll_base_left = (LinearLayout) base_title.findViewById(R.id.ll_base_left);
        tv_base_right1 = (TextView) base_title.findViewById(R.id.tv_base_right1);
        tv_base_right2 = (TextView) base_title.findViewById(R.id.tv_base_right2);
        iv_base_right1 = (ImageView) base_title.findViewById(R.id.iv_base_right1);
        iv_base_right2 = (ImageView) base_title.findViewById(R.id.iv_base_right2);
        iv_base_left1= (ImageView) base_title.findViewById(R.id.iv_base_left1);
        ll_base_title=(LinearLayout)base_title.findViewById(R.id.ll_base_title);
        v_base_infobar=base_title.findViewById(R.id.v_base_infobar);
        tv_base_right1.setVisibility(View.GONE);
        tv_base_right2.setVisibility(View.GONE);
        iv_base_title_left.setVisibility(View.GONE);
        base_load=inflater.inflate(R.layout.base_load, null);
        pb_load = (ProgressBar)base_load. findViewById(R.id.pb_load);
        tv_load_no_data = (TextView) base_load.findViewById(R.id.tv_load_no_data);
        ll_load_err = (LinearLayout) base_load.findViewById(R.id.ll_load_err);
        base_load.setVisibility(View.GONE);
        bt_load_restart = (Button) base_load.findViewById(R.id.bt_load_restart);
        initDisplay();
    }

    private void initDisplay() {
        if(type==1){
            RelativeLayout.LayoutParams baseTitleParams=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            RelativeLayout.LayoutParams personalContentParams=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
            addView(base_title,baseTitleParams);//标题
            addView(view_content,personalContentParams.width,personalContentParams.height);
        }else if(type==2){
            if(view_content instanceof RelativeLayout){
                RelativeLayout.LayoutParams fillParams=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.FILL_PARENT);
                RelativeLayout.LayoutParams baseLoadParams=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.FILL_PARENT);
                baseLoadParams.addRule(RelativeLayout.BELOW, titleId);//当前标题 下方
                RelativeLayout.LayoutParams personalPartcontentParams=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.FILL_PARENT);
                personalPartcontentParams.addRule(RelativeLayout.BELOW, R.id.rl_base_load);
                view_content_no_title.setLayoutParams(personalPartcontentParams);//设置内容部分参数
                view_content.addView(base_load,baseLoadParams);
                addView(view_content,fillParams);
            }else if(view_content instanceof LinearLayout){
                RelativeLayout.LayoutParams fillParams=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.FILL_PARENT);
                LinearLayout.LayoutParams llFillParams=new LinearLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.FILL_PARENT);
                //用户没有title比如fragment
                if(titleId==0){
                    view_content.addView(base_load,0,llFillParams);
                }else{
                    view_content.addView(base_load,1,llFillParams);
                }
                addView(view_content,fillParams);
            }

        }else{
            RelativeLayout.LayoutParams baseTitleParams=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            this.addView(base_title,baseTitleParams);
            RelativeLayout.LayoutParams baseLoadParams=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.FILL_PARENT);
            baseLoadParams.addRule(RelativeLayout.BELOW,R.id.ll_base_title);
            addView(base_load,baseLoadParams);
            RelativeLayout.LayoutParams personalContentParams=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.FILL_PARENT);
           addView(view_content,personalContentParams);
        }
    }


    public void loadStart(){
        base_load.setVisibility(View.VISIBLE);
        pb_load.setVisibility(View.VISIBLE);
        tv_load_no_data.setVisibility(View.GONE);
        ll_load_err.setVisibility(View.GONE);

    }
    /**
     * 加载无网络
     */
    public void loadNonet(){
        base_load.setVisibility(View.VISIBLE);
        pb_load.setVisibility(View.GONE);
        tv_load_no_data.setVisibility(View.GONE);
        ll_load_err.setVisibility(View.VISIBLE);
    }
    public void loadNoData(){
        base_load.setVisibility(View.VISIBLE);
        pb_load.setVisibility(View.GONE);
        tv_load_no_data.setVisibility(View.VISIBLE);
        ll_load_err.setVisibility(View.GONE);
    }
    public void loadSuccess(){
        base_load.setVisibility(View.GONE);
        pb_load.setVisibility(View.GONE);
    }
    public void setBaseTitle(String title){
        tv_base_title.setText(title);
    }
    /**
     * 设置标题的颜色
     * @param titlteBackColor  #4388e5(这样为了直接可以设置，不用再color里面定义属性)
     */
    public void setTitleBackColor(String titlteBackColor){
        ll_base_title.setBackgroundColor(Color.parseColor(titlteBackColor));
    }

    /**
     * 设置标题颜色
     * @param titlteColor
     */
    public void setTilteTextColor(String titlteColor){
        tv_base_title.setTextColor(Color.parseColor(titlteColor));
    }
    //设置右边第一个文字的颜色
    public void setRight1TextColor(String textColor){
        tv_base_right1.setTextColor(Color.parseColor(textColor));
    }
    //设置右边第二个文字的颜色
    public void setRight2TextColor(String textColor){
        tv_base_right2.setTextColor(Color.parseColor(textColor));
    }
    /**
     * 设置左侧的标识
     * @param resouceId
     */
    public void setLeftIcon(int resouceId){
        iv_base_left1.setImageResource(resouceId);
    }


}
