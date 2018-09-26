package com.example.administrator.textdemo;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import com.example.administrator.textdemo.utils.ConfigParam;
import com.example.administrator.textdemo.utils.StatusBarUtil;
import com.example.administrator.textdemo.utils.StringUtil;
import com.example.administrator.textdemo.utils.UtilLog;

/**
 * Created by wxm on 2018/7/31.
 * 基类activity
 */
public class BaseActivity extends FragmentActivity implements View.OnClickListener {
    public Context context;
    public BaseLayout baseLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);//冷启动优化
        super.onCreate(savedInstanceState);
        context = this;
        UtilLog.e("activity",context.getClass().getPackage().getName()+context.getClass().getName());
    }
    public void setViewTitle(int resouceId){
        baseLayout=new BaseLayout(context, ConfigParam.BASE_TITLE_AND_LOAD, resouceId);
        setContentView(baseLayout);
        bindListeners();
        initInforStar();
    }

    /**
     *  不使用通用的title指使用通用的加载页面
     * @param titleId  tile的id  titleId为0的时候表示没有titleID
     * @param contentId	 下面内容的id
     */
    public void setViewLoad(int resouceId,int titleId,int contentId){
        baseLayout=new BaseLayout(context, ConfigParam.BASE_LOAD,resouceId,titleId,contentId);
        setContentView(baseLayout);
        bindListeners();
    }
    private void initInforStar(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            StatusBarUtil.setImgTransparent(this);
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            baseLayout.v_base_infobar.setVisibility(View.VISIBLE);
        } else{
            baseLayout.v_base_infobar.setVisibility(View.GONE);
        }
    }
    private void bindListeners() {
        baseLayout.bt_load_restart.setOnClickListener(this);
        baseLayout.ll_base_left.setOnClickListener(this);
        baseLayout.iv_base_title_left.setOnClickListener(this);
        baseLayout.tv_base_right1.setOnClickListener(this);
        baseLayout.tv_base_right2.setOnClickListener(this);
        baseLayout.iv_base_right1.setOnClickListener(this);
        baseLayout.iv_base_right2.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_load_restart:
                onReloadClick();
                break;
            case R.id.ll_base_left:
                onLeftClick();
                break;
            case R.id.iv_base_title_left:
                onTitleLeftClick();
                break;
            case R.id.tv_base_right2:
                if(!StringUtil.isNullOrEmpty(baseLayout.tv_base_right2.getText().toString().trim())){
                    onRight2Click();
                }
                break;
            case R.id.tv_base_right1:
                if(!StringUtil.isNullOrEmpty(baseLayout.tv_base_right1.getText().toString().trim())){
                    onRight1Click();
                }

                break;
            case R.id.iv_base_right2:
                onRight2Click();
                break;
            case R.id.iv_base_right1:
                onRight1Click();
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
     * 左侧按钮的点击事件
     */
    public void onLeftClick(){
        onBackPressed();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        setResult(RESULT_OK);
        finish();
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
    protected void onSaveInstanceState(Bundle outState) {
    }
    /**
     * 设置标题的名字
     * @param title
     */
    public void setBaseTitle(String title){
        baseLayout.setBaseTitle(title);
    }
    //  sq
    //隐藏软键盘
    // 点击空白区域 自动隐藏软键盘
    public boolean onTouchEvent(MotionEvent event) {
        if (null != this.getCurrentFocus()) {
            /**
             * 点击空白位置 隐藏软键盘
             */
            InputMethodManager mInputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            return mInputMethodManager.hideSoftInputFromWindow(this.getCurrentFocus().getWindowToken(), 0);
        }
        return super.onTouchEvent(event);
    }

    // 点击空白区域 自动隐藏软键盘
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            View v = getCurrentFocus();
            if (isShouldHideInput(v, ev)) {
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                if (imm != null) {
                    imm.hideSoftInputFromWindow(v != null ? v.getWindowToken() : null, 0);
                }
            }
            return super.dispatchTouchEvent(ev);
        }
        // 必不可少，否则所有的组件都不会有TouchEvent了  
        if (getWindow().superDispatchTouchEvent(ev)) {
            return true;
        }
        return onTouchEvent(ev);
    }

    public  boolean isShouldHideInput(View v, MotionEvent event) {
        if (v != null && (v instanceof EditText)) {
            int[] leftTop = { 0, 0 };
            //获取输入框当前的location位置
            v.getLocationInWindow(leftTop);
            int left = leftTop[0];
            int top = leftTop[1];
            int bottom = top + v.getHeight();
            int right = left + v.getWidth();
            if (event.getX() > left && event.getX() < right
                    && event.getY() > top && event.getY() < bottom) {
                // 点击的是输入框区域，保留点击EditText的事件
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    //不要沉浸式状态栏
    public void setViewTitleAndLoadUnChenjinTitlleBar(int resouceId){
        baseLayout=new BaseLayout(context, ConfigParam.BASE_TITLE_AND_LOAD, resouceId);
        setContentView(baseLayout);
        bindListeners();
    }

    /**
     * 设置标题的颜色
     * @param titlteBackColor  #4388e5(这样为了直接可以设置，不用再color里面定义属性)
     */
    public void setTitleBackColor(String titlteBackColor){
        baseLayout.setTitleBackColor(titlteBackColor);
    }

    /**
     * 设置标题颜色
     * @param titlteColor
     */
    public void setTilteTextColor(String titlteColor){
        baseLayout.setTilteTextColor(titlteColor);
    }
    //设置右边第一个文字的颜色
    public void setRight1TextColor(String textColor){
        baseLayout.setRight1TextColor(textColor);
    }
    //设置右边第二个文字的颜色
    public void setRight2TextColor(String textColor){
        baseLayout.setRight2TextColor(textColor);
    }

    /**
     * 设置左侧的标识
     * @param resouceId
     */
    public void setLeftIcon(int resouceId){
        baseLayout.setLeftIcon(resouceId);
    }
    //取消沉浸式标题栏
    public void setImmersiveTitleBarGone(){
        baseLayout.v_base_infobar.setVisibility(View.GONE);
    }
}
