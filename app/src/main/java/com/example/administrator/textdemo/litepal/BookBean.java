package com.example.administrator.textdemo.litepal;

import org.litepal.crud.LitePalSupport;

/**
 * Created by wxm on 2018/6/11.
 */

public class BookBean extends LitePalSupport {
    private String name;
    private int id;
    private String address;
    private String price;
    private String author;
    private String contet;

    public BookBean(String name, int id, String price, String content, String author, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.price = price;
        this.author = author;
        this.contet = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCotent() {
        return cotent;
    }

    public void setCotent(String cotent) {
        this.cotent = cotent;
    }

    private String cotent;
}
