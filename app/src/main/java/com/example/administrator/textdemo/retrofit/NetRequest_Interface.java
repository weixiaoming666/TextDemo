package com.example.administrator.textdemo.retrofit;

import com.example.administrator.textdemo.mvc.Weather;

import java.io.File;
import java.util.List;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by wxm on 2018/3/30.
 */
//https://blog.csdn.net/carson_ho/article/details/73732076
public interface   NetRequest_Interface {
    // @GET注解的作用:采用Get方法发送网络请求
    // getCall() = 接收网络请求数据的方法
    // 其中返回类型为Call<*>，*是接收数据的类（即上面定义的Translation类）
    @GET("data/sk/101010100.html")
     Call<Weather> getWheaer();
    @GET("data/sk/101010100.html")
    Call<String> getWheaers();
    /**
     * 通过 MultipartBody和@body作为参数来上传
     * @param multipartBody MultipartBody包含多个Part
     * @return 状态信息
     */
    @POST("users/image")
    Call<String> uploadFileWithRequestBody(@Body MultipartBody multipartBody,
                                           @Query("name") List<File> files);

}
