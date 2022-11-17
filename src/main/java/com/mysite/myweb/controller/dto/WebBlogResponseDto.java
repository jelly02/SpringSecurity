package com.mysite.myweb.controller.dto;

import com.mysite.myweb.vo.WebBlogRow;
import lombok.Getter;

@Getter
public class WebBlogResponseDto {
    Integer id;
    String title;
    String content;
    String username;

    public WebBlogResponseDto(WebBlogRow _row) {
        this.id = _row.getId();
        this.title = _row.getTitle();
        this.content = _row.getContent();
        this.username = _row.getUsername();
    }
}
