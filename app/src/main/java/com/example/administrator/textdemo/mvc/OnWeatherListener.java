package com.example.administrator.textdemo.mvc;

/**
 * Created by Administrator on 2018/4/4.
 */

interface OnWeatherListener {
    void onSuccess(Weather weather);
    void onFail(String message);
}