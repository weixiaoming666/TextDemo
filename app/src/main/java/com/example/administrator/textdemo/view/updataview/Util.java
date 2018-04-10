package com.example.administrator.textdemo.view.updataview;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.textdemo.R;
import com.example.administrator.textdemo.ToastUtils;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * 常用的工具类
 * @author wyc
 *
 */
public class Util {
	/** 
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素) 
     */  
    public static int dip2px(Context context, float dpValue) {  
        final float scale = context.getResources().getDisplayMetrics().density;  
        return (int) (dpValue * scale + 0.5f);  
    }  
  
    /** 
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp 
     */  
    public static int px2dip(Context context, float pxValue) {  
        final float scale = context.getResources().getDisplayMetrics().density;  
        return (int) (pxValue / scale + 0.5f);  
    }  
    public static boolean isFilePathExist(String path){
    	if(StringUtil.isNullOrEmpty(path)){
    		return false;
    	}else{
    		File file=new File(path);
    		return file.exists();
    	}
    }
    /**
     * 队列比较
     * @param <T>
     * @param a
     * @param b
     * @return
     */
    public static <T extends Comparable<T>> boolean compareList(List<T> a, List<T> b) {
      if(a.size() != b.size())
        return false;
      Collections.sort(a);
      Collections.sort(b);
      for(int i=0;i<a.size();i++){
        if(!a.get(i).equals(b.get(i)))
          return false;
      }
      return true;
    }
    /* 
	 * Java文件操作 获取不带扩展名的文件名 
	 */   
	    public static String getFileNameNoEx(String filename) {    
	        if ((filename != null) && (filename.length() > 0)) {    
	            int dot = filename.lastIndexOf('.');    
	            if ((dot >-1) && (dot < (filename.length()))) {    
	                return filename.substring(0, dot);    
	            }    
	        }    
	        return filename;    
	    }  
	  //秒转成时分秒
	public static String secondToHMS(int second){
		  int h = 0;
		  int d = 0;
		  int s = 0;
		  int temp = second%3600;
		       if(second>3600){
		         h= second/3600;
		              if(temp!=0){
		         if(temp>60){
		         d = temp/60;
		      if(temp%60!=0){
		         s = temp%60;
		      }
		      }else{
		         s = temp;
		      }
		     }
		    }else{
		        d = second/60;
		     if(second%60!=0){
		        s = second%60;
		     }
		    }
		    String hourStr=h>9?h+"":"0"+h;
		    String minuteStr=d>9?d+"":"0"+d;
		    String secondStr=s>9?s+"":"0"+s;
		   return hourStr+":"+minuteStr+":"+secondStr;
		 }








