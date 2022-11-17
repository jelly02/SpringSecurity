package com.mysite.myweb.controller;


import com.mysite.myweb.service.WebBlogService;
import com.mysite.myweb.vo.WebBlogRow;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WebBlogPageController {
    private WebBlogService webBlogService;


    public WebBlogPageController(WebBlogService _webBlogService) {
        this.webBlogService = _webBlogService;
    }

    @GetMapping("/list")
    public String getBlogAllList(Model _model) {
        List<WebBlogRow> blogAllList = this.webBlogService.getAllList();
        _model.addAttribute("rows", blogAllList);
        return "blogmain";
    }
}
