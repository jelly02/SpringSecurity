package com.mysite.myweb.mapper;

import com.mysite.myweb.vo.WebBlogRow;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WebBlogMapper {
    List<WebBlogRow> getAllBlogs();
}
