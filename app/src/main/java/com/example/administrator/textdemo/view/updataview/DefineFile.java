package com.example.administrator.textdemo.view.updataview;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/4/8.
 */

public class DefineFile implements Serializable {
    public String fileId;//文件的id某些特殊的情况下会用
    public String mime;//文件的地址
    public String name;//文件的名字
    public boolean isCanSelect=true;//是不是可以选择，默认是可以选择的true
    public boolean isSelect=false;
    public int type=0;//(默认的为0其他的需要自己指定)0网络1本地2从拷贝来的(拷贝的时候也是网络的或者本地的这个时候要单独写一下类型)
    public int leftBottomResId;//右下角光标的显示图片地址是什么0代表没有 其他的代表有 现在有的例如归档
}