	/**

	//判断当前activity是否销毁
	public static boolean isActivityRun(Context context){
		boolean isRun=false;
		if(context instanceof Activity){
			Activity activity=(Activity)context;
			if(!activity.isFinishing()){
				isRun=true;
			}
		}
		return isRun;
	}


	public static void setListViewHeightBasedOnChildren(ListView listView) {  
		//获取ListView对应的Adapter  
		ListAdapter listAdapter = listView.getAdapter();   
		if (listAdapter == null) {  
		// pre-condition  
		return;  
		}  
		  
		int totalHeight = 0;  
		for (int i = 0, len = listAdapter.getCount(); i < len; i++) { //listAdapter.getCount()返回数据项的数目  
		View listItem = listAdapter.getView(i, null, listView);  
		listItem.measure(0, 0); //计算子项View 的宽高  
		totalHeight += listItem.getMeasuredHeight(); //统计所有子项的总高度  
		}  
		  
		ViewGroup.LayoutParams params = listView.getLayoutParams();  
		params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));  
		//listView.getDividerHeight()获取子项间分隔符占用的高度  
		//params.height最后得到整个ListView完整显示需要的高度  
		listView.setLayoutParams(params);  
		} 
	  public static void setExpandableListViewHeight(ExpandableListView listView, int group){
	        //得到相应ListView的适配器
	        ExpandableListAdapter listAdapter = listView.getExpandableListAdapter();
	        //总高度
	        int totalHeight = 0;
	        //期望的宽度
	        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), View.MeasureSpec.EXACTLY);
	        for (int i = 0; i < listAdapter.getGroupCount(); i++) {
	            //得到一级条目
	            View groupItem = listAdapter.getGroupView(i, false, null, listView);
	            //groupItem根据给的参数测量一下尺寸，方法调用完后groupItem大小就确定了
	            groupItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
	            //累加一级条目高度
	            totalHeight += groupItem.getHeight();
	            //    除了group条目外都展开了  或者  group那一条目没有展开
	            if (((listView.isGroupExpanded(group))&&(i!=group)) ||((!listView.isGroupExpanded(group))&&(i == group)) ) {
	                for (int j = 0; j < listAdapter.getChildrenCount(i); j++) {
	                    //得到二级条目
	                    View listItem = listAdapter.getChildView(i, j, false, null, listView);
	                    //listItem根据给的参数测量一下尺寸，方法调用完后listItem大小就确定了
	                    listItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
	                    //累加二级条目高度
	                    totalHeight += listItem.getHeight();
	                }
	            }
	        }
	        //获得listView的布局参数
	        ViewGroup.LayoutParams params = listView.getLayoutParams();
	        //listView的高度 = 一级条目和二级条目总和 + 分割线高度总和
	        int height = totalHeight + (listView.getDividerHeight()*(listAdapter.getGroupCount() - 1));
	        //如果高度小于10，则设置为200，没有太大关系
	        if(height < 10){
	            height = 200;
	        }
	        //把高度赋值给布局参数
	        params.height = height;
	        //把布局参数回传给listView
	        listView.setLayoutParams(params);
	        //listView按照参数从新布局
	        listView.requestLayout();
	    }
	/**
	 * 
	 * @param activity
	 * @param f 透明度 0-1
	 */
	public static void setScreenAlpha(Activity activity,float f) {
		// TODO Auto-generated method stub
		WindowManager.LayoutParams lp = activity.getWindow().getAttributes();
		lp.alpha = f;
		activity.getWindow().setAttributes(lp);
	}
	/**
     * 用于获取状态栏的高度。 使用Resource对象获取（推荐这种方式）
     *
     * @return 返回状态栏高度的像素值。
     */
    public static int getStatusBarHeight(Context context) {
        int result = 0;
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen",
                "android");
        if (resourceId > 0) {
            result = context.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }
    /**
     * 屏幕宽
     * @param context
     * @return
     */
    public static int getScreenWidth(Context context){
    	WindowManager wm = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
		int screenWidth = wm.getDefaultDisplay().getWidth();
    	return screenWidth;
    }
    /**
     * 屏幕高
     * @param context
     * @return
     */
    public static int getScreenHeight(Context context){
    	WindowManager wm = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
		int screenHeight = wm.getDefaultDisplay().getHeight();
    	return screenHeight;
    }
	public static String readFile(String filePath) {
		File file = new File(filePath);
		BufferedReader reader = null;
		StringBuffer sb = new StringBuffer();
		try {
			InputStreamReader isr;
			isr = new InputStreamReader(new FileInputStream(file), "utf-8");
			reader = new BufferedReader(isr, 5 * 1024 * 1024); // 如果是读大文件 则 new
			// BufferedReader(new FileReader(file),5*1024*1024) 即，设置缓存
			String tempString = null;

			while ((tempString = reader.readLine()) != null)

			{
				sb.append(tempString + "\n");
				// 进行操作.....

			}
			reader.close();

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			if (reader != null)

			{
				try {
					reader.close();
				} catch (IOException e)
				{
					e.printStackTrace();
				}

			}
		}
		return sb.toString();
	}
	/**
	 * 复制单个文件
	 * @param oldPath String 原文件路径 如：c:/fqf.txt
	 * @param newPath String 复制后路径 如：f:/fqf.txt
	 * @return boolean
	 */
	public static void copyFile(String oldPath, String newPath) {
		try {
			int bytesum = 0;
			int byteread = 0;
			File oldfile = new File(oldPath);
			if (oldfile.exists()) { //文件存在时
				InputStream inStream = new FileInputStream(oldPath); //读入原文件
				File newParentFile=new File(newPath).getParentFile();
				if(!newParentFile.exists()){
					newParentFile.mkdirs();
				}
				FileOutputStream fs = new FileOutputStream(newPath);
				byte[] buffer = new byte[1444];
				int length;
				while ( (byteread = inStream.read(buffer)) != -1) {
					bytesum += byteread; //字节数 文件大小
					System.out.println(bytesum);
					fs.write(buffer, 0, byteread);
				}
				inStream.close();
			}
		}
		catch (Exception e) {
			System.out.println("复制单个文件操作出错");
			e.printStackTrace();

		}

	}
	/**
    * 递归删除目录下的所有文件及子目录下所有文件
    * @param dir 将要删除的文件目录
    * @return boolean Returns "true" if all deletions were successful.
    *                 If a deletion fails, the method stops attempting to
    *                 delete and returns "false".
    */
   public static boolean deleteDir(File dir) {
       if (dir.isDirectory()) {
           String[] children = dir.list();
           //递归删除目录中的子目录下
           for (int i=0; i<children.length; i++) {
               boolean success = deleteDir(new File(dir, children[i]));
               if (!success) {
                   return false;
               }
           }
       }
       // 目录此时为空，可以删除
       return dir.delete();
   }
   //通过年月得到天的个数
   public static int getDayNumber(int year,int month){
	   int days=0;
	   switch(month)
	   {
	     case 1:
	     case 3:
	     case 5:
	     case 7:
	        case 8:
	     case 10:
	     case 12:
	     days=31;
	      break;
	     case 4:
	     case 6:
	     case 9:
	     case 11:
	     days=30;
	   break;
	     case 2:
	   if(year%4==0&&year%100!=0 ||year%400==0)
	     days=29;
	   else
	    days=28;
	   } 
	   return days;
   }
   /**
	* 加载本地图片
	* http://bbs.3gstdy.com
	* @param url
	* @return
	*/
	public static Bitmap getLoacalBitmap(String url) {
		
		
		 BitmapFactory.Options newOpts = new BitmapFactory.Options();
	        //开始读入图片，此时把options.inJustDecodeBounds 设回true了
	        newOpts.inJustDecodeBounds = true;
	        Bitmap bitmap = BitmapFactory.decodeFile(url,newOpts);//此时返回bm为空
	        newOpts.inJustDecodeBounds = false;
	        int w = newOpts.outWidth;
	        int h = newOpts.outHeight;
	        //现在主流手机比较多是800*480分辨率，所以高和宽我们设置为
	        float hh = 800f;//这里设置高度为800f
	        float ww = 480f;//这里设置宽度为480f
	        //缩放比。由于是固定比例缩放，只用高或者宽其中一个数据进行计算即可
	        int be = 1;//be=1表示不缩放
	        if (w > h && w > ww) {//如果宽度大的话根据宽度固定大小缩放
	            be = (int) (newOpts.outWidth / ww);
	        } else if (w < h && h > hh) {//如果高度高的话根据宽度固定大小缩放
	            be = (int) (newOpts.outHeight / hh);
	        }
	        if (be <= 0)
	            be = 1;
	        newOpts.inSampleSize = be;//设置缩放比例
	        //重新读入图片，注意此时已经把options.inJustDecodeBounds 设回false了
	        bitmap = BitmapFactory.decodeFile(url, newOpts);
	        return bitmap;//压缩好比例大小后再进行质量压缩
	}
	//把字符串转成int  如果为空或者不合法的的时候返回为0
	public static int parseInt(String str){
		int result=0;
		try{
			result=Integer.parseInt(str);
		}catch (Exception e){
			return 0;
		}

		return result;
	}
	public static double parseDouble(String str){
		double result=0;
		try{
			result=Double.parseDouble(str);
		}catch (Exception e){
			return 0;
		}

		return result;
	}

