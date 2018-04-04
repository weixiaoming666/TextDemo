package com.example.administrator.textdemo.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by wxm on 2018/3/30.
 */

public interface  NetRequest_Interface {
    @GET("openapi.do?keyfrom=Yanzhikai&key=2032414398&type=data&doctype=json&version=1.1&q=car")
     Call<String> getCall();
    // @GET注解的作用:采用Get方法发送网络请求
    // getCall() = 接收网络请求数据的方法
    // 其中返回类型为Call<*>，*是接收数据的类（即上面定义的Translation类）
}
