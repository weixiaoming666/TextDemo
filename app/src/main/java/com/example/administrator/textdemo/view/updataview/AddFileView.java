package com.example.administrator.textdemo.view.updataview;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.ToastUtils;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 * 添加照片图片视频音频图纸和视频音频这些
 * Created by  wxm.
 */
public class AddFileView extends LinearLayout{
    private Context context;
    private Activity activity;
    private Fragment fragment;
    private LinearLayout ll_parent_pic;
    private TextView tv_need_pic;
    private HorizontalScrollView hsv_pic;
    private LinearLayout ll_pic_list;
    private ImageView iv_add_picture;
    private LinearLayout ll_parent_yinpin;
    private TextView tv_need_yinpin;
    private HorizontalScrollView hsv_luyin;
    private LinearLayout ll_luyin_list;
    private ImageView iv_add_luyin;
    private LinearLayout ll_parent_shipin;
    private TextView tv_need_shipin;
    private HorizontalScrollView hsv_shipin;
    private LinearLayout ll_luxiang_list;
    private ImageView iv_add_luxiang;
    //这里面要求不与activity和fragment里面的的冲突
    private static final int TO_XIANGCE = 100;
    private static final int TO_ZHAOXIANGJI = 101;
    private static final  int TO_MARK_PIC=102;
    public AddFileView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        LayoutInflater.from(context).inflate(R.layout.base_add_file_view,this);
        bindViews();
        bindListeners();
        voiceRecordUtils = new VoiceRecordUtils();
        initLuyinDialog();
    }

    private void bindViews() {
        ll_parent_pic = (LinearLayout) findViewById(R.id.ll_parent_pic_base_add_file);
        tv_need_pic = (TextView) findViewById(R.id.tv_need_pic_base_add_file);
        hsv_pic = (HorizontalScrollView) findViewById(R.id.hsv_pic_base_add_file);
        ll_pic_list = (LinearLayout) findViewById(R.id.ll_pic_list_base_add_file);
        iv_add_picture = (ImageView) findViewById(R.id.iv_add_picture_base_add_file);
        ll_parent_yinpin = (LinearLayout) findViewById(R.id.ll_parent_yinpin_base_add_file);
        tv_need_yinpin = (TextView) findViewById(R.id.tv_need_yinpin_base_add_file);
        hsv_luyin = (HorizontalScrollView) findViewById(R.id.hsv_luyin_base_add_file);
        ll_luyin_list = (LinearLayout) findViewById(R.id.ll_luyin_list_base_add_file);
        iv_add_luyin = (ImageView) findViewById(R.id.iv_add_luyin_base_add_file);
        ll_parent_shipin = (LinearLayout) findViewById(R.id.ll_parent_shipin_base_add_file);
        tv_need_shipin = (TextView) findViewById(R.id.tv_need_shipin_base_add_file);
        hsv_shipin = (HorizontalScrollView) findViewById(R.id.hsv_shipin_base_add_file);
        ll_luxiang_list = (LinearLayout) findViewById(R.id.ll_luxiang_list_base_add_file);
        iv_add_luxiang = (ImageView) findViewById(R.id.iv_add_luxiang_base_add_file);
    }
    private void bindListeners(){
        iv_add_picture.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowImagePicker();
            }
        });
        iv_add_luxiang.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                ShowVideoPicker();
            }
        });
        iv_add_luyin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                luyinDialog.show();
            }
        });
    }

    /**
     * 设置类型的话只能选一个activity或者fragment为载体下面的OnActivityForResult就对应Activity的或者fragment
     * 设置数据还有基本的显示具体几个模块
     *  @param activity activity要是
     * @param fileList 所有的file
     * @param isExsitPic 是否存在图片模块
     * @param isExsitShipin 是否存在视频模块
     * @param isExsitYinpin 是否存在音频模块
     */
    public void setDataType(Activity activity,List<DefineFile>fileList, boolean isExsitPic, boolean isExsitShipin, boolean isExsitYinpin){
      this.activity=activity;
        if(fileList!=null &&fileList.size()>0){
            for(DefineFile file:fileList){
                if(Util.getFileType(file.mime)==UtilVar.FILE_TYPE_IMG){
                    addPictureImageView(file);
                }else if(Util.getFileType(file.mime)==UtilVar.FILE_TYPE_SHIPIN){
                    addShipinImageView(file);
                }else if(Util.getFileType(file.mime)==UtilVar.FILE_TYPE_YINPIN){
                    addYinpinImageView(file);
                }
            }
        }
        if(isExsitPic){
            ll_parent_pic.setVisibility(View.VISIBLE);
        }else{
            ll_parent_pic.setVisibility(View.GONE);
        }
        if(isExsitShipin){
            ll_parent_shipin.setVisibility(View.VISIBLE);
        }else{
            ll_parent_shipin.setVisibility(View.GONE);
        }
        if(isExsitYinpin){
            ll_parent_yinpin.setVisibility(View.VISIBLE);
        }else{
            ll_parent_yinpin.setVisibility(View.GONE);
        }

    }
    //setDataType（）放在这个方法之后
    //所有的点击事件只是显示一个dialog 对话框 不通用其实，现在只对归档文件长按显示一个提示
    public void setLongClickDialg(List<OnLongClickListener>picLongClickListenerList,List<OnLongClickListener>shipinLongClickListenerList,List<OnLongClickListener>yinpinLongClickListenerList){
        //
        if(Util.isListNotNull(picLongClickListenerList)){
            for(int i=0;i<picLongClickListenerList.size();i++){
                ll_pic_list.getChildAt(i).setOnLongClickListener(picLongClickListenerList.get(i));
            }
        }
        if(Util.isListNotNull(shipinLongClickListenerList)){
            for(int i=0;i<shipinLongClickListenerList.size();i++){
                ll_luxiang_list.getChildAt(i).setOnLongClickListener(shipinLongClickListenerList.get(i));
            }
        }

        if(Util.isListNotNull(yinpinLongClickListenerList)){
            for(int i=0;i<yinpinLongClickListenerList.size();i++){
                ll_luyin_list.getChildAt(i).setOnLongClickListener(yinpinLongClickListenerList.get(i));
            }
        }
    }
    //添加数据 添加所有数据自动区分
    public void addData(List<DefineFile>addFileList){
        if(Util.isListNotNull(addFileList)){
            for(DefineFile file:addFileList){
                if(Util.getFileType(file.mime)==UtilVar.FILE_TYPE_IMG){
                    addPictureImageView(file);
                }else if(Util.getFileType(file.mime)==UtilVar.FILE_TYPE_SHIPIN){
                    addShipinImageView(file);
                }else if(Util.getFileType(file.mime)==UtilVar.FILE_TYPE_YINPIN){
                    addYinpinImageView(file);
                }
            }
        }
    }
    /**
     * 设置类型的话只能选一个activity或者fragment为载体下面的OnActivityForResult就对应Activity的或者fragment
     * 设置数据还有基本的显示具体几个模块
     *  @param fragment fragment
     * @param fileList 所有的file
     * @param isExsitPic 是否存在图片模块
     * @param isExsitShipin 是否存在视频模块
     * @param isExsitYinpin 是否存在音频模块
     */
    public void setDataType(Fragment fragment, List<DefineFile>fileList, boolean isExsitPic, boolean isExsitShipin, boolean isExsitYinpin){
        this.fragment=fragment;
        if(fileList!=null &&fileList.size()>0){
            for(DefineFile file:fileList){
                if(Util.getFileType(file.mime)==UtilVar.FILE_TYPE_IMG){
                    addPictureImageView(file);
                }else if(Util.getFileType(file.mime)==UtilVar.FILE_TYPE_SHIPIN){
                    addShipinImageView(file);
                }else if(Util.getFileType(file.mime)==UtilVar.FILE_TYPE_YINPIN){
                    addYinpinImageView(file);
                }
            }
        }
        if(isExsitPic){
            ll_parent_pic.setVisibility(View.VISIBLE);
        }else{
            ll_parent_pic.setVisibility(View.GONE);
        }
        if(isExsitShipin){
            ll_parent_shipin.setVisibility(View.VISIBLE);
        }else{
            ll_parent_shipin.setVisibility(View.GONE);
        }
        if(isExsitYinpin){
            ll_parent_yinpin.setVisibility(View.VISIBLE);
        }else{
            ll_parent_yinpin.setVisibility(View.GONE);
        }

    }
    private boolean isPicCanAdd;//是不是可以添加图片
    private boolean isPicNetCanDelete;//网络图片是不是可以删除
    private boolean isPicCanSelect;//图片是不是可以选中
    /**
     * 设置图片的种类
     * @param isPicCanAdd 图片可以添加
     * @param isPicNetCanDelete 网络图片可以删除
     * @param isPicCanSelect 图片可以选中
     *    @param isPicNeed 图片可以选中
     */
    public void setPicType(boolean isPicCanAdd,boolean isPicNetCanDelete,boolean isPicCanSelect,boolean isPicNeed){
        this.isPicCanAdd=isPicCanAdd;
        this.isPicCanSelect=isPicCanSelect;
        this.isPicNetCanDelete=isPicNetCanDelete;
        if(isPicNeed){
            tv_need_pic.setVisibility(View.VISIBLE);
        }else{
            tv_need_pic.setVisibility(View.GONE);
        }
        if(isPicCanAdd){
            iv_add_picture.setVisibility(View.VISIBLE);
        }else{
            iv_add_picture.setVisibility(View.GONE);
        }
    }
    //获取本地要传的数据
    public List<DefineFile>getPicLocalList(){
        List<DefineFile>localPicFileList=new ArrayList<>();
        if(pictureFileList!=null&&pictureFileList.size()>0){
            for(final DefineFile file:pictureFileList){
                if (file.type==1&&!file.mime.startsWith("http")){
                    if(Util.isFilePathExist(file.mime)){
                        localPicFileList.add(file);
                    }
                }
            }
        }
        return localPicFileList;
    }

    //获取删除的网络的图片
    public List<DefineFile>getPicDeleteNetList(){
        return picDeleteFileList;
    }
    //获取拷贝的图片的数组
    public List<DefineFile>getPicCopyList(){
        List<DefineFile>copyPicFileList=new ArrayList<>();
        if(pictureFileList!=null&&pictureFileList.size()>0){
            for(final DefineFile file:pictureFileList){
                if (file.type==2){
                    copyPicFileList.add(file);
                }
            }
        }
        return copyPicFileList;
    }
    private Handler handler = new Handler();
    private List<DefineFile>pictureFileList=new ArrayList<>();
    private List<DefineFile>picDeleteFileList=new ArrayList<>();
    private void addPictureImageView(final DefineFile file) {
        //网络哦图片之前已经添加到这个里面了多少
        if (!file.mime.startsWith("http")) {
            //主要是处理相册里面的图片名字
            file.mime = renameFile(file.mime);
            UtilLog.e("tag", file.mime);
        }
        pictureFileList.add(file);
        final View view = LayoutInflater.from(context).inflate(R.layout.base_item_file_des, null);
        final ImageView iv = (ImageView) view.findViewById(R.id.iv_base_item_file_des);
        ImageView iv_isupload = (ImageView) view.findViewById(R.id.iv_isupload_base_item_file_des);
        TextView tv_des = (TextView) view.findViewById(R.id.tv_des_base_item_file_des);
        ImageView iv_left_bottom=(ImageView)view.findViewById(R.id.iv_left_bottom);
        if(file.leftBottomResId!=0){
            iv_left_bottom.setVisibility(View.VISIBLE);
            iv_left_bottom.setImageResource(file.leftBottomResId);
        }else{
            iv_left_bottom.setVisibility(View.GONE);
        }
        final ImageView iv_select = (ImageView) view.findViewById(R.id.iv_select_base_item_file_des);
        LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        UtilLog.e("tag", "pic的高度" + view.getHeight());
        params.rightMargin = Util.dip2px(context, 10);
        tv_des.setVisibility(View.GONE);
        if (!StringUtil.isNullOrEmpty(file.mime)) {
            if (file.mime.startsWith("http")) {
                iv_isupload.setVisibility(View.VISIBLE);
                //网络加载
                ImageLoader.getInstance().loadImage(file.mime, new SimpleImageLoadingListener() {
                    @Override
                    public void onLoadingComplete(String imageUri, View view,
                                                  Bitmap loadedImage) {
                        super.onLoadingComplete(imageUri, view, loadedImage);
                        iv.setImageBitmap(loadedImage);
                    }

                    @Override
                    public void onLoadingStarted(String imageUri, View view) {
                        // TODO Auto-generated method stub
                        super.onLoadingStarted(imageUri, view);
                        iv.setImageResource(R.drawable.picture_suoluetu);
                    }

                });
            } else {
                iv_isupload.setVisibility(View.GONE);
                ImageLoader.getInstance().displayImage("file://" + file.mime, iv);
            }
        } else {
            iv_isupload.setVisibility(View.GONE);
        }
        ll_pic_list.addView(view, params);
        handler.post(new Runnable() {
            @Override
            public void run() {
                hsv_pic.fullScroll(ScrollView.FOCUS_RIGHT);
            }
        });
        view.setTag(pictureFileList.size() - 1);//设置view的Index
        iv_select.setTag(pictureFileList.size() - 1);

            view.setOnLongClickListener(new OnLongClickListener() {
                @Override
                public boolean onLongClick(final View v) {
                    Util.showDialog(context, "是否删除？", "否", "是", null, new DialogButtonOnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int index = (Integer) view.getTag();
                            DefineFile file = pictureFileList.get(index);

                            if (file.mime.startsWith("http")&&file.type==0) {
                                if(isPicNetCanDelete){
                                    picDeleteFileList.add(file);
                                    ll_pic_list.removeViewAt(index);
                                    pictureFileList.remove(index);
                                    for (int i = 0; i < ll_pic_list.getChildCount(); i++) {
                                        ll_pic_list.getChildAt(i).setTag(i);
                                    }
                                }else{
                                    ToastUtils.shortgmsg(context,"不能删除网络图片");
                                    return;
                                }

                            }else{
                                ll_pic_list.removeViewAt(index);
                                pictureFileList.remove(index);
                                for (int i = 0; i < ll_pic_list.getChildCount(); i++) {
                                    ll_pic_list.getChildAt(i).setTag(i);
                                }
                            }


                        }
                    });
                    return true;
                }
            });

        if(isPicCanSelect&&file.isCanSelect){
            iv_select.setVisibility(View.VISIBLE);
        }else{
            iv_select.setVisibility(View.GONE);
        }

        iv_select.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int index = (Integer) view.getTag();
                file.isSelect = !file.isSelect;
                if (file.isSelect) {
                    iv_select.setBackgroundResource(R.drawable.chacha);
                } else {
                    iv_select.setBackgroundResource(R.drawable.duigou);
                }
            }
        });

        view.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(context,
                        PicFullScreenShowActivity.class);
                Bundle bundle = new Bundle();
                List<String> list = new ArrayList<String>();
                for (int i = 0; i < pictureFileList.size(); i++) {
                    list.add(pictureFileList.get(i).mime);
                }
                bundle.putSerializable("imgPath", (Serializable) list);
                int index = (Integer) v.getTag();
                bundle.putInt("startIndex", index);
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });
    }


    public String renameFile(String path) {
        File file = new File(path);
        String fileName = file.getName();
        if (fileName.startsWith("1_")) {
            //当前不用修改
            return path;
        } else {
            File oldfile = new File(path);
            String newPath = UtilVar.FILE_PARENT_PATH + "/1_" + fileName;
            Util.copyFile(path, newPath);
            return newPath;
        }


    }

    private String curentZhaoxianjiPicPath;
    private void ShowImagePicker() {
        Util.showDialog(context, "选择图片方式？", "相册", "拍照", new DialogButtonOnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK, null);
                intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
                if(activity!=null){
                    activity.startActivityForResult(intent, TO_XIANGCE);
                }else{
                    fragment.startActivityForResult(intent, TO_XIANGCE);
                }

            }
        }, new DialogButtonOnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String state = Environment.getExternalStorageState();
                if (state.equals(Environment.MEDIA_MOUNTED)) {
                    File parentFile = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/DCIM");
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    curentZhaoxianjiPicPath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/DCIM/" + "1_" + (System.currentTimeMillis()) + "_" + (pictureFileList.size() + 1) + ".jpg";
                    File file = new File(curentZhaoxianjiPicPath);
                    Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file));

                    if(activity!=null){
                        activity.startActivityForResult(intent, TO_ZHAOXIANGJI);
                    }else{
                        fragment.startActivityForResult(intent, TO_ZHAOXIANGJI);
                    }

                } else {
                    Toast.makeText(context, "请确认已经插入SD卡", Toast.LENGTH_LONG).show();
                }

            }
        });


    }
    private List<DefineFile>shipinFileList=new ArrayList();

    private boolean isShipinCanAdd;//是不是可以添加图片
    private boolean isShipinNetCanDelete;//网络图片是不是可以删除
    private boolean isShipinCanSelect;//视频是不是可以选择

    /**
     * 设置视频的种类
     * @param isShipinCanAdd 视频可以添加
     * @param isShipinNetCanDelete 网络视频可以删除
     * @param isShipinCanSelect 视频是不是可以选择
     */
    public void setShipinType(boolean isShipinCanAdd,boolean isShipinNetCanDelete,boolean isShipinCanSelect,boolean isShipinNeed){
        this.isShipinCanAdd=isShipinCanAdd;
        this.isShipinCanSelect=isShipinCanSelect;
        this.isShipinNetCanDelete=isShipinNetCanDelete;
        if(isShipinNeed){
            tv_need_shipin.setVisibility(View.VISIBLE);
        }else{
            tv_need_shipin.setVisibility(View.GONE);
        }
        if(isShipinCanAdd){
            iv_add_luxiang.setVisibility(View.VISIBLE);
        }else{
            iv_add_luxiang.setVisibility(View.GONE);
        }
    }
    private List<DefineFile>shipinDeleteFileList=new ArrayList<>();
    private void addShipinImageView(final DefineFile file) {
        shipinFileList.add(file);
        final View view = LayoutInflater.from(context).inflate(R.layout.base_item_file_des, null);
        final ImageView iv = (ImageView) view.findViewById(R.id.iv_base_item_file_des);
        ImageView iv_isupload = (ImageView) view.findViewById(R.id.iv_isupload_base_item_file_des);
        TextView tv_des = (TextView) view.findViewById(R.id.tv_des_base_item_file_des);
        final ImageView iv_select = (ImageView) view.findViewById(R.id.iv_select_base_item_file_des);
        ImageView iv_left_bottom=(ImageView)view.findViewById(R.id.iv_left_bottom);
        if(file.leftBottomResId!=0){
            iv_left_bottom.setVisibility(View.VISIBLE);
            iv_left_bottom.setImageResource(file.leftBottomResId);
        }else{
            iv_left_bottom.setVisibility(View.GONE);
        }
        LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        params.rightMargin = Util.dip2px(context, 10);
        iv.setImageResource(R.drawable.shape_gray_light);
        if (!StringUtil.isNullOrEmpty(file.mime)) {
            if (file.mime.startsWith("http")) {
                iv_isupload.setVisibility(View.VISIBLE);
            } else {
                iv_isupload.setVisibility(View.GONE);
            }
        } else {
            iv_isupload.setVisibility(View.GONE);
        }
        ll_luxiang_list.addView(view, params);
        tv_des.setVisibility(view.GONE);
        view.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!StringUtil.isNullOrEmpty(file.mime)) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    if (file.mime.startsWith("http")) {
                        intent.setDataAndType(Uri.parse(file.mime), "video/*");
                    } else {
                        intent.setDataAndType(Uri.parse("file://" + file.mime), "video/*");
                    }
                    Util.openSanfangIntent(context,intent);
                } else {
                    ToastUtils.shortgmsg(context, "当前路径为空");
                }

            }
        });
            view.setOnLongClickListener(new OnLongClickListener() {
                @Override
                public boolean onLongClick(final View v) {
                    Util.showDialog(context, "是否删除？", "否", "是", null, new DialogButtonOnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int index = (Integer) view.getTag();
                            DefineFile file = shipinFileList.get(index);
                            if (file.mime.startsWith("http")&&file.type==0) {
                                if(isShipinNetCanDelete){
                                    shipinDeleteFileList.add(file);
                                    ll_luxiang_list.removeViewAt(index);
                                    shipinFileList.remove(index);
                                    for (int i = 0; i < ll_luxiang_list.getChildCount(); i++) {
                                        ll_luxiang_list.getChildAt(i).setTag(i);
                                    }
                                }else{
                                    ToastUtils.shortgmsg(context,"不能删除网络视频");
                                    return;
                                }

                            }else{
                                ll_luxiang_list.removeViewAt(index);
                                shipinFileList.remove(index);
                                for (int i = 0; i < ll_luxiang_list.getChildCount(); i++) {
                                    ll_luxiang_list.getChildAt(i).setTag(i);
                                }
                            }


                        }
                    });
                    return true;
                }
            });


        handler.post(new Runnable() {
            @Override
            public void run() {
                hsv_shipin.fullScroll(ScrollView.FOCUS_RIGHT);
            }
        });
        view.setTag(shipinFileList.size() - 1);//设置view的Index
        if(isShipinCanSelect&&file.isCanSelect){
            iv_select.setVisibility(View.VISIBLE);
        }else{
            iv_select.setVisibility(View.GONE);
        }
        iv_select.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int index = (Integer) view.getTag();
                file.isSelect = !file.isSelect;
                if (file.isSelect) {
                    iv_select.setBackgroundResource(R.drawable.checked);
                } else {
                    iv_select.setBackgroundResource(R.drawable.uncheck);
                }
            }
        });

    }

    //获取本地要传的数据
    public List<DefineFile>getShipinLocalList(){
        List<DefineFile>localShipinFileList=new ArrayList<>();
        if(shipinFileList!=null&&shipinFileList.size()>0){
            for(final DefineFile file:shipinFileList){
                if (file.type==1&&!file.mime.startsWith("http")){
                    if(Util.isFilePathExist(file.mime)){
                        localShipinFileList.add(file);
                    }
                }
            }
        }
        return localShipinFileList;
    }
    //获取删除的网络的视频
    public List<DefineFile>getShipinDeleteNetList(){
        return shipinDeleteFileList;
    }
    //获取拷贝的视频的数组
    public List<DefineFile>getShipinCopyList(){
        List<DefineFile>copyShipinFileList=new ArrayList<>();
        if(shipinFileList!=null&&shipinFileList.size()>0){
            for(final DefineFile file:shipinFileList){
                if (file.type==2){
                    copyShipinFileList.add(file);
                }
            }
        }
        return copyShipinFileList;
    }

    private void ShowVideoPicker() {

        FunctionOptions options = new FunctionOptions.Builder()
                .setType(FunctionConfig.TYPE_VIDEO) // 图片or视频 FunctionConfig.TYPE_IMAGE  TYPE_VIDEO
//                .setCompress(true) //是否压缩
//                        .setEnablePixelCompress() //是否启用像素压缩
//                        .setEnableQualityCompress() //是否启质量压缩
//                        .setMaxSelectNum() // 可选择图片的数量
//                        .setMinSelectNum()// 图片或视频最低选择数量，默认代表无限制
                .setSelectMode(FunctionConfig.MODE_MULTIPLE) // 单选 or 多选  FunctionConfig.MODE_SINGLE FunctionConfig.MODE_MULTIPLE
//                .setShowCamera(true) //是否显示拍照选项 这里自动根据type 启动拍照或录视频
//                .setEnablePreview(true) // 是否打开预览选项
//                        .setPreviewVideo() // 是否预览视频(播放) mode or 多选有效
//                        .setCheckedBoxDrawable() //自定义选择样式
//                        .setRecordVideoDefinition() // 视频清晰度
//                        .setRecordVideoSecond() // 视频秒数
//                        .setVideoS(0)// 查询多少秒内的视频 单位:秒
//                        .setCustomQQ_theme()// 可自定义QQ数字风格，不传就默认是蓝色风格
//                        .setGif()// 是否显示gif图片，默认不显示
//                        .setMaxB() // 压缩最大值 例如:200kb  就设置202400，202400 / 1024 = 200kb左右
//                        .setPreviewColor() //预览字体颜色
                .setCompleteColor(Color.parseColor("#c00c0d")) //已完成字体颜色
//                        .setPreviewTopBgColor()//预览图片标题背景色
//                        .setPreviewBottomBgColor() //预览底部背景色
//                        .setBottomBgColor() //图片列表底部背景色
//                        .setGrade() // 压缩档次 默认三档
//                        .setCheckNumMode() //仿qq数字模式
//                        .setCompressQuality() // 图片裁剪质量,默认无损
//                        .setImageSpanCount() // 每行个数
//                        .setSelectMedia() // 已选图片，传入在次进去可选中，不能传入网络图片
//                        .setCompressFlag() // 1 系统自带压缩 2 luban压缩
//                        .setCompressW() // 压缩宽 如果值大于图片原始宽高无效
//                        .setCompressH() // 压缩高 如果值大于图片原始宽高无效
//                        .setThemeStyle(Color.parseColor("#ff0000")) // 设置主题样式
//                        .setNumComplete(false) // 0/9 完成  样式
//                        .setPicture_title_color() // 设置标题字体颜色
//                        .setPicture_right_color() // 设置标题右边字体颜色
//                        .setLeftBackDrawable() // 设置返回键图标
//                .setStatusBar(R.color.title_red) //   设置状态栏颜色，默认是和标题栏一致
//                        .setImmersive(false)// 是否改变状态栏字体颜色(黑色)
//                        .setClickVideo()// 点击声音
                .create();
        PictureConfig.getInstance().init(options).openPhoto(activity,
                new PictureConfig.OnSelectResultCallback() {
                    @Override
                    public void onSelectSuccess(List<LocalMedia> resultList) {
                        if(resultList!=null&&resultList.size()>0){
                            for (int i = 0; i < resultList.size(); i++) {
                                DefineFile file=new DefineFile();
                                file.mime=resultList.get(i).getPath();
                                file.type=1;
                                addShipinImageView(file);
                            }
                        }

                    }


                    @Override
                    public void onSelectSuccess(LocalMedia media) {
                        //单选回调  多选不走  需要在前边先设置单，多选
//                        selectMedia.add(media);
//                        Log.e("tag","单选");
//                        addShipin(media);
                    }
                });

    }

    private List<DefineFile>yinpinFileList=new ArrayList();

    private boolean isyinpinCanAdd;//是不是可以添加图片
    private boolean isyinpinNetCanDelete;//网络图片是不是可以删除
    private boolean isyinpinCanSelect;//音频是不是可以选择

    /**
     * 设置视频的种类
     * @param isyinpinCanAdd 视频可以添加
     * @param isyinpinNetCanDelete 网络视频可以删除
     * @param isyinpinCanSelect  音频是不是可以选择
     */
    public void setYinpinType(boolean isyinpinCanAdd,boolean isyinpinNetCanDelete,boolean isyinpinCanSelect,boolean isYinpinNeed){
        this.isyinpinCanAdd=isyinpinCanAdd;
        this.isyinpinCanSelect=isyinpinCanSelect;
        this.isyinpinNetCanDelete=isyinpinNetCanDelete;
        if(isyinpinCanAdd){
            iv_add_luyin.setVisibility(View.VISIBLE);
        }else{
            iv_add_luyin.setVisibility(View.GONE);
        }
        if(isYinpinNeed){
            tv_need_yinpin.setVisibility(View.VISIBLE);
        }else{
            tv_need_yinpin.setVisibility(View.GONE);
        }
    }
    private List<DefineFile>yinpinDeleteFileList=new ArrayList<>();

    private void addYinpinImageView(final DefineFile file) {
        yinpinFileList.add(file);
        final View view = LayoutInflater.from(context).inflate(R.layout.base_item_file_des, null);
        final ImageView iv = (ImageView) view.findViewById(R.id.iv_base_item_file_des);
        ImageView iv_isupload = (ImageView) view.findViewById(R.id.iv_isupload_base_item_file_des);
        TextView tv_des = (TextView) view.findViewById(R.id.tv_des_base_item_file_des);
        final ImageView iv_select = (ImageView) view.findViewById(R.id.iv_select_base_item_file_des);
        ImageView iv_left_bottom=(ImageView)view.findViewById(R.id.iv_left_bottom);
        if(file.leftBottomResId!=0){
            iv_left_bottom.setVisibility(View.VISIBLE);
            iv_left_bottom.setImageResource(file.leftBottomResId);
        }else{
            iv_left_bottom.setVisibility(View.GONE);
        }
        LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        params.rightMargin = Util.dip2px(context, 10);
        iv.setImageResource(R.drawable.luyin_suoluetu);
        if (!StringUtil.isNullOrEmpty(file.mime)) {
            if (file.mime.startsWith("http")) {
                iv_isupload.setVisibility(View.VISIBLE);
            } else {
                iv_isupload.setVisibility(View.GONE);
            }
        } else {
            iv_isupload.setVisibility(View.GONE);
        }
        tv_des.setVisibility(view.GONE);
        ll_luyin_list.addView(view, params);
        handler.post(new Runnable() {
            @Override
            public void run() {
                hsv_luyin.fullScroll(ScrollView.FOCUS_RIGHT);
            }
        });
        view.setTag(yinpinFileList.size() - 1);//设置view的Index
            view.setOnLongClickListener(new OnLongClickListener() {
                @Override
                public boolean onLongClick(final View v) {

                    Util.showDialog(context, "是否删除？", "否", "是", null, new DialogButtonOnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int index = (Integer) view.getTag();
                            DefineFile file = yinpinFileList.get(index);

                            if (file.mime.startsWith("http")&&file.type==0) {
                                if(isyinpinCanAdd){
                                    yinpinDeleteFileList.add(file);
                                    ll_luyin_list.removeViewAt(index);
                                    yinpinFileList.remove(index);
                                    for (int i = 0; i < ll_luyin_list.getChildCount(); i++) {
                                        ll_luyin_list.getChildAt(i).setTag(i);
                                    }
                                }else{
                                    ToastUtils.shortgmsg(context,"不能删除网络音频");
                                    return;
                                }

                            }else{
                                ll_luyin_list.removeViewAt(index);
                                yinpinFileList.remove(index);
                                for (int i = 0; i < ll_luyin_list.getChildCount(); i++) {
                                    ll_luyin_list.getChildAt(i).setTag(i);
                                }
                            }


                        }
                    });
                    return true;
                }
            });

        if(isyinpinCanSelect&&file.isCanSelect){
            iv_select.setVisibility(View.VISIBLE);
        }else{
            iv_select.setVisibility(View.GONE);
        }
        iv_select.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int index = (Integer) view.getTag();
                file.isSelect = !file.isSelect;
                if (file.isSelect) {
                    iv_select.setBackgroundResource(R.drawable.checked);
                } else {
                    iv_select.setBackgroundResource(R.drawable.uncheck);
                }
            }
        });
        view.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                if (file.mime.startsWith("http")) {
                    intent.setDataAndType(Uri.parse(file.mime), "audio/MP3");
                } else {
                    intent.setDataAndType(Uri.parse("file://" + file.mime), "audio/MP3");
                }
                Util.openSanfangIntent(context,intent);
            }
        });
    }
    //获取本地要传的数据
    public List<DefineFile>getYinpinLocalList(){
        List<DefineFile>localYinpinFileList=new ArrayList<>();
        if(yinpinFileList!=null&&yinpinFileList.size()>0){
            for(final DefineFile file:yinpinFileList){
                if (file.type==1&&!file.mime.startsWith("http")){
                    if(Util.isFilePathExist(file.mime)){
                        localYinpinFileList.add(file);
                    }
                }
            }
        }
        return localYinpinFileList;
    }
    //获取删除的网络的视频
    public List<DefineFile>getYinpinDeleteNetList(){
        return yinpinDeleteFileList;
    }
    //获取拷贝的视频的数组
    public List<DefineFile>getYinpinCopyList(){
        List<DefineFile>copyYinpinFileList=new ArrayList<>();
        if(yinpinFileList!=null&&yinpinFileList.size()>0){
            for(final DefineFile file:yinpinFileList){
                if (file.type==2){
                    copyYinpinFileList.add(file);
                }
            }
        }
        return copyYinpinFileList;
    }


    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (TO_XIANGCE==requestCode&&resultCode == Activity.RESULT_OK ) {
            if(null!=data){
                final String xiangceFilePath = AlbumUtils.getAlbumPath(data, context);
                File xiangceFile = new File(xiangceFilePath);
                if (!xiangceFile.exists()) {
                    ToastUtils.shortgmsg(context, "当前文件不存在或者无效");
                    return;
                }
                Util.showDialog(context, "是否标记图片?", "否", "是", new DialogButtonOnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        DefineFile file = new DefineFile();
                        file.mime = xiangceFilePath;
                        file.type = 1;
                        addPictureImageView(file);
                    }
                }, new DialogButtonOnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Intent intent = new Intent(context, com.dhyt.ejianli.ui.BasePicMarkActivity.class);
                        intent.putExtra("path", xiangceFilePath);
                        if(activity!=null){
                            activity.startActivityForResult(intent, TO_MARK_PIC);
                        }else{
                            fragment.startActivityForResult(intent, TO_MARK_PIC);
                        }

                    }
                });

                UtilLog.e("tag", "相册调用是否成功" + xiangceFilePath);
            }
        }else  if (requestCode == TO_ZHAOXIANGJI && resultCode == Activity.RESULT_OK) {
            File file = new File(curentZhaoxianjiPicPath);
            if (file.exists()) {
                ToastUtils.shortgmsg(context,"拍摄成功");
            } else {
                return;
            }

            try {

                Util.showDialog(context, "是否标记图片?", "否", "是", new DialogButtonOnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        DefineFile file = new DefineFile();
                        file.mime = curentZhaoxianjiPicPath;
                        file.type = 1;
                        addPictureImageView(file);
                    }
                }, new DialogButtonOnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Intent intent = new Intent(context, com.dhyt.ejianli.ui.BasePicMarkActivity.class);
                        intent.putExtra("path", curentZhaoxianjiPicPath);
                        if(activity!=null){
                            activity.startActivityForResult(intent, TO_MARK_PIC);
                        }else{
                            fragment.startActivityForResult(intent, TO_MARK_PIC);
                        }
                    }
                });

            } catch (Exception e) {
                // TODO: handle exception
            }

        }if(TO_MARK_PIC==requestCode&& resultCode == Activity.RESULT_OK){
                List<String> picPathList = (List<String>) data.getSerializableExtra("picPathList");
                 DefineFile file = new DefineFile();
                 file.mime = picPathList.get(0);
                file.type = 1;
                addPictureImageView(file);
        }
    }


    private Handler timeHandler = new Handler();
    private VoiceRecordUtils voiceRecordUtils;
    private Dialog luyinDialog;
    private String luyinFileName;

    private TextView tv_yuyin_time;
    private int luyinTime = 0;//录音记录的时间
    private Runnable timeRunnable = new Runnable() {
        @Override
        public void run() {
            tv_yuyin_time.setText(Util.secondToHMS(luyinTime));
            timeHandler.postDelayed(this, 1000);
            luyinTime++;
        }
    };

    private void initLuyinDialog() {
        luyinDialog = new AlertDialog.Builder(context).create();
        luyinDialog.setCanceledOnTouchOutside(false);
        luyinDialog.show();
        Window window = luyinDialog.getWindow();
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        int screenWidth = wm.getDefaultDisplay().getWidth();
        WindowManager.LayoutParams params =
                luyinDialog.getWindow().getAttributes();
        params.width = screenWidth - Util.dip2px(context, 60);
        luyinDialog.getWindow().setAttributes(params);
        window.setContentView(R.layout.dialog_luyin);

        tv_yuyin_time = (TextView) window.findViewById(R.id.tv_yuyin_time);
        final ImageView iv_yuyin_play = (ImageView) window.findViewById(R.id.iv_yuyin_play);
        final TextView tv_luyin_state = (TextView) window.findViewById(R.id.tv_luyin_state);
        LinearLayout ll_luyin_operate = (LinearLayout) window.findViewById(R.id.ll_luyin_operate);
        final ImageView iv_luyin_point = (ImageView) window.findViewById(R.id.iv_luyin_point);
        final TextView tv_luyin_restart = (TextView) window.findViewById(R.id.tv_luyin_restart);
        final TextView tv_luyin_finish = (TextView) window.findViewById(R.id.tv_luyin_finish);
        tv_luyin_finish.setVisibility(View.INVISIBLE);
        tv_luyin_restart.setVisibility(View.INVISIBLE);
        iv_yuyin_play.setVisibility(View.INVISIBLE);
        iv_luyin_point.setBackgroundResource(R.drawable.luyin_start_point);
        tv_luyin_state.setText("开始录音");
        luyinDialog.dismiss();
        ll_luyin_operate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String luyinState = tv_luyin_state.getText().toString();
                if ("开始录音".equals(luyinState)) {
                    long time = System.currentTimeMillis();
                    luyinFileName = "3_" + time + ".mp3";
                    voiceRecordUtils.initvoiceRecord(luyinFileName);
                    luyinTime = 0;
                    timeHandler.removeCallbacks(timeRunnable);
                    timeHandler.post(timeRunnable);
                    voiceRecordUtils.startRecord();
                    tv_luyin_state.setText("暂停录音");
                    iv_luyin_point.setBackgroundResource(R.drawable.luyin_pause_point);
                    tv_luyin_restart.setVisibility(View.VISIBLE);
                    tv_luyin_finish.setVisibility(View.INVISIBLE);
                    iv_yuyin_play.setVisibility(View.INVISIBLE);
                } else if ("暂停录音".equals(luyinState)) {
                    timeHandler.removeCallbacks(timeRunnable);
                    voiceRecordUtils.pauseRecord();
                    tv_luyin_state.setText("继续录音");
                    iv_luyin_point.setBackgroundResource(R.drawable.luyin_continue_point);
                    tv_luyin_restart.setVisibility(View.VISIBLE);
                    tv_luyin_finish.setVisibility(View.VISIBLE);
                    iv_yuyin_play.setVisibility(View.INVISIBLE);
                } else {
                    timeHandler.removeCallbacks(timeRunnable);
                    timeHandler.post(timeRunnable);
                    voiceRecordUtils.continueRecord();
                    tv_luyin_state.setText("暂停录音");
                    iv_luyin_point.setBackgroundResource(R.drawable.luyin_pause_point);
                    tv_luyin_restart.setVisibility(View.VISIBLE);
                    tv_luyin_finish.setVisibility(View.INVISIBLE);
                    iv_yuyin_play.setVisibility(View.INVISIBLE);
                }
            }
        });
        tv_luyin_restart.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                voiceRecordUtils.endRecord();
                luyinTime = 0;
                tv_yuyin_time.setText("00:00:00");
                timeHandler.removeCallbacks(timeRunnable);
                long time = System.currentTimeMillis();
                luyinFileName = time + ".mp3";
                voiceRecordUtils.initvoiceRecord(luyinFileName);
                tv_luyin_finish.setVisibility(View.INVISIBLE);
                tv_luyin_restart.setVisibility(View.INVISIBLE);
                iv_yuyin_play.setVisibility(View.INVISIBLE);
                iv_luyin_point.setBackgroundResource(R.drawable.luyin_start_point);
                tv_luyin_state.setText("开始录音");
            }
        });

        tv_luyin_finish.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                luyinDialog.dismiss();
                final Dialog dialog = Util.createProgressDialog(context, "添加中..");
                dialog.show();
                new AsyncTask<Void, Boolean, Boolean>() {

                    @Override
                    protected Boolean doInBackground(Void... params) {
                        return voiceRecordUtils.stopRecordingAndConvertFile();
                    }

                    @Override
                    protected void onPostExecute(Boolean aBoolean) {
                        super.onPostExecute(aBoolean);
                        dialog.dismiss();
                        if (aBoolean) {
                            String path = voiceRecordUtils.getSaveAbsolutePath();
                            DefineFile file = new DefineFile();
                            file.mime = path;
                            file.type = 1;
                            addYinpinImageView(file);
                        } else {
                            ToastUtils.shortgmsg(context, "加载失败");
                        }
                    }
                }.execute();

            }
        });

        luyinDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                voiceRecordUtils.endRecord();
                //**
                // 恢复原样
                //*
                luyinTime = 0;
                timeHandler.removeCallbacks(timeRunnable);
                tv_yuyin_time.setText("00:00:00");
                tv_luyin_finish.setVisibility(View.INVISIBLE);
                tv_luyin_restart.setVisibility(View.INVISIBLE);
                iv_yuyin_play.setVisibility(View.INVISIBLE);
                iv_luyin_point.setBackgroundResource(R.drawable.luyin_start_point);
                tv_luyin_state.setText("开始录音");
            }
        });

    }


    private Dialog playLuyinDialog;
    private TextView tv_play_yuyin_time;
    private int playLuyinTime = 0;//录音记录的时间
    private LinearLayout ll_play_luyin_operate;
    private MediaPlayer mp = new MediaPlayer();
    private Runnable playTimeRunnable = new Runnable() {
        @Override
        public void run() {
            tv_play_yuyin_time.setText(Util.secondToHMS(playLuyinTime));
            timeHandler.postDelayed(this, 1000);
            playLuyinTime++;
        }
    };

    public  List<DefineFile>getAllSelectFileList(){
        List<DefineFile>allSelectList=new ArrayList<>();
        if(Util.isListNotNull(pictureFileList)){
            for(DefineFile defineFile:pictureFileList){
                if(defineFile.isSelect){
                    allSelectList.add(defineFile);
                }
            }
        }
        if(Util.isListNotNull(shipinFileList)){
            for(DefineFile defineFile:shipinFileList){
                if(defineFile.isSelect){
                    allSelectList.add(defineFile);
                }
            }
        }
        if(Util.isListNotNull(yinpinFileList)){
            for(DefineFile defineFile:yinpinFileList){
                if(defineFile.isSelect){
                    allSelectList.add(defineFile);
                }
            }
        }
        return  allSelectList;
    }
}