	public static Bitmap resizeImage(String path,
            int width,int height) 
    {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;//不加载bitmap到内存中
        BitmapFactory.decodeFile(path,options); 
        int outWidth = options.outWidth;
        int outHeight = options.outHeight;
        options.inDither = false;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inSampleSize = 1;
         
        if (outWidth != 0 && outHeight != 0 && width != 0 && height != 0) 
        {
            int sampleSize=(outWidth/width+outHeight/height)/2;
            options.inSampleSize = sampleSize;
        }
     
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(path, options);     
    }
	
	public static String getShar1(Context context) {
	    try {
	        PackageInfo info = context.getPackageManager().getPackageInfo(
	            context.getPackageName(), PackageManager.GET_SIGNATURES);
	        byte[] cert = info.signatures[0].toByteArray();
	        MessageDigest md = MessageDigest.getInstance("SHA1");
	        byte[] publicKey = md.digest(cert);
	        StringBuffer hexString = new StringBuffer();
	        for (int i = 0; i < publicKey.length; i++) {
	            String appendString = Integer.toHexString(0xFF & publicKey[i])
	                .toUpperCase(Locale.US);
	            if (appendString.length() == 1)
	                hexString.append("0");
	                hexString.append(appendString);
	                hexString.append(":");
	        }
	        String result = hexString.toString();
	        return result.substring(0, result.length()-1);
	    } catch (NameNotFoundException e) {
	        e.printStackTrace();
	    } catch (NoSuchAlgorithmException e) {
	        e.printStackTrace();
	    }
	    return null;
	}







