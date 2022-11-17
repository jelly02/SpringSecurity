package com.mysite.myweb.controller.dto;

import com.mysite.myweb.vo.WebBlogRow;
import lombok.Setter;

@Setter
public class WebBlogRequestDto {
    Integer id;
    String title;
    String content;
    String username;

    public WebBlogRow createBlogObject() {
        return new WebBlogRow(this.id, this.title, this.content, this.username);
    }
}
