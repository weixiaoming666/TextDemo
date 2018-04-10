package com.example.administrator.textdemo.view.updataview;

import android.os.Environment;


/**
 * 常量类
 * @author wyc
 *
 */
public class UtilVar {
	public static int screenHeight=0;//屏幕高度
	public static int screenWidth=0;//屏幕宽度
	/**
	 * 使用通用加载的title 不使用通用加载的
	 */
	public static final int BASE_TITLE=1;
	/**
	 * 使用通用加载的的界面 不使用title
	 */
	public static final int BASE_LOAD=2;
	/**
	 * 使用通用加载的title  与加载的界面
	 */
	public static final int BASE_TITLE_AND_LOAD=3;
	
	//-1其他用默认格式打开0图片 1视频 2音频 3word 4pdf 5xls
	public static final int OPEN_OHER_LIST=-1;
	public static final int OPEN_IMG_LIST=0;
	public static final int OPEN_SHIPIN_LIST=1;
	public static final int OPEN_YINPIN_LIST=2;
	public static final int OPEN_WORD_LIST=3;
	public static final int OPEN_PDF_LIST=4;
	public static final int OPEN_XLS_LIST=5;
	public static final int OPEN_HTML_LIST=6;
	public static final int OPEN_CAD_LIST=7;
	//实时测量任务的标签  0全部1我的分配 2我的执行
	public static final int MEASURE_TASK_ALL_TAB=0;
	public static final int MEASURE_MY_ASSIGN_TAB=1;
	public static final int MEASURE_MY_EXCUTE_TAB=2;
	
	//任务执行的状态  0执行中 1代确认 2已驳回3已完成
	public static final int MEASURE_TASK_EXCUTE_RUN=0;
	public static final int MEASURE_TASK_UNCONFIRM=1;
	public static final int MEASURE_TASK_ALLREADY_REJECT=2;
	public static final int MEASURE_TASK_ALLREADY_CONFIRM=3;
	public static final String CACHE_PATH=Environment.getExternalStorageDirectory().getAbsolutePath()+"/dhyt";
	public static final String TEMPLATE_SIGNATURE=CACHE_PATH+"/signature";
	public static final String TEMPLATE_PARENT_PATH=Environment.getExternalStorageDirectory().getAbsolutePath()+"/dhyt/template";
	public static final String FILE_PARENT_PATH=Environment.getExternalStorageDirectory().getAbsolutePath()+"/dhyt/file";
/**
 * 签名的类型
 */
	public static final int SIGNATURE_PIC=0;//签名的图片
	public static final int SIGNATURE_DATE=1;//签名的时间
	public static final int SIGNATURE_SUGGESTION=2;//签名的意见
	
	public static final String PDF_PATH=Environment.getExternalStorageDirectory().getAbsolutePath()+"/dhyt/pdf";
	/**
	 * 分户验收 分配的类型
	 */
	public static final int FHYS_TASK_ALL=0;//全部的
	public static final int FHYS_TASK_EXCUTING=1;//执行中
	public static final int FHYS_TASK_UNCONFIRM=2;//待确认
	public static final int FHYS_TASK_REJECTED=3;//已驳回
	public static final int FHYS_TASK_FINISHED=4;//已完成
	/**
	 * 分户验收任务tab的类型
	 */
	public static final int FHYS_TASK_TAB_MYASSIGN=0;//我的分配
	public static final int FHYS_TASK_TAB_EXCUTE=1;//任务执行
	/**
	 * 分户验收人员的种类
	 */
	public static final int FHYS_PERSON_TYPE_ZHUZHE=0;//主责人
	public static final int FHYS_PERSON_TYPE_XIEZHU=1;//协助人
	public static final int FHYS_PERSON_TYPE_JIANLI=2;//监理方
	public static final int FHYS_PERSON_TYPE_SHIGONG=3;//施工方
	public static final int FHYS_PERSON_TYPE_JIANSHE=4;//建设方
	public static final int FHYS_PERSON_TYPE_ZIDINGYI=5;//自定义
	/**
	 * 图片来源的类型
	 */
	public static final int PIC_FROM_NET=0;//图片来自网络
	public static final int PIC_FROM_LOCAL=1;//图片来自本地添加
	public static final int PIC_FROM_XIEZHUREN_COPY=2;//图片来自协助人拷贝
	/**
	 * 模板来自哪里
	 */
	public static final int MOBAN_FROM_NET=0;//模板来自网络
	public static final int MOBAN_FROM_XIEZHUREN_COPY=1;//模板来自协助人copy

