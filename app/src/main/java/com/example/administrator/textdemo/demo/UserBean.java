package com.example.administrator.textdemo.demo;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by wxm on 2018/8/14.
 * 安卓自带序列化
 * 手动的序列化，效率更高，相对而言
 */
public class UserBean implements Parcelable{
    private String name ;
    private String address;

    protected UserBean(String name,String address) {
        this.name = name;
        this.address =address;
    }

    public static final Creator<UserBean> CREATOR = new Creator<UserBean>() {
        @Override
        public UserBean createFromParcel(Parcel in) {
            return new UserBean(in.readBundle().getString("name"),in.readBundle().getString("address"));
        }

        @Override
        public UserBean[] newArray(int size) {
            return new UserBean[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();//每种类型数据只有一个 可以不写bundle
        bundle.putString("name",name);
        bundle.putString("address",address);
        parcel.writeBundle(bundle);
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
}