	//打印map
	public static void printMap(Map<String,Object> map){
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			UtilLog.e("tag",entry.getKey()+"的值"+entry.getValue());
		}
	}
	//保留两位小数
	public static String keepTwoDecimal(double text){
		DecimalFormat df = new DecimalFormat("#.00");
		String result=df.format(text);
		if(result.startsWith(".")){
			result=0+result;
		}
		return result;
	}
	//打印一下当前运行的activity信息
	public static void printContextName(Context context){
		UtilLog.e("tag",context.getClass().getPackage().getName()+context.getClass().getName());
	}
	public static int getFileType(String path){
		int type=UtilVar.FILE_TYPE_OTHER;
		if(!StringUtil.isNullOrEmpty(path)){
			if(path.endsWith(".png")||path.endsWith(".jpg")||path.endsWith(".JPG")||path.endsWith(".PNG")||path.endsWith(".bmp")){
				type=UtilVar.FILE_TYPE_IMG;
			}else if(path.endsWith(".mp4")){
				type=UtilVar.FILE_TYPE_SHIPIN;
			}else if(path.endsWith(".mp3")){
				type=UtilVar.FILE_TYPE_YINPIN;
			}else if(path.endsWith(".doc")||path.endsWith(".docx")){
				type=UtilVar.FILE_TYPE_WORD;
			}else if(path.endsWith(".pdf")){
				type=UtilVar.FILE_TYPE_PDF;
			}else if(path.endsWith(".xls") ||path.endsWith(".xlsx")){
				type=UtilVar.FILE_TYPE_XLS;
			}else if(path.endsWith(".htm")||path.endsWith(".html")){
				type=UtilVar.FILE_TYPE_HTML;
			}else if(path.endsWith(".dwg")||path.endsWith(".dxf")||path.endsWith(".dwt")){
				type=UtilVar.FILE_TYPE_CAD;
			}
		}
		return type;
	}

	public static void resizeImageHeight(final Context context,final ImageView iv,final int resourceId){
		ViewTreeObserver vto = iv.getViewTreeObserver();
		vto.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
			public boolean onPreDraw() {
				iv.getViewTreeObserver().removeOnPreDrawListener(this);
				int width = iv.getMeasuredWidth();
				Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), resourceId);
				double bitmapHeight = bitmap.getHeight();
				double btimapWidth= bitmap.getWidth();
				ViewGroup.LayoutParams params=iv.getLayoutParams();
				params.height=(int)(width*(bitmapHeight/btimapWidth));
				iv.setLayoutParams(params);
				return true;
			}
		});
	}

	/**
	 * 里程截取
	 */
	public static String subMileage(String mileage) {
		//5434.1
		if (!StringUtil.isNullOrEmpty(mileage)) {
			if (mileage.contains(".")) {
				//包含
				String start = mileage.substring(0,mileage.indexOf(".")-3);
				String end = mileage.substring(mileage.indexOf(".")-3, mileage.length());
				return "DK"+start + "+" + end;
			} else {
				//不包含
				String start = mileage.substring(0, mileage.length() - 3);
				String end = mileage.substring(mileage.length() - 3, mileage.length());
				return "DK"+start + "+" + end;
			}
		}else{
			return "";
		}


	}

	public static long parseLong(String str) {
		long result = 0;
		try {
			result = Long.parseLong(str);
		} catch (Exception e) {
			return 0;
		}

		return result;
	}

	public static float parseFloat(String str) {
		float result = 0;
		try {
			result = Float.parseFloat(str);
		} catch (Exception e) {
			return 0;
		}

		return result;
	}
	public static boolean isListNotNull(List list){
		if(list!=null&&list.size()>0){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * 创建通用的dialog
	 * @param context
	 * @param message 提示
	 * @param leftText 左侧的button显示的
	 * @param rightText 右侧不同显示的
	 * @param leftOnClick 左侧的点击事件
	 * @param righOnClick 右侧的点击事件
	 * @return
	 */
	public static void showDialog(Context context,String message,String leftText,String rightText,final DialogButtonOnClickListener leftOnClick,final DialogButtonOnClickListener righOnClick){
		final AlertDialog alertDialog = new AlertDialog.Builder(context).create();
		showDialog(alertDialog,context);
		alertDialog.setCanceledOnTouchOutside(false);
		WindowManager wm = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
		int screenWidth = wm.getDefaultDisplay().getWidth();
		WindowManager.LayoutParams params =
				alertDialog.getWindow().getAttributes();
		params.width = screenWidth-Util.dip2px(context, 60);
		alertDialog.getWindow().setAttributes(params);
		Window window = alertDialog.getWindow();
		window.setContentView(R.layout.base_dialog);
		TextView tv_message = (TextView) window.findViewById(R.id.tv_base_dialog_message);
		TextView tv_left = (TextView) window.findViewById(R.id.tv_base_dialog_left);
		TextView tv_right = (TextView) window.findViewById(R.id.tv_base_dialog_right);
		TextView tv_title=(TextView)window.findViewById(R.id.tv_base_dialog_title);
		tv_title.setVisibility(View.GONE);
		tv_message.setText(message);
		tv_left.setText(leftText);
		tv_right.setText(rightText);
		tv_left.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				alertDialog.dismiss();
				if(leftOnClick!=null){
					leftOnClick.onClick(v);
				}
			}
		});
		tv_right.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				alertDialog.dismiss();
				if(righOnClick!=null){
					righOnClick.onClick(v);
				}
			}
		});

	}

	//防止activity已经销毁 dialog仍然显示的问题
	public static void showDialog(Dialog dialog,Context context){
		if(isActivityRun(context)){
			dialog.show();
		}
	}
	//判断当前activity是否销毁
	public static boolean isActivityRun(Context context){
		boolean isRun=false;
		if(context instanceof Activity){
			Activity activity=(Activity)context;
			if(!activity.isFinishing()){
				isRun=true;
			}
		}
		return isRun;
	}
