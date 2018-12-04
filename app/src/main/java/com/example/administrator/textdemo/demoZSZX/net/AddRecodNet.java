package com.example.administrator.textdemo.demoZSZX.net;

import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.client.HttpRequest;

/**
 * Created by wxm on 2018/12/4.
 */
class AddRecodNet implements NetHttpIP{
    private String url = ConstantUtils.getSccNodeName;//获取节点列表
    private MyCallBack callBack;

    public AddRecodNet(MyCallBack callBack) {
        this.callBack = callBack;
    }

    @Override
    public void request(RequestParams params, String url, HttpRequest.HttpMethod requestType) {
        HttpUtils httpUtils = new HttpUtils();
        httpUtils.configCurrentHttpCacheExpiry(0*1000);
        httpUtils.send(requestType, url, params,callBack );//进行网络请求
    }
}
