package com.mysite.myweb.vo;

import java.util.Date;

public class WebBlogRow {
    Integer id;
    String title;
    String content;
    String username;
    Date createdAt;

    public WebBlogRow(Integer id, String title, String content, String username, Date createdAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
        this.createdAt = createdAt;
    }

    public WebBlogRow(Integer id, String title, String content, String username) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        //convert
        return title;
    }

    public void setTitle(String title) {
        //validation
        this.title = title;

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}

