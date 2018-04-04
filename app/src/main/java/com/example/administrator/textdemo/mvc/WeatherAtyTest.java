package com.example.administrator.textdemo.mvc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.ToastUtils;
import com.example.administrator.textdemo.retrofit.GetData;
import com.example.administrator.textdemo.retrofit.NetRequest_Interface;
import com.example.administrator.textdemo.retrofit.RetrofitNetImp;
//https://www.jianshu.com/p/734d3693da02    这也是个mvp
public class WeatherAtyTest extends AppCompatActivity implements OnWeatherListener,GetData<Weather>{
    private TextView tv_city,tv_temp,tv_WD,tv_SD,tv_time;
    private WeatherModel weatherModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_aty_test);
        tv_city = (TextView) findViewById(R.id.tv_city);
        tv_WD = (TextView) findViewById(R.id.tv_WD);
        tv_SD = (TextView) findViewById(R.id.tv_SD);
        tv_temp = (TextView) findViewById(R.id.tv_temp);
        tv_time = (TextView) findViewById(R.id.tv_time);
        weatherModel = new WeatherModelImpl();
    }

    @Override
    public void onSuccess(Weather weather) {
        tv_city.setText("城市 ："+weather.getWeatherinfo().getCity());
        tv_WD.setText("风向 ："+weather.getWeatherinfo().getWD());
        tv_SD.setText("湿度 ："+weather.getWeatherinfo().getSD());
        tv_temp.setText("污染指数 ："+weather.getWeatherinfo().getTemp());
        tv_time.setText("当前时间 ："+weather.getWeatherinfo().getTime());
    }

    @Override
    public void onFail(String message) {
        ToastUtils.shortgmsg(this,message);
    }

//  自己的一个写法
    @Override
    public void showData(Weather weather) {//未做判断
        tv_city.setText("城市 --》："+weather.getWeatherinfo().getCity());
        tv_WD.setText("风向 --》："+weather.getWeatherinfo().getWD());
        tv_SD.setText("湿度 --》："+weather.getWeatherinfo().getSD());
        tv_temp.setText("污染指数--》 ："+weather.getWeatherinfo().getTemp());
        tv_time.setText("当前时间 --》："+weather.getWeatherinfo().getTime());

    }

    public void getdata(View view) {
        RetrofitNetImp.getNetImp().getW(this);//写在网络请求中的接口回调
//        本质是一样的 都是接口回调  明显 getred 的回调分离的更清楚
    }

    public void getred(View view) {
        weatherModel.getWeather("111",this);//单独写出去的接口回调
    }
}
