package com.example.administrator.textdemo.demoZSZX;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.textdemo.BaseLayout;
import com.example.administrator.textdemo.R;

/**
 * Created by wxm on 2018/11/14.
 */
public abstract class BaseFragment  extends Fragment implements View.OnClickListener {
    public Activity activity;
    public Context context;
    private BaseLayout baseLayout;
    private View view ;
    public boolean isFirst=true;
    public String value;//传递的value
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = getActivity();
        context=activity;
        view = initView();
    }

    /**
     * 重写onCreateView决定Fragemnt的布局
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return view;
    }

    /**
     * 子类必须实现此方法 通过此方法加载视图
     *
     * @return
     */
    public abstract View initView();

    /**
     * 创建该Fragment的视图
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);// 这个方法不能省略
        initData();
    }

    /**
     * 如果有数据请重新此方法加数据
     */
    public void initData() {

    }


    /**
     * 使用通用的title不使用通用的加载页面
     * @param resouceId  加载页面的id
     */
    public View createViewTitle(int resouceId){
        context=getActivity();
        baseLayout=new BaseLayout(context, UtilVar.BASE_TITLE, resouceId);
        baseLayout.ll_base_left.setVisibility(View.GONE);
        bindListeners();
        baseLayout.v_base_infobar.setVisibility(View.GONE);
        return baseLayout;
    }
    /**
     *  不使用通用的title指使用通用的加载页面
     * @param titleId  tile的id  titleId为0的时候表示没有titleID
     * @param contentId	 下面内容的id
     */
    public View createViewLoad(int resouceId,int titleId,int contentId){
        context=getActivity();
        baseLayout=new BaseLayout(context, UtilVar.BASE_LOAD,resouceId,titleId,contentId);
        baseLayout.ll_base_left.setVisibility(View.GONE);
        bindListeners();
        return baseLayout;
    }
    /**
     * 使用通用的title和用通用的加载页面
     */
    public View createViewTitleAndLoad(int resouceId){
        context=getActivity();
        baseLayout=new BaseLayout(context, UtilVar.BASE_TITLE_AND_LOAD, resouceId);
        baseLayout.ll_base_left.setVisibility(View.GONE);
        bindListeners();
        baseLayout.v_base_infobar.setVisibility(View.GONE);
        return baseLayout;
    }
    private void bindListeners(){
        baseLayout.bt_load_restart.setOnClickListener(this);
        baseLayout.ll_base_left.setOnClickListener(this);
        baseLayout.iv_base_title_left.setOnClickListener(this);
        baseLayout.tv_base_right1.setOnClickListener(this);
        baseLayout.tv_base_right2.setOnClickListener(this);
        baseLayout.iv_base_right1.setOnClickListener(this);
        baseLayout.iv_base_right2.setOnClickListener(this);
        baseLayout.ll_base_left.setOnClickListener(this);
    }
    /**
     * 开始加载的转圈效果
     */
    public void loadStart(){
        baseLayout.loadStart();
    }
    /**
     * 无网络加载失败的效果
     */
    public void loadNonet(){
        baseLayout.loadNonet();
    }
    /**
     * 加载的数据为空的效果
     */
    public void loadNoData() {
        baseLayout.loadNoData();
    }
    /**
     * 成功加载之后的效果
     */
    public void loadSuccess(){
        baseLayout.loadSuccess();
    }
    /**
     * 设置标题的名字
     * @param title
     */
    public void setBaseTitle(String title){
        baseLayout.setBaseTitle(title);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_load_restart:
                onReloadClick();
                break;
            case R.id.iv_base_title_left:
                onTitleLeftClick();
                break;
            case R.id.tv_base_right2:case R.id.iv_base_right2:
                onRight2Click();
                break;
            case R.id.tv_base_right1:case R.id.iv_base_right1:
                onRight1Click();
                break;
            case R.id.ll_base_left:
                onLeft1Click();
                break;
        }
    }
    /**
     * 设置 左侧的按钮是否可见
     * @param visible
     */
    public void setLeftVisible(int visible){
        baseLayout.ll_base_left.setVisibility(visible);
    }
    public void setLeft1Icon(int resouceId){
        baseLayout.ll_base_left.setVisibility(View.VISIBLE);
        baseLayout.iv_base_left1.setImageResource(resouceId);
    }
    /**
     * 设置左侧按钮的标识
     * @param resouceId
     */
    public void setTitleLeftIcon(int resouceId){
        baseLayout.iv_base_title_left.setImageResource(resouceId);
        baseLayout.iv_base_title_left.setVisibility(View.VISIBLE);
    }


    /*
     * 设置右侧第一个文本的内容
     * @param text
     */
    public void setRight1Text(String text){
        baseLayout.tv_base_right1.setText(text);
        baseLayout.iv_base_right1.setVisibility(View.GONE);
        baseLayout.tv_base_right1.setVisibility(View.VISIBLE);
    }
    /**
     * 设置右侧第二个文本的内容
     * @param text
     */
    public void setRight2Text(String text){
        baseLayout.tv_base_right2.setText(text);
        baseLayout.iv_base_right2.setVisibility(View.GONE);
        baseLayout.tv_base_right2.setVisibility(View.VISIBLE);
    }
    /**
     * 设置右侧第一个图片的内容
     * @param resouceId
     */
    public void setRight1ResouceId(int resouceId){
        baseLayout.iv_base_right1.setImageResource(resouceId);
        baseLayout.iv_base_right1.setVisibility(View.VISIBLE);
        baseLayout.tv_base_right1.setVisibility(View.GONE);
    }
    /**
     * 设置右侧第二个图片的内容
     * @param resouceId
     */
    public void setRight2ResouceId(int resouceId){
        baseLayout.iv_base_right2.setImageResource(resouceId);
        baseLayout.tv_base_right2.setVisibility(View.GONE);
        baseLayout.iv_base_right2.setVisibility(View.VISIBLE);
    }
    /**
     * 图片左侧的标识的图片
     */
    public void  onTitleLeftClick(){

    }

    /**
     * 加载失败重新加载
     */
    public void onReloadClick(){

    }
    public void  onLeft1Click(){

    }
    /**
     * 右侧文字的点击事件
     */
    public void onRight1Click(){

    }
    /**
     * 右侧图片的点击事件
     */
    public void onRight2Click(){

    }
    /**
     * 无数据的时候的提示
     */
    public void setNoDataPrompt(String prompt){
        baseLayout.tv_load_no_data.setText(prompt);
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}
