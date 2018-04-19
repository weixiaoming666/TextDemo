package com.example.administrator.textdemo.view.myview;

/**
 * Created by Administrator on 2018/4/17.
 */

interface OnCurrentItemChanged {
    void  tellMeUlOVEme(String s);//接口回调   把a类中的接口实例传递给b中的接口引用，b中调用接口方法，实现ab通信
//    那么为什么不止直接把A的实例传给b,b直接调用a的方法呢 只有那个也是行的通的 ？
//    那么为什么还要写一个接口去做这个事情呢，答案是 为了解偶    java 是面向对象编程的，也就是说是面向抽象（有部分人认为就是面向接口的）
// 编程的。如果回调写在class内，那么俩类耦合。  但是如果是接口的话，那么你只需要关注接口就ok，接口只是作为桥梁沟通二者；
//    在计算机中，接口是计算机系统中两个独立的部件进行信息交换的共享边界
//    百度百科对接口的定义： https://baike.baidu.com/item/%E6%8E%A5%E5%8F%A3/2886384?fr=aladdin
}
