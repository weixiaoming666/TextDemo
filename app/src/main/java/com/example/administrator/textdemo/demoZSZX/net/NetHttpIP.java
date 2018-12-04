package com.example.administrator.textdemo.demoZSZX.net;

import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.client.HttpRequest;

/**
 * Created by wxm on 2018/12/4.
 */
public interface NetHttpIP<T> {
    void request(RequestParams params, String url, HttpRequest.HttpMethod requestType);
}