	/**
	 * 公司类型
	 */
	public static final int UNIT_TYPE_KFS_JTGS=1;//开方商集团公司
	public static final int UNIT_TYPE_KFS_CSGS=7;//开方商城市公司
	public static final int UNIT_TYPE_KFS_XMGS=8;//开放商项目公司
	public static final int UNIT_TYPE_SGZB=2;//施工总包
	public static final int UNIT_TYPE_SGFB=3;//施工分包
	public static final int UNIT_TYPE_JLGS=4;//监理公司
	public static final int UNIT_TYPE_ZJZ=5;//质监站
	public static final int UNIT_TYPE_SJY=6;//设计院
	public static final int UNIT_TYPE_WY=15;//物业单位
	/**
	 * 通用的tab类型
	 */
	public static final int BASE_TAB_TYPE0=0;
	public static final int BASE_TAB_TYPE1=1;
	public static final int BASE_TAB_TYPE2=2;
	public static final int BASE_TAB_TYPE3=3;
	/**
	 * 通用的类型
	 */
	public static final int BASE_TYPE0=0;
	public static final int BASE_TYPE1=1;
	public static final int BASE_TYPE2=2;
	public static final int BASE_TYPE3=3;
	public static final int BASE_TYPE4=4;

	/**
	 * 标注类型
	 * 0:地标 1:圆形 2:三角形 3:正方形 4:星星 5:对勾 6:差号 7:摄像头 8:传感器 9:配电箱 10:指示牌）
	 */
	public static final int PDF_SANJIAO=2;
	public static final int PDF_YUAN=1;
	public static final int PDF_LOCATION=0;
	public static final int PDF_ZHENGFANGXING=3;
	public static final int PDF_XINGXING=4;
	public static final int PDF_DUIGOU=5;
	public static final int PDF_CHA=6;
	public static final int PDF_CAMERA=7;
	public static final int PDF_SENSOR=8;
	public static final int PDF_POWER_BOX=9;
	public static final int PDF_INDICATOR=10;
	public static final int PDF_PHOTO=13;
	public static final int PDF_QIANMING = 11;
	public static final int PDF_PROJECT = 108;
	public static final int PDF_ROOM = 109;

	//本地使用和服务器无关
	public static final int PDF_SHOWXIE = 100;
	public static final int PDF_YIYOUQIANMING = 101;


	public static String PDF_LOAD_FINISHI="com.broadcast.pdf_load_finish";//pdf加载完成
	public static String ACTION_PDF_DELETE_SIGN="com.broadcast.pdf_delete_sign";//pdf删除标记

	//文件类型 1设计文件 2管理用图 3施工图 4其他
	public static final String FILE_DESIGN = "1";
	public static final String FILE_MANAGE = "2";
	public static final String FILE_CONSTRUCTION = "3";
	public static final String FILE_OTHER = "0";



	//文件的类型
	public static final int FILE_TYPE_OTHER=-1;
	public static final int FILE_TYPE_IMG=0;
	public static final int  FILE_TYPE_SHIPIN=1;
	public static final int  FILE_TYPE_YINPIN=2;
	public static final int  FILE_TYPE_WORD=3;
	public static final int  FILE_TYPE_PDF=4;
	public static final int  FILE_TYPE_XLS=5;
	public static final int  FILE_TYPE_HTML=6;
	public static final int  FILE_TYPE_CAD=7;

	//设计图纸 标注所在的模块
	public static final String  MODULE_DEFAULT = "0";//默认
	public static final String  MODULE_SITE = "1";//工作沟通
	public static final String  MODULE_NOTICE = "2";//通知
	public static final String  MODULE_TASK = "3";//监理任务

