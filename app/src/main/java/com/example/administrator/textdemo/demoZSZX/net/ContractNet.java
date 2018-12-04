package com.example.administrator.textdemo.demoZSZX.net;

import android.app.ProgressDialog;
import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.client.HttpRequest;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wxm on 2018/10/19.
 * 合同网络请求
 *
 */
public enum   ContractNet{
    INSTANCE;
       /**
        *  获取信息列表
        * */
       public void getHtBaseInfoList(RequestParams params, MyCallBack callBack, Context context, boolean isSearch){
           if (!isSearch){
               net(params, ConstantUtils.getHtBaseInfoList,HttpRequest.HttpMethod.GET,callBack,context);
           }else {
               net(params, ConstantUtils.searchBaseInfoList,HttpRequest.HttpMethod.GET,callBack,context);
           }

    }
    /**
     *  获取合同管理的待办数量
     * */
    public void getHtBacklogCount(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getHtBacklogCount,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *  获取动态变化-变洽签列表
     * */
    public void getHtDynamicBqqList(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getHtDynamicBqqList,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *  获取动态变化-变洽签详情
     * */
    public void getHtDynamicBqqDetails(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getHtDynamicBqqDetails,HttpRequest.HttpMethod.GET,callBack,context);
    }

    /**
     *  获取动态变化-备忘录列表
     * */
    public void getHtDynamicMemoList(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getHtDynamicMemoList,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *  获取动态变化-备忘录详情
     * */
    public void getHtDynamicMemoDetails(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getHtDynamicMemoDetails,HttpRequest.HttpMethod.GET,callBack,context);
    }

    /**
     *  获取动态变化-索赔与奖励列表
     * */
    public void getHtDynamicRewardList(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getHtDynamicRewardList,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *   	获取动态变化-索赔与奖励详情
     * */
    public void getHtDynamicRewardDetails(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getHtDynamicRewardDetails,HttpRequest.HttpMethod.GET,callBack,context);
    }

    /**
     *   获取申请详情
     * */
    public void getHtApproveDetails(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getHtApproveDetails,HttpRequest.HttpMethod.GET,callBack,context);
    }

    /**
     *   获取合同基本信息详情
     * */
    public void getHtBaseInfoDetails(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getHtBaseInfoDetails,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *   获取合同付款申请流程设置
     * */
    public void getHtApproveSetting(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getHtApproveSettingOfUser,HttpRequest.HttpMethod.GET,callBack,context);
    }

