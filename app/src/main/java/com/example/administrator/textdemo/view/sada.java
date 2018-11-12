package com.example.administrator.textdemo.view;

/**
 * Created by wxm on 2018/11/2.
 */
public class sada {

    /**
     * status : 1
     * msg : 获取成功
     * data : {"FUniqueBillNo":"0111","FItem":12433,"FNumber":"01.16.536010.01","FName":"无纺布复合膜","FModel":"22g*940mm分切230mm H3E-021","FQty":100}
     */

    public int status;
    public String msg;
    public DataBean data;

    public static class DataBean {
        /**
         * FUniqueBillNo : 0111
         * FItem : 12433
         * FNumber : 01.16.536010.01
         * FName : 无纺布复合膜
         * FModel : 22g*940mm分切230mm H3E-021
         * FQty : 100
         */

        public String FUniqueBillNo;
        public int FItem;
        public String FNumber;
        public String FName;
        public String FModel;
        public int FQty;
    }
}
