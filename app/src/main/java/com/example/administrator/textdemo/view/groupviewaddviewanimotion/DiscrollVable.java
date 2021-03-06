package com.example.administrator.textdemo.view.groupviewaddviewanimotion;

/**
 * Created by Administrator on 2016/11/17.
 */

public interface DiscrollVable {
    /**
     * Called to discrollve the View.
     * @param ratio discrollve ratio between 0.0 and 1.0.
     *              1.0 means the View is totally discrollved
     */
     void onDiscrollve(float ratio);//显示

    /**
     * Called to reset the discrollvation of the View.
     * In this method, you have to reset the View in order
     * to be discrollved again.
     */
     void onResetDiscrollve();//重置
}
