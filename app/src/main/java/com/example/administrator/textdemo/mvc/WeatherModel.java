package com.example.administrator.textdemo.mvc;

/**
 * Created by Administrator on 2018/4/4.
 */
//mvp  中的 接口
public interface WeatherModel {
    void getWeather(String cityNumber, OnWeatherListener listener);
}