    /**
     *   获取付款申请记录列表
     * */
    public void getHtApproveList(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getHtApproveList,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *   获取付款申请的支付方式
     * */
    public void getHtApprovePayMehotd(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getHtApprovePayMehotd,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *   添加付款申请
     * */
    public void addHtApprove(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.addHtApprove,HttpRequest.HttpMethod.POST,callBack,context);
    }
    /**
     *   获取工程计价列表
     * */
    public void getHtValuationList(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getHtValuationList,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *   获取工程计价详情
     * */
    public void getHtValuationDetails(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getHtValuationDetails,HttpRequest.HttpMethod.GET,callBack,context);
    }

    /**
     *   获取结算列表
     * */
    public void getHtSettlementList(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getHtSettlementList,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *   获取结算详情
     * */
    public void getHtSettlementDetails(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getHtSettlementDetails,HttpRequest.HttpMethod.GET,callBack,context);
    }

    /**
     *   获取保修管理列表
     * */
    public void getHtWarrantyList(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getHtWarrantyList,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *   获取保修管理详情
     * */
    public void getHtWarrantyDetails(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getHtWarrantyDetails,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *   获取付款信息列表
     * */
    public void getHtApproveListByContract(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getHtApproveListByContract,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *   获取付款信息列表
     * */
    public void confirmHtAprrove(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.confirmHtAprrove,HttpRequest.HttpMethod.POST,callBack,context);
    }

//  小组管理
    /**
     *   获取用户权限
     * */
    public void getHtUserAuthority(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getHtUserAuthority,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *   获取小组以及小组内人员
     * */
    public void getHtGroupAndUsers(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getHtGroupAndUsers,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *   获取在项目中的单位人员
     * */
    public void getHtUserOfUnit(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getHtUserOfUnit,HttpRequest.HttpMethod.GET,callBack,context);
    }
    public void getHtUserOfContract(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getHtUserOfContract,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *   添加、删除管理员(POST)
     * */
    public void addHtAdministrator(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.addHtAdministrator,HttpRequest.HttpMethod.POST,callBack,context);
    }
// 搜索模块
    /**
     *   搜索动态变化变洽签情况
     * */
    public void searchHtDynamicBqqList(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.searchHtDynamicBqqList,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *   搜索索赔与奖励
     * */
    public void searchHtDynamicRewardList(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.searchHtDynamicRewardList,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *   搜索动态变化补充协议与备忘录
     * */
    public void searchHtDynamicMemoList(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.searchHtDynamicMemoList,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *   搜索工程计价
     * */
    public void searchHtValuationList(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.searchHtValuationList,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *   搜索付款信息
     * */
    public void searchHtApproveList(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.searchHtApproveList,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *   搜索保修管理
     * */
    public void searchHtWarrantyList(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.searchHtWarrantyList,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *   获取安全检查待办列表
     * */
    public void getBLHtApproveList(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getBLHtApproveList,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *   获取安全验收待办列表
     * */
    public void getBLSafetyAccTaskList(RequestParams params,MyCallBack callBack,Context context){
        net(params, ConstantUtils.getBLSafetyAccTaskList,HttpRequest.HttpMethod.GET,callBack,context);
    }

    /**
     *   获取合同类型选择
     * */
    public void getHtTypeChose(RequestParams params, String url, MyCallBack callBack, Context context){
        net(params, url,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *   获取合同的接收列表
     * */
    public void getHtReceivedList(RequestParams params,MyCallBack callBack,Context context){
        net(params,ConstantUtils.getHtReceivedList,HttpRequest.HttpMethod.GET,callBack,context);
    }
    /**
     *   分享合同 (公司id)
     * */
    public void shareHt(RequestParams params,MyCallBack callBack,Context context){
        net(params,ConstantUtils.shareHt,HttpRequest.HttpMethod.POST,callBack,context);
    }
    /**
     *   获取安全检查待办列表
     * */
    public void getBLSccTaskList(RequestParams params,MyCallBack callBack,Context context){
        net(params,ConstantUtils.getBLSccTaskList,HttpRequest.HttpMethod.GET,callBack,context);
    }

    /**
     *   上传文件
     * */
    public void postFile(List<File> files, String url, Map map, final Context context, PostFileSuccess fileSuccess){
        netFile(files,url,map,context,fileSuccess);
    }

    private void netFile(List<File> files, String url, Map map, final Context context, PostFileSuccess fileSuccess) {
        RequestQueue mQueue = Volley.newRequestQueue(context);
        final ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("正在上传...");
        MultipartRequest request = new MultipartRequest(url, fileSuccess, fileSuccess, "files", files, map) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                HashMap<String, String> headers = new HashMap<String, String>();
                headers.put("Authorization", (String) SpUtils.getInstance(context).get(SpUtils.TOKEN, null));
                return headers;
            }
        };
        mQueue.add(request);
    }



    /**
     * @param params  参数
     */
    public void net(RequestParams params, String url, HttpRequest.HttpMethod type, MyCallBack callBack, Context context){//钱包id
        AddRecodNet netHttpIP = new AddRecodNet(callBack);
        String token = SpUtils.getInstance(context).get(SpUtils.TOKEN, null);
        params.addHeader("Authorization", token);
        netHttpIP.request(params, url, type);
    }
}
