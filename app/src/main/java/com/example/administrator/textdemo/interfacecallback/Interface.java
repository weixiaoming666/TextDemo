package com.example.administrator.textdemo.interfacecallback;

import java.io.Serializable;

/**
 * Created by wxm on 2018/7/31.
 */
public abstract class Interface implements Serializable {
    abstract void dataChanged(String s);
}
