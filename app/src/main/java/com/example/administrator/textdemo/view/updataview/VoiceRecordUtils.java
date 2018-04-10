package com.example.administrator.textdemo.view.updataview;

import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import android.os.Environment;
import android.util.Log;

import com.pocketdigi.utils.FLameUtils;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * AudioRecorder的工具类，从AudioRocoder录制raw文件，然后转成mp3<br/>
 * 依赖libs目录下的armeabi目录和flame.jar<br/>
 *
 * 权限要求<br/>
 *
 * <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
 * <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
 * <uses-permission android:name="android.permission.RECORD_AUDIO" />
 *
 * @author WangXu
 *
 */
public class VoiceRecordUtils {
	/**
	 * 构造时候需要的Activity，主要用于获取文件夹的路径
	 */

	/**
	 * 文件代号
	 */
	public static final int RAW = 0X00000001;
	public static final int MP3 = 0X00000002;

	/**
	 * 文件路径
	 */
	private String rawPath = null;
	private String mp3Path = null;

	/**
	 * 采样频率
	 */
	private static final int SAMPLE_RATE = 8000;

	/**
	 * 录音需要的一些变量
	 */
	private short[] mBuffer;
	private AudioRecord mRecorder;

	/**
	 * 构造方法
	 *
	 */
	public VoiceRecordUtils() {
	}

	/**
	 * 录音状态
	 */
	private boolean isRecording = false;
	/**
	 * 是否转换ok
	 */
	private boolean convertOk = false;


	private String fileName;
	/**
	 * 初始化录音对象
	 */
	public void initvoiceRecord(String fileName){
		this.fileName=fileName;

	}

	/**
	 * 开始录音
	 */
	public boolean startRecord() {
		// 如果正在录音，则返回
		if (isRecording) {
			return isRecording;
		}
		// 初始化
		if (mRecorder == null) {
			initRecorder();
		}

		getFilePath();
		mRecorder.startRecording();
		startBufferedWrite(new File(rawPath));

		isRecording = true;
		return isRecording;
	}
	public void continueRecord(){
		mRecorder.startRecording();
		startBufferedWrite(new File(rawPath));
		isRecording = true;
	}
	public void pauseRecord(){
		if (!isRecording) {
			return ;
		}
		// 停止

		mRecorder.stop();
		isRecording = false;
	}
	public void endRecord(){
		if (!isRecording) {
			return ;
		}
		// 停止
		if(mRecorder!=null){
			mRecorder.stop();
		}
		isRecording = false;
	}
	/**
	 * 停止录音，并且转换文件,<br/>
	 * <b>这很可能是个耗时操作，建议在后台中做
	 *
	 * @return
	 */
	public boolean stopRecordingAndConvertFile() {
		if(isRecording){
			// 停止
			mRecorder.stop();
			isRecording = false;
		}


		// 开始转换
		FLameUtils lameUtils = new FLameUtils(1, SAMPLE_RATE, 96);
		convertOk = lameUtils.raw2mp3(rawPath, mp3Path);

		return isRecording ^ convertOk;// convertOk==true,return true
	}

	public String getSaveAbsolutePath(){
		return mp3Path;
	}

	/**
	 * 获取文件的路径
	 *
	 * @param fileAlias
	 *            RAW or MP3
	 * @return
	 */
	public String getFilePath(int fileAlias) {
		if (fileAlias == RAW) {
			return rawPath;
		} else if (fileAlias == MP3) {
			return mp3Path;
		} else
			return null;
	}

	// /**
	// * 开启下一次录音前，reset一下
	// *
	// * @param cleanFlag
	// */
	// public void reset(int cleanFlag) {
	// cleanFile(cleanFlag);
	// }

	/**
	 * 清理文件
	 *
	 * @param cleanFlag
	 *            RAW,MP3 or RAW|MP3
	 */
	public void cleanFile(int cleanFlag) {
		File f = null;
		try {
			switch (cleanFlag) {
				case MP3:
					f = new File(mp3Path);
					if (f.exists())
						f.delete();
					break;
				case RAW:
					f = new File(rawPath);
					if (f.exists())
						f.delete();
					break;
				case RAW | MP3:
					f = new File(rawPath);
					if (f.exists())
						f.delete();
					f = new File(mp3Path);
					if (f.exists())
						f.delete();
					break;
			}
			f = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 关闭,可以先调用cleanFile来清理文件
	 */
	public void close() {
		if (mRecorder != null)
			mRecorder.release();
	}

	// -------内部的一些工具方法-------
	/**
	 * 初始化
	 */
	private void initRecorder() {
		int bufferSize = AudioRecord.getMinBufferSize(SAMPLE_RATE,
				AudioFormat.CHANNEL_IN_MONO, AudioFormat.ENCODING_PCM_16BIT);
		mBuffer = new short[bufferSize];
		mRecorder = new AudioRecord(MediaRecorder.AudioSource.MIC, SAMPLE_RATE,
				AudioFormat.CHANNEL_IN_MONO, AudioFormat.ENCODING_PCM_16BIT,
				bufferSize);
	}

	/**
	 * 设置路径，第一个为raw文件，第二个为mp3文件
	 *
	 * @return
	 */
	private void getFilePath() {
		try {
			//这样做的长处
			 fileName = fileName.replace(".mp3","");
			if (rawPath == null) {
				File raw = new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"/dhyt/voice/"+fileName+".raw");


				//删除之前的记录，并重新创建
				if(raw.exists()){
					raw.delete();
					try {
						raw.createNewFile();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					try {
						raw.getParentFile().mkdirs();
						raw.createNewFile();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				rawPath = raw.getAbsolutePath();
			}
			if (mp3Path == null) {

				File mp3 = new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"/dhyt/voice/"+fileName+".mp3");
				//删除之前的记录，并重新创建
				if(mp3.exists()){
					mp3.delete();
					try {
						mp3.createNewFile();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					try {
						mp3.getParentFile().mkdirs();
						mp3.createNewFile();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				mp3Path = mp3.getAbsolutePath();
				mp3 = null;
			}

			Log.d("rawPath", rawPath);
			Log.d("mp3Path", mp3Path);

			runCommand("chmod 777 " + rawPath);
			runCommand("chmod 777 " + mp3Path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 执行cmd命令，并等待结果
	 *
	 * @param command
	 *            命令
	 * @return 是否成功执行
	 */
	private boolean runCommand(String command) {
		boolean ret = false;
		Process process = null;
		try {
			process = Runtime.getRuntime().exec(command);
			process.waitFor();
			ret = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				process.destroy();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return ret;
	}

	/**
	 * 写入到raw文件
	 *
	 * @param file
	 */
	private void startBufferedWrite(final File file) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				RandomAccessFile randomFile=null;
				try {
					randomFile = new RandomAccessFile(rawPath, "rw");
					// 文件长度，字节数
					long fileLength = randomFile.length();
					//将写文件指针移到文件尾。
					randomFile.seek(fileLength);
					Log.e("tag", "当前的长度"+fileLength);
					while (isRecording) {
						int readSize = mRecorder.read(mBuffer, 0,
								mBuffer.length);


						for (int i = 0; i < readSize; i++) {
							randomFile.writeShort(mBuffer[i]);
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if(randomFile!=null ){
						try {
							randomFile.close();
						} catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}

				}
			}
		}).start();
	}


}