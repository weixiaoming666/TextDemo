package com.example.administrator.textdemo.litepal.table;

import org.litepal.crud.LitePalSupport;

/**
 * Created by wxm on 2018/6/11.
 */

public class BookBean extends LitePalSupport {
    private String name;
    private int id;//这个id 和 传入的 id 冲突   会被覆盖
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
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getContet() {
        return contet;
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



    @Override
    public String toString() {
        return "BookBean{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                ", price='" + price + '\'' +
                ", author='" + author + '\'' +
                ", contet='" + contet + '\'' +
                '}';
    }
}
