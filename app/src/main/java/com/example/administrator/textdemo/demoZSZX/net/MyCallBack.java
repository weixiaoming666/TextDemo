package com.example.administrator.textdemo.demoZSZX.net;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by wxm on 2018/12/4.
 */
public abstract class MyCallBack<T>  extends RequestCallBack<String> {
    private Class<T> persistentClass = (Class<T>)getSuperClassGenricType(getClass(), 0); ;
    private T t;
    public abstract void onMySucess(T t);//成功
    public abstract void onMyFail(HttpException e, String s);//失败
    @Override
    public void onLoading(long total, long current, boolean isUploading) {
        super.onLoading(total, current, isUploading);
    }

    @Override
    public void onSuccess(ResponseInfo<String> responseInfo) {
        String s = String.valueOf(responseInfo);
        try {
            JSONObject json = new JSONObject(responseInfo.result);
            String str1 = json.toString();
            String str11 = json.toString();
            String str = json.getString("errcode");
            String msg = json.getString("msg");
            if (str.equals("200")&&!msg.isEmpty()){
                t = (T) JsonUtils.ToGson(responseInfo.result,persistentClass);
            }else {
                if (msg.isEmpty()){
                    onMySucess(t);//有时候数据是空的时候，无数据
                }else {
                    onMyFail(null,str+msg);
                }

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (null!=t){
            onMySucess(t);
        }
    }
    @Override
    public void onFailure(HttpException e, String s) {
        String str1 = e.toString()+"---->>>"+e;
        onMyFail(e,s);
    }
    @SuppressWarnings("unchecked")
    public static Class<Object> getSuperClassGenricType(final Class clazz, final int index) {

        //返回表示此 Class 所表示的实体（类、接口、基本类型或 void）的直接超类的 Type。
        Type genType = clazz.getGenericSuperclass();

        if (!(genType instanceof ParameterizedType)) {
            return Object.class;
        }
        //返回表示此类型实际类型参数的 Type 对象的数组。
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();

        if (index >= params.length || index < 0) {
            return Object.class;
        }
        if (!(params[index] instanceof Class)) {
            return Object.class;
        }

        return (Class) params[index];
    }

}