	public static final int SHARED_SUCCESS = 1;//施工报验分享成功
	public static final String RED_FPRW = "1"; //分配任务
	public static final String RED_WCRW = "2";//完成任务
	public static final String RED_WCBYRW = "3";//完成报验任务
	public static final String RED_FSTZ = "4";//发送通知
	public static final String RED_QRRW = "5";//确认任务
	public static final String RED_FSJLTZ = "6";//发送监理通知
	public static final String RED_CJTZGL = "7";//创建通知管理
	public static final String RED_FSTZGL = "8";//发送通知管理
	public static final String RED_HFTZGL = "9";//回复通知管理
	public static final String RED_HFJLTZ = "10";//回复监理通知


	/**
	 * 用于只传递一个实体类对象的情况
	 */
	public static final String RESULT="result";//用于返回的
	public static final String TRANSMIT="transmit";  //用于传递的
	/**
	 * 通用的选中楼的页面跳转类型
	 */
	public static final int BASE_SELECT_FLLOR_PAGE_DEFAULT=0;//通用的选择楼的默认类型
	public static final int BASE_SELECT_FLLOR_PAGE_TO_GCZT=1;//通用的选择楼的跳转到工程状态

	//金泰查看文件目录
//	1  质量策划 2 质量教育培训 3 安全教育培训 4 质量保证体系 5 质量相关方 6 安全相关方 7 安全组织机构管理 8 安全规章制度 9 应急响应管理
	//10 安全环保信息 11 安全迎汛管理 12 安全消防管理-获取文件列表 13 其他安全管理 14 质量控制 15 质量验收
	public static final int JT_ZLCH = 1;
	public static final int JT_ZLJYPX = 2;
	public static final int JT_AQJYPX = 3;
	public static final int JT_ZLBZTX = 4;
	public static final int JT_ZLXGF = 5;
	public static final int JT_AQXGF = 6;
	public static final int JT_AQZZJGGL = 7;
	public static final int JT_AQGZZD = 8;
	public static final int JT_YJXYGL = 9;
	public static final int JT_AQHBXX = 10;
	public static final int JT_AQYXGL = 11;
	public static final int JT_AQXFGL = 12;
	public static final int JT_QTAQGL = 13;
	public static final int JT_ZLKZ = 14;
	public static final int JT_ZLYS = 15;


	/**
	 * 实测实量的图纸标注的类型
	 */
	public static final int  PAGE_PDF_JM=1;//整体的建模
	public static final int  PAGE_PDF_GXYS_JM_LOOK_FLOOR=2;//图纸标注 工序验收建模 查看楼的
	public static final int  PAGE_PDF_GXYS_YS_LOOK_FLOOR=3;//图纸标注 工序验收验收 查看楼的
	public static final int  PAGE_PDF_GXYS_YS_LOOK_ROOM=4;//图纸标注 工序验收验收 查看户的
	public static final int  PAGE_PDF_GXYS_JM_DRAW_ROOM=5;//图纸标注 工序验收建模 标注房间的
	public static final int  PAGE_PDF_GXYS_JD_LOOK_FLOOR=6;//图纸标注 工序验收进度查看楼



	//权限(-1没有隧道单体 0无权限 1仅可查看 3组员[工班长] 4组长[领工员] 2施工一级[副队长])

	public static final int USER_ROLE_NO_SUIDAO=-1;
	public static final int USER_ROLE_NO_ACCESS=0;
	public static final int USER_ROLE_ONLY_LOOK=1;
	public static final int USER_ROLE_JIAZIDUIDUIZHAGN=2;
	public static final int USER_ROLE_GONGBANZHAGN=3;
	public static final int USER_ROLE_LINGGONGYUAN=4;

	//聊天任务类型
	public static final int CHAT_ZHILIANGYANSHOU = 106;
	public static final int CHAT_ZHILIANGKONGZHI = 107;

//	会议进行状态
	public static final String MEETING_STATE_END = "1";
//	会议详情根据人员权限操作文件的状态 和文件的显示状态
	public static final int MEETING_END = 1;//会议结束
	public static final int MEETING_NO_END_UP_NO= 2;//会议未结束 不能上传文件
	public static final int MEETING_NO_END_UP_YES= 3;//会议未结束 不能上传文件

}

