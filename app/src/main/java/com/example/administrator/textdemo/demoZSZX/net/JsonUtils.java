package com.example.administrator.textdemo.demoZSZX.net;

import com.google.gson.Gson;

/**
 * json解析工具类
 * @author chenli
 *
 * 2015年10月28日上午8:41:41
 */
public class JsonUtils {
    /**
     * Gson解析-泛型
     * @param json json字符串
     * @param classOfT 泛型
     * @return
     */
    public static <T> T ToGson(String json, Class<T> classOfT) {
        Gson gson = new Gson();
        return gson.fromJson(json, classOfT);
    }
    public static String toJSonStr(Object object){
        Gson gson = new Gson();
        return gson.toJson(object);
    }
}
