package com.example.administrator.textdemo.retrofit;

import com.example.administrator.textdemo.mvc.Weather;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.*;

/**
 * Created by Administrator on 2018/4/4.
 */

public class RetrofitNetImp{//写一个 retrofit 的实例 然后调用就好
    public static Retrofit retrofit;
    public static RetrofitNetImp imp;
    public static NetRequest_Interface anInterface;
    public static NetRequest_Interface getInterface(){
        if (anInterface == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://www.weather.com.cn") //设置网络请求的Url地址
                    .addConverterFactory(retrofit2.converter.gson.GsonConverterFactory.create()) //设置数据解析器
                    .build();
            anInterface = retrofit.create(NetRequest_Interface.class);
        }
        return anInterface;
    }

    public static RetrofitNetImp getNetImp(){
        if (imp == null) {
            imp = new RetrofitNetImp();
        }
        return imp;
    }

//    public static Weather getWather() {
//        final Weather[] weather = {null};
//        getInterface().getWheaer().enqueue(new Callback<Weather>() {
//            @Override
//            public void onResponse(Call<Weather> call, Response<Weather> response) {
//                weather[0] = response.body();
//            }
//
//            @Override
//            public void onFailure(Call<Weather> call, Throwable t) {
//                weather[0] = null;
//            }
//        });
//        return weather[0];  因为网络请求耗时操作 所以直接返回值为空 自己开启子线程 可以自己写接口回调来放出数据
//    }
    public  void getW(final GetData<Weather> data){
        getInterface().getWheaer().enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {
                data.showData(response.body());
            }
            @Override
            public void onFailure(Call<Weather> call, Throwable t) {

            }
        });
    }
}
