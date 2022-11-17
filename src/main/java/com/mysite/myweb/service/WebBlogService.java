package com.mysite.myweb.service;

import com.mysite.myweb.mapper.WebBlogMapper;
import com.mysite.myweb.vo.WebBlogRow;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class WebBlogService {

    private WebBlogMapper webBlogMapper;

    public WebBlogService(WebBlogMapper _webBlogMapper) {
        this.webBlogMapper = _webBlogMapper;
    }

    public List<WebBlogRow> getAllList() {
        ///~~~~~~~~~~~~~~
        /// 1 biz
        /// 2~~~ 3
        return this.webBlogMapper.getAllBlogs();
    }
}
