package com.example.administrator.textdemo.utils;

import android.util.Log;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by wxm on 2018/8/29.
 */
public class TimeUtils {
        public static String ZI_YMD = "yyyy年MM月dd日";
        public static String ZI_YMD_HM = "yyyy年MM月dd日 HH:mm";
        public static String ZI_YMD_HMS = "yyyy年MM月dd日 HH:mm:ss";

        public static String SLASH_YMD = "yyyy/MM/dd";
        public static String SLASH_YMD_HM = "yyyy/MM/dd HH:mm";
        public static String SLASH_YMD_HMS = "yyyy/MM/dd HH:mm:ss";

        public static String BAR_YMD = "yyyy-MM-dd";
        public static String BAR_YMD_HM = "yyyy-MM-dd HH:mm";
        public static String BAR_YMD_HMS = "yyyy-MM-dd HH:mm:ss";

        static SimpleDateFormat formatter = new SimpleDateFormat(
                "yyyy年MM月dd日 HH:mm:ss");

        public static String parseTime(String time) {
            String newTime = null;
            long time1 = Long.valueOf(time);
            newTime = formatter.format(new Date(time1 * 1000L));
            return newTime;
        }
        //2016-5月-10日 12:2
        public static String parseTimeYMDHM(String time) {
            String newTime = "";
            try {
                SimpleDateFormat formatter = new SimpleDateFormat(
                        "yyyy-MM-dd HH:mm");
                long time1 = Long.valueOf(time);
                newTime = formatter.format(new Date(time1 * 1000L));
            }catch (Exception e){
                return "";
            }
            return newTime;
        }
        public static String parseTimeYmd(String time) {
            String newTime = "";
            try{
                SimpleDateFormat formatter = new SimpleDateFormat(
                        "yyyy-MM-dd");
                long time1 = Long.valueOf(time);
                newTime = formatter.format(new Date(time1 * 1000L));
            }catch (Exception e){
                return "";
            }
            return newTime;
        }
        public static String parseTimeYm(String time) {
            String newTime = "";
            try{
                SimpleDateFormat formatter = new SimpleDateFormat(
                        "yyyy-MM");
                long time1 = Long.valueOf(time);
                newTime = formatter.format(new Date(time1 * 1000L));
            }catch (Exception e){
                return "";
            }
            return newTime;
        }
        public static String createTime(String time) {
            String newTime = null;
            Date d;
            try {
                d = formatter.parse(time);
                newTime=d.getTime()/1000+"";
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return newTime;
        }
        public static String createTime(String time,String type) {
            SimpleDateFormat formatter = new SimpleDateFormat(type);
            String newTime = null;
            Date d;
            try {
                d = formatter.parse(time);
                newTime=d.getTime()/1000+"";
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return newTime;
        }
        /**
         * 斜杠的时间
         * @param time
         * @return
         */
        public static String parseTimeSlash(String time) {
            SimpleDateFormat formatter2 = new SimpleDateFormat(
                    "yyyy/MM/dd日 HH/mm/ss");
            String newTime = null;
            long time1 = Long.valueOf(time);
            newTime = formatter2.format(new Date(time1 * 1000L));
            return newTime;
        }
        /**
         * 普通的年月
         * @return
         */
        public static String getCurTime(){
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            Date curDate = new Date(System.currentTimeMillis());//获取当前时间
            String time = formatter.format(curDate);
            return time;
        }
        /**
         * 横杠的时间
         * @param time
         * @return
         */
        public static String parseTimeBar(String time) {
            SimpleDateFormat formatter2 = new SimpleDateFormat(
                    "yyyy-MM-dd HH:mm:ss");
            String newTime = null;
            long time1 = Long.valueOf(time);
            newTime = formatter2.format(new Date(time1 * 1000L));
            return newTime;
        }
        /**
         * HH:mm
         * @param time
         * @return
         */
        public static String parseTimeS(String time) {
            SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm");
            String newTime = null;
            long time1 = Long.valueOf(time);
            newTime = formatter2.format(new Date(time1 * 1000L));
            return newTime;
        }
        /**
         * MM月dd日 HH:mm
         * @param time
         * @return
         */
        public static String parseTimeMD_HM(String time) {
            SimpleDateFormat formatter2 = new SimpleDateFormat("MM月dd日 HH:mm");
            String newTime = null;
            long time1 = Long.valueOf(time);
            newTime = formatter2.format(new Date(time1 * 1000L));
            return newTime;
        }

        /**
         * 日期格式字符串转换成时间戳
         * @param date_str 字符串日期
         * @param format 如：yyyy-MM-dd HH:mm:ss
         * @return
         */
        public static Long date2TimeStamp(String date_str,String format){
            try {
                SimpleDateFormat sdf = new SimpleDateFormat(format);
                return Long.valueOf(sdf.parse(date_str).getTime()/1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return 0L;
        }
        public static String parseTime(String time,String format){
            SimpleDateFormat formatter2 = new SimpleDateFormat(format);
            String newTime = null;
            long time1 = Long.valueOf(time);
            newTime = formatter2.format(new Date(time1 * 1000L));
            return newTime;
        }

        /**
         * 对日期进行增加操作
         *
         * @param target
         *            需要进行运算的日期
         * @param hour
         *            小时
         * @return
         */
        public static Date addDateTime(Date target, double hour) {
            if (null == target || hour < 0) {
                return target;
            }

            return new Date(target.getTime() + (long) (hour * 60 * 60 * 1000));
        }

        /**
         * 将日期以yyyy-MM-dd HH:mm:ss格式化
         *
         * @param dateL
         *            日期
         * @return
         */
        public static String formatDateTime(long dateL) {
            SimpleDateFormat sdf = new SimpleDateFormat(ZI_YMD_HMS);
            Date date = new Date(dateL);
            return sdf.format(date);
        }
        /**
         * 将日期以yyyy-MM-dd HH:mm:ss格式化
         *
         *            日期
         * @return
         */
        public static String formatDateTime(Date date, String formater) {
            SimpleDateFormat sdf = new SimpleDateFormat(formater);
            return sdf.format(date);
        }
        //2016-5月-10日 12:2
        public static String parseTimeYMDHMS(String time) {
            SimpleDateFormat formatter = new SimpleDateFormat(
                    "yyyy-MM-dd HH:mm:ss");
            String newTime = null;
            long time1 = Long.valueOf(time);
            newTime = formatter.format(new Date(time1 * 1000L));
            return newTime;
        }
        /**
         * 验证日期是否比当前日期早
         *
         * @param target1
         *            比较时间1
         * @param target2
         *            比较时间2
         * @return true 则代表target1比target2晚或等于target2，否则比target2早
         */
        public static boolean compareDate(Date target1, Date target2) {
            boolean flag = false;
            try {
                String target1DateTime = formatDateTime(target1,
                        ZI_YMD_HMS);
                String target2DateTime = formatDateTime(target2,
                        ZI_YMD_HMS);
                if (target1DateTime.compareTo(target2DateTime) <= 0) {
                    flag = true;
                }
            } catch (Exception e1) {
                System.out.println("比较失败，原因：" + e1.getMessage());
            }
            return flag;
        }
        /**
         * 将日期字符串转成日期
         *
         * @param strDate
         *            字符串日期
         * @return java.util.date日期类型
         */
        public static Date parseDate(String strDate) {
            DateFormat dateFormat = new SimpleDateFormat(ZI_YMD_HMS);
            Date returnDate = null;
            try {
                returnDate = dateFormat.parse(strDate);
            } catch (ParseException e) {
                Log.v("tag", "parseDate failed !");

            }
            return returnDate;

        }
        /**
         * 普通的年月
         * @return
         */
        public static String getCurTime(String type){
            SimpleDateFormat formatter = new SimpleDateFormat(type);
            Date curDate = new Date(System.currentTimeMillis());//获取当前时间
            String time = formatter.format(curDate);
            return time;
        }


        // 获取某年的第几周的开始日期
        public static Date getFirstDayOfWeek(int year, int week) {
            Calendar c = new GregorianCalendar();
            c.set(Calendar.YEAR, year);
            c.set(Calendar.MONTH, Calendar.JANUARY);
            c.set(Calendar.DATE, 1);

            Calendar cal = (GregorianCalendar) c.clone();
            cal.add(Calendar.DATE, week * 7);

            return getFirstDayOfWeek(cal.getTime());
        }

        // 获取某年的第几周的结束日期
        public static Date getLastDayOfWeek(int year, int week) {
            Calendar c = new GregorianCalendar();
            c.set(Calendar.YEAR, year);
            c.set(Calendar.MONTH, Calendar.JANUARY);
            c.set(Calendar.DATE, 1);
            Calendar cal = (GregorianCalendar) c.clone();
            cal.add(Calendar.DATE, week * 7);
            return getLastDayOfWeek(cal.getTime());
        }

        // 获取当前时间所在周的开始日期
        public static Date getFirstDayOfWeek(Date date) {
            Calendar c = new GregorianCalendar();
            c.setFirstDayOfWeek(Calendar.MONDAY);
            c.setTime(date);
            c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek()); // Monday
            return c.getTime();
        }

        // 获取当前时间所在周的结束日期
        public static Date getLastDayOfWeek(Date date) {
            Calendar c = new GregorianCalendar();
            c.setFirstDayOfWeek(Calendar.MONDAY);
            c.setTime(date);
            c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek() + 6); // Sunday
            return c.getTime();
        }

        public static String getWeekFirstDay(String year,String week){
            int curyear = Integer.parseInt(year);
            int curweek = Integer.parseInt(week);
            SimpleDateFormat formatter = new SimpleDateFormat(BAR_YMD);
            String dateString = formatter.format(getFirstDayOfWeek(curyear,curweek));
            return dateString;
        }
        public static String getWeekLastDay(String year,String week){
            int curyear = Integer.parseInt(year);
            int curweek = Integer.parseInt(week);
            SimpleDateFormat formatter = new SimpleDateFormat(BAR_YMD);
            String dateString = formatter.format(getLastDayOfWeek(curyear,curweek));
            return dateString;
        }

}
