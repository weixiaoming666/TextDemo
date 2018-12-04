package com.example.administrator.textdemo.demoZSZX.net;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;
import com.example.administrator.textdemo.utils.StringUtil;
import com.example.administrator.textdemo.utils.UtilLog;
import com.lidroid.xutils.http.client.multipart.MultipartEntity;
import com.lidroid.xutils.http.client.multipart.content.FileBody;
import com.lidroid.xutils.http.client.multipart.content.StringBody;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultipartRequest extends Request<String> {

	private MultipartEntity entity = new MultipartEntity();

	private final Response.Listener<String> mListener;

	private List<File> mFileParts;
	private String mFilePartName;
	private Map<String, String> mParams;

	/**
	 * 单个文件
	 *  
	 * @param url
	 * @param errorListener
	 * @param listener
	 * @param filePartName
	 * @param file
	 * @param params
	 */
	public MultipartRequest(String url, Response.ErrorListener errorListener,
                            Response.Listener<String> listener, String filePartName, File file,
                            Map<String, String> params) {
		super(Method.POST, url, errorListener);

		mFileParts = new ArrayList<File>();
		if (file != null) {
			mFileParts.add(file);
		}
		mFilePartName = filePartName;
		mListener = listener;
		mParams = params;
		buildMultipartEntity();
		setRetryPolicy(
				new DefaultRetryPolicy(
						100*1000,//默认超时时间，应设置一个稍微大点儿的
						0,//默认最大尝试次数
						DefaultRetryPolicy.DEFAULT_BACKOFF_MULT
				)
		);
	}

	/**
	 * 多个文件，对应一个key
	 * 
	 * @param url
	 * @param errorListener
	 * @param listener
	 * @param filePartName
	 * @param files
	 * @param params
	 */
	public MultipartRequest(String url, Response.ErrorListener errorListener,
                            Response.Listener<String> listener, String filePartName,
                            List<File> files, Map<String, String> params) {
		super(Method.POST, url, errorListener);
		mFilePartName = filePartName;
		mListener = listener;
		mFileParts = files;
		mParams = params;
		buildMultipartEntity();
		setRetryPolicy(
				new DefaultRetryPolicy(
						100*1000,//默认超时时间，应设置一个稍微大点儿的
						0,//默认最大尝试次数
						DefaultRetryPolicy.DEFAULT_BACKOFF_MULT
				)
		);
	}
	/**
	 * 最万能的网络请求  可以上传多个 文件的数组  和多个数组 
	 * @param url
	 * @param errorListener
	 * @param listener
	 * @param fileValueList 文件参数列表
	 * @param allFileList
	 * @param map
	 */
	public MultipartRequest(String url, Response.ErrorListener errorListener,
                            Response.Listener<String> listener, List<String> fileValueList, List<List<File>> allFileList, Map<String, Object> map
			) {
		super(Method.POST, url, errorListener);
		String content="";
		for(String key:map.keySet()){
			content=content+key+"的值"+map.get(key)+"  ";
		}
		UtilLog.e("tag",content);
		mListener = listener;
		if(fileValueList!=null && fileValueList.size()>0){
			for(int i=0;i<fileValueList.size();i++){
				List<File> fileList=allFileList.get(i);
				String value=fileValueList.get(i);
				if(fileList!=null && fileList.size()>0){
					for(File file:fileList){
						if(file.exists()){
							entity.addPart(value, new FileBody(file));
						}
					}
					long l = entity.getContentLength();
				}
			}
		}
		
		try {
			if (map != null && map.size() > 0) {
				for (Map.Entry<String, Object> entry : map.entrySet()) {
					Object value=entry.getValue();
					if(value instanceof List){
						List<String> strList=(List<String>) value;
						if(strList!=null && strList.size()>0){

								entity.addPart(
										entry.getKey(),
										new StringBody(JsonUtils.toJSonStr(strList), Charset
												.forName("UTF-8")));
								UtilLog.e("tag", JsonUtils.toJSonStr(strList)+"----");
						}
					}else{
						if(value instanceof String){
							if(!StringUtil.isNullOrEmpty(value+"")){
								entity.addPart(
										entry.getKey(),
										new StringBody(value+"", Charset
												.forName("UTF-8")));
							}
						}else{
							if(!StringUtil.isNullOrEmpty(value+"")){
								entity.addPart(
										entry.getKey(),
										new StringBody(JsonUtils.toJSonStr(value), Charset
												.forName("UTF-8")));
								UtilLog.e("tag", "实体类的字符串"+JsonUtils.toJSonStr(value)+"----");
							}else{
								entity.addPart(
										entry.getKey(),
										new StringBody(JsonUtils.toJSonStr(""), Charset
												.forName("UTF-8")));
							}
						}
						
						
					
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//setRetryPolicy(new DefaultRetryPolicy(150000,DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
		setRetryPolicy(
				new DefaultRetryPolicy(
						100*1000,//默认超时时间，应设置一个稍微大点儿的
						0,//默认最大尝试次数
						DefaultRetryPolicy.DEFAULT_BACKOFF_MULT
				)
		);
	}

	private void buildMultipartEntity() {
	/*	try {
			if (mDelFileIds != null && mDelFileIds.size() > 0) {
				for (String delfileId : mDelFileIds) {
					entity.addPart(mDelFileName, new StringBody(delfileId,  Charset
									.forName("UTF-8")));
				}
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
		if (mFileParts != null && mFileParts.size() > 0) {
			for (File file : mFileParts) {
				entity.addPart(mFilePartName, new FileBody(file));
			}
			long l = entity.getContentLength();
		}
		try {
			if (mParams != null && mParams.size() > 0) {
				for (Map.Entry<String, String> entry : mParams.entrySet()) {
					String value=entry.getValue();
					if(!StringUtil.isNullOrEmpty(value)){
						entity.addPart(
								entry.getKey(),
								new StringBody(entry.getValue(), Charset
										.forName("UTF-8")));
					}

				}
			}
		} catch (UnsupportedEncodingException e) {
			VolleyLog.e("UnsupportedEncodingException");
		}
	}

	@Override
	public String getBodyContentType() {
		return "1223";
	}

	@Override
	public byte[] getBody() throws AuthFailureError {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		try {
			entity.writeTo(bos);
		} catch (IOException e) {
			VolleyLog.e("IOException writing to ByteArrayOutputStream");
		}
		byte []data=bos.toByteArray();
		/*try {
			FileOutputStream fos=new FileOutputStream(Environment.getExternalStorageDirectory().getAbsolutePath()+"/"+"data.txt");
			fos.write(data);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/
		return data;
	}

	@Override
	protected Response<String> parseNetworkResponse(NetworkResponse response) {
		if (VolleyLog.DEBUG) {
			if (response.headers != null) {
				for (Map.Entry<String, String> entry : response.headers
						.entrySet()) {
					VolleyLog.d(entry.getKey() + "=" + entry.getValue());
				}
			}
		}

		String parsed;
		try {
			parsed = new String(response.data,
					HttpHeaderParser.parseCharset(response.headers));
		} catch (UnsupportedEncodingException e) {
			parsed = new String(response.data);
		}
		return Response.success(parsed,
				HttpHeaderParser.parseCacheHeaders(response));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.android.volley.Request#getHeaders()
	 */
	@Override
	public Map<String, String> getHeaders() throws AuthFailureError {
		VolleyLog.d("getHeaders");
		Map<String, String> headers = super.getHeaders();

		if (headers == null || headers.equals(Collections.emptyMap())) {
			headers = new HashMap<String, String>();
		}
		return headers;
	}

	@Override
	protected void deliverResponse(String response) {
		mListener.onResponse(response);
	}
}