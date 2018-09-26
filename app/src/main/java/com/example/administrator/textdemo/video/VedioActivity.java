package com.example.administrator.textdemo.video;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.bumptech.glide.Glide;
import com.example.administrator.textdemo.BaseActivity;
import com.example.administrator.textdemo.MyBaseAdapter;
import com.example.administrator.textdemo.R;

import cn.jzvd.Jzvd;
import cn.jzvd.JzvdStd;

public class VedioActivity extends BaseActivity {
    ListView  lv;

    String[] name = {"你好","我喜欢你","卫晓明真可爱","雪月风花我只爱你","轻轻地我走了","正如你轻轻地来","如果你喜欢我","请告诉我"};
    String[] urls = {"https://media.w3.org/2010/05/sintel/trailer.mp4","http://www.w3school.com.cn/example/html5/mov_bbb.mp4","https://www.w3schools.com/html/movie.mp4","http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4","http://221.228.226.5/15/t/s/h/v/tshvhsxwkbjlipfohhamjkraxuknsc/sh.yinyuetai.com/88DC015DB03C829C2126EEBBB5A887CB.mp4","http://221.228.226.23/11/t/j/v/b/tjvbwspwhqdmgouolposcsfafpedmb/sh.yinyuetai.com/691201536EE4912BF7E4F1E2C67B8119.mp4","http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4","http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setViewTitle(R.layout.activity_vedio);
        setBaseTitle("视频播放");
        lv = findViewById(R.id.lv);
        lv.setAdapter(new MyBaseAdapter() {
            @Override
            public View getContenView(int i, View view, ViewGroup viewGroup) {
                ViewHolder holder ;
                if (view==null){
                    view = LayoutInflater.from(context).inflate(R.layout.item_vedio_show,null);
                    holder = new ViewHolder(view);
                    view.setTag(holder);
                }else {
                    holder = (ViewHolder) view.getTag();
                }


                    holder.jzvdStd.setUp(urls[i],
                            name[i], Jzvd.SCREEN_WINDOW_LIST
                    );
                    Glide.with(context)
                            .load("http://p.qpic.cn/videoyun/0/2449_43b6f696980311e59ed467f22794e792_1/640")
                            .into(holder.jzvdStd.thumbImageView);
//                }else {
//                    holder.jzvdStd.setUp("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4",
//                            "饺子张开眼睛", Jzvd.SCREEN_WINDOW_LIST
//                    );
//                    Glide.with(context)
//                            .load("https://pic4.zhimg.com/v2-f22d848d2d5096a3ff5ea3f290d59815_1200x500.jpg")
//                            .into(holder.jzvdStd.thumbImageView);


                return view;
            }

            @Override
            public int getNum() {
                return 8;
            }
            class ViewHolder{
                private JzvdStd jzvdStd;
                public ViewHolder(View view) {
                    jzvdStd = view.findViewById(R.id.vp);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (Jzvd.backPress()) {
            return;
        }
        super.onBackPressed();
    }
    @Override
    protected void onPause() {
        super.onPause();
        JzvdStd.goOnPlayOnPause();
    }

    @Override
    protected void onDestroy() {
        Jzvd.releaseAllVideos();
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        JzvdStd.goOnPlayOnResume();
    }
}
