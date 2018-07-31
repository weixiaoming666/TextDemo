package com.example.administrator.textdemo.litepal.table;

import org.litepal.crud.LitePalSupport;

/**
 * Created by wxm on 2018/6/14.
 */
public class HistoryBookTable extends LitePalSupport {
    private int book_id;
    private String name;
    private String author;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
