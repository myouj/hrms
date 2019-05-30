package com.lqt.hr.model;

import java.util.Date;

public class Rules {
    private Integer id;

    private String title;

    private String item;

    private String type;

    private String publisher;

    private Date time;

    public Rules() {
    }

    public Rules(Integer id, String title, String item, String type, String publisher, Date time) {
        this.id = id;
        this.title = title;
        this.item = item;
        this.type = type;
        this.publisher = publisher;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item == null ? null : item.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}