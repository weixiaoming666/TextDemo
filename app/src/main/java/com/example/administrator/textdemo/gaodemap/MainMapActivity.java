package com.example.administrator.textdemo.gaodemap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.amap.api.maps.AMap;
import com.amap.api.maps.MapView;
import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.gaodemap.utils.PositionUtil;
import com.example.administrator.textdemo.view.dialog.MapChosePopwindon;

import java.util.ArrayList;
import java.util.List;

public class MainMapActivity extends AppCompatActivity  {
    MapView mMapView = null;
    AMap  aMap = null;
    private Button bt_tab_chose;
    private MapChosePopwindon mapChosePopwindon;
    List<String> stringList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_map);
        //获取地图控件引用
        mMapView = (MapView) findViewById(R.id.map);
        //在activity执行onCreate时执行mMapView.onCreate(savedInstanceState)，创建地图

        mMapView.onCreate(savedInstanceState);
        stringList.add("白昼地图");
        stringList.add("导航地图");
        stringList.add("卫星地图");
        stringList.add("夜间模式");
        stringList.add("实时路况图层");
        initView();
        initListener();

    }

    private void initView() {
        bt_tab_chose = findViewById(R.id.bt_tab_chose);
    }

    private void initListener() {
        if (aMap ==null){
            aMap = mMapView.getMap();
        }
        PositionUtil.INSTANCE.setShowMyPosition(true);
//        PositionUtil.INSTANCE.setMapIcon(R.mipmap.ic_launcher_round);//设置坐标点
        PositionUtil.INSTANCE.getLoaction(aMap,this);
//        获取到的坐标信息
//        #longitude=116.462369#province=北京市#city=北京市#district=朝阳区#cityCode=010#adCode=110105
//        #address=北京市朝阳区东柏街22号靠近乐成中心SPACE3#country=中国#road=东柏街#poiName=#
//        street=#streetNum=#aoiName=#poiid=#floor=#errorCode=0#errorInfo=success#locationDetail=#
//        csid:d2eeaaded8284a5baed255bc3625c70d#locationType=2

        bt_tab_chose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (mapChosePopwindon ==null){
                        mapChosePopwindon = new MapChosePopwindon(MainMapActivity.this,stringList) {
                            @Override
                            public void getChose(String chose, int i) {
                                bt_tab_chose.setText(chose);
                                switch (i){
                                    case 0://白昼地图 MAP_TYPE_NORMAL
                                        aMap.setMapType(AMap.MAP_TYPE_NORMAL);// 设置卫星地图模式，aMap是地图控制器对象。
                                        break;
                                    case 1://导航模式 MAP_TYPE_NAVI
                                        aMap.setMapType(AMap.MAP_TYPE_NAVI);
                                        break;
                                    case 2://卫星模式 MAP_TYPE_SATELLITE
                                        aMap.setMapType(AMap.MAP_TYPE_SATELLITE);
                                        break;
                                        case 3://夜景模式 MAP_TYPE_NIGHT
                                            aMap.setMapType(AMap.MAP_TYPE_NIGHT);
                                        break;
                                        case 4:// 路况图层
                                            aMap.setTrafficEnabled(true);
                                        break;

                                }
                            }
                        };
                    }

                mapChosePopwindon.showAsDropDown(bt_tab_chose);
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //在activity执行onDestroy时执行mMapView.onDestroy()，销毁地图
        mMapView.onDestroy();
    }
    @Override
    protected void onResume() {
        super.onResume();
        //在activity执行onResume时执行mMapView.onResume ()，重新绘制加载地图
        mMapView.onResume();
    }
    @Override
    protected void onPause() {
        super.onPause();
        //在activity执行onPause时执行mMapView.onPause ()，暂停地图的绘制
        mMapView.onPause();
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //在activity执行onSaveInstanceState时执行mMapView.onSaveInstanceState (outState)，保存地图当前的状态
        mMapView.onSaveInstanceState(outState);
    }


}
