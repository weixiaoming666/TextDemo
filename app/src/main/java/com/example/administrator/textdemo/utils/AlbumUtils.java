package com.example.administrator.textdemo.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 相册取得路径
 * Created by cl on 2016/12/8.
 */

public class AlbumUtils {
    private static String path;
    //获取相册照片路径
    public static String getAlbumPath(Intent intent,Context context){
        Uri selectedImage = intent.getData();
        selectedImage = getUri(intent,context);
        String[] filePathColumn1 = { MediaStore.Images.Media.DATA };
        Cursor cursor = context.getContentResolver().query(selectedImage,
                filePathColumn1, null, null, null);
        if (cursor==null) {
            return "";
        }
       try{
           cursor.moveToFirst();
           int columnIndex1 = cursor.getColumnIndex(filePathColumn1[0]);
           String picturePath = cursor.getString(columnIndex1);
           cursor.close();
           path = picturePath;
       }catch (Exception e){
           e.printStackTrace();
           return "";
       }
        return path;
    }
    //拍照
    public static String getPhoto(Intent intent,Context context){
        Bitmap photo = null;
        Uri uri = intent.getData();
        if (uri != null) {
            photo = BitmapFactory.decodeFile(uri.getPath());
        }
        if (photo == null) {
            Bundle bundle = intent.getExtras();
            if (bundle != null) {
                photo = (Bitmap) bundle.get("data");
            } else {
                Toast.makeText(context, "拍照失败", Toast.LENGTH_LONG).show();
                return null;
            }
        }
        FileOutputStream fileOutputStream = null;
        try {
            // 获取 SD 卡根目录
            String saveDir = Environment.getExternalStorageDirectory()
                    + "/meitian_photos";
            // 新建目录
            File dir = new File(saveDir);
            if (!dir.exists())
                dir.mkdir();
            // 生成文件名
            SimpleDateFormat t = new SimpleDateFormat("yyyyMMddssSSS");
            String filename = "MT" + (t.format(new Date())) + ".jpg";
            // 新建文件
            File newfile = new File(saveDir, filename);
            // 打开文件输出流
            fileOutputStream = new FileOutputStream(newfile);
            // 生成图片文件
            photo.compress(Bitmap.CompressFormat.JPEG, 100,
                    fileOutputStream);
            // 相片的完整路径
            path = newfile.getPath();
        } catch (Exception e) {
            // TODO: handle exception
        }
        return path;
    }
    //解决小米手机选择照片崩溃问题
    private static Uri getUri(Intent intent, Context context) {
        Uri uri = intent.getData();
        String type = intent.getType();
        if (uri.getScheme().equals("file") && (type.contains("image/"))) {
            String path = uri.getEncodedPath();
            if (path != null) {
                path = Uri.decode(path);
                ContentResolver cr = context.getContentResolver();
                StringBuffer buff = new StringBuffer();
                buff.append("(").append(MediaStore.Images.ImageColumns.DATA).append("=")
                        .append("'" + path + "'").append(")");
                Cursor cur = cr.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                        new String[] { MediaStore.Images.ImageColumns._ID },
                        buff.toString(), null, null);
                int index = 0;
                for (cur.moveToFirst(); !cur.isAfterLast(); cur.moveToNext()) {
                    index = cur.getColumnIndex(MediaStore.Images.ImageColumns._ID);
                    // set _id value
                    index = cur.getInt(index);
                }
                if (index == 0) {
                    // do nothing
                } else {
                    Uri uri_temp = Uri
                            .parse("content://media/external/images/media/"
                                    + index);
                    if (uri_temp != null) {
                        uri = uri_temp;
                    }
                }
            }
        }
        return uri;
    }
}
