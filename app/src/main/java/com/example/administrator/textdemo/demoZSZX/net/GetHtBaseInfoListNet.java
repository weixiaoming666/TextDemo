package com.example.administrator.textdemo.demoZSZX.net;

import android.app.Dialog;
import android.content.Context;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.client.HttpRequest;

/**
 * Created by wxm on 2018/10/19.
 *  	获取基本信息列表
 */
public abstract class GetHtBaseInfoListNet<T> {
    private Context context;
    public GetHtBaseInfoListNet(Context context) {
        this.context = context;
    }
    public void net(final String reword_wallet_id){//钱包id
        final Dialog dialog = Util.createProgressDialog(context, "获取钱包设置中");
        dialog.show();
        AddRecodNet netHttpIP = new AddRecodNet(new MyCallBack<T>() {
            @Override
            public void onMySucess(T t) {
                dialog.dismiss();
                getData(t);
            }

            @Override
            public void onMyFail(HttpException e, String s) {
                dialog.dismiss();
            }
        });

        RequestParams params = new RequestParams();
        String token = SpUtils.getInstance(context).get(SpUtils.TOKEN, null);
        String project_group_id = SpUtils.getInstance(context).get(SpUtils.PROJECT_GROUP_ID, null);
        params.addHeader("Authorization", token);
        params.addQueryStringParameter("project_group_id", project_group_id);
        params.addQueryStringParameter("reword_wallet_id", reword_wallet_id);
        netHttpIP.request(params, ConstantUtils.getHtBaseInfoList, HttpRequest.HttpMethod.GET);

    }
    public abstract void getData(T reword_on_off);
}