///打开第三方应用
	public static void openSanfangIntent(Context context, Intent intent) {
		final PackageManager packageManager = context.getPackageManager();
		List<ResolveInfo> list = packageManager.queryIntentActivities(intent,
				PackageManager.MATCH_DEFAULT_ONLY);
		if(list!=null&&list.size()>0){
			List <String>packageNameList=new ArrayList();
			List <String>classNameList=new ArrayList();
			for(ResolveInfo info:list){
				String packageName=info.activityInfo.packageName;
				//去除qq
				if(!packageName.contains("com.tencent")){
					packageNameList.add(packageName);
					classNameList.add(info.activityInfo.name);
				}
			}
			if(packageNameList.size()>0){
				//打开默认的应用
				context.startActivity(intent);
			}else{
				ToastUtils.shortgmsg(context, "您的手机没有打开此种格式文件的软件，请安装软件后重试");
			}
		}else{
			ToastUtils.shortgmsg(context, "您的手机没有打开此种格式文件的软件，请安装软件后重试");
		}

	}


	/**
	 * 防止连续点击跳转两个页面
	 */
	public static long lastClickTime;

	public static boolean isFastDoubleClick() {
		long time = System.currentTimeMillis();
		if (time - lastClickTime < 800) {
			return true;
		}
		lastClickTime = time;
		return false;
	}
}
