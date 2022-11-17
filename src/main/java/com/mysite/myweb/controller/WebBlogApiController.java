package com.mysite.myweb.controller;

import com.mysite.myweb.controller.dto.WebBlogResponseDto;
import com.mysite.myweb.vo.WebBlogRow;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class WebBlogApiController {

    //localhost:8080/api/getNextList?page=1
    @GetMapping("/api/getNextList")
    public List<WebBlogResponseDto> getNextListFn(@RequestParam Integer page) {
        System.out.println("IN GETNEXTLIST");
        List<WebBlogResponseDto> returnDatas = new ArrayList<>();

        returnDatas.add(new WebBlogResponseDto(
                            new WebBlogRow(999, "SAMPLE TITLE1",
                                 "SAMPLE CONTENT", "USER")
        ));

        returnDatas.add(new WebBlogResponseDto(new WebBlogRow(1000, "SAMPLE TITLE2",
                "SAMPLE CONTENT2", "USER2")
        ));

        return returnDatas;
    }
}
