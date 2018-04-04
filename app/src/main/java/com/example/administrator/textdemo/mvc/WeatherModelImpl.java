package com.example.administrator.textdemo.mvc;

import com.example.administrator.textdemo.retrofit.GetData;
import com.example.administrator.textdemo.retrofit.RetrofitNetImp;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2018/4/4.
 *   MVP   中的   P
 */

public class WeatherModelImpl implements WeatherModel {
    @Override
    public void getWeather(String cityNumber, final OnWeatherListener listener) {

        RetrofitNetImp.getInterface().getWheaer().enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {

                    if (response!=null){
                        listener.onSuccess( response.body());
                    }else{
                        listener.onFail("数据为空");
                    }
            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t) {
                listener.onFail(t.getMessage());
            }
        });

    }

}
