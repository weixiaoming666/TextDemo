package com.example.administrator.textdemo.demoZSZX.net;

import com.android.volley.Response;

import static com.example.administrator.textdemo.demoZSZX.net.MyCallBack.getSuperClassGenricType;

/**
 * Created by wxm on 2018/10/25.
 */
public abstract class PostFileSuccess<T> implements   Response.Listener<String> , Response.ErrorListener{
    private Class<T> persistentClass = (Class<T>)getSuperClassGenricType(getClass(), 0); ;
    @Override
    public void onResponse(String s) {
        String s1 = s;
        T  t = (T) JsonUtils.ToGson(s,persistentClass);
        succeed(t);
    }
    public abstract void succeed(T t);
}
