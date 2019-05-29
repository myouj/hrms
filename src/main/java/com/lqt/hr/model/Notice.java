package com.lqt.hr.model;

import java.util.Date;

public class Notice {
    private Integer id;

    private String title;

    private String content;

    private String publisher;

    private Date time;

    public Notice() {
    }

    public Notice(Integer id, String title, String content, String publisher, Date time) {
        this.id = id;
        this.title = title;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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