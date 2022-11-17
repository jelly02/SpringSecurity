package com.mysite.myweb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class ErrorPageHandlerController implements ErrorController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // 에러 페이지 정의
    private final String ERROR_ETC_PAGE_PATH = "error";

    @RequestMapping(value = "/error")
    public String handleError(HttpServletRequest request, Model model) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        HttpStatus httpStatus = HttpStatus.valueOf(Integer.valueOf(status.toString()));

        if (status != null) {
            int statusCode = Integer.valueOf(status.toString());

            logger.info("httpStatus : " + statusCode);
            // 404 error
            if (statusCode == HttpStatus.NOT_FOUND.value()) {
                // 에러 페이지에 표시할 정보
                model.addAttribute("code", status.toString());
                model.addAttribute("msg", httpStatus.getReasonPhrase());
                model.addAttribute("timestamp", new Date());
            }

            // 500 error
            if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                // 서버 처리 에러
                model.addAttribute("code", "500");
                model.addAttribute("msg", "500 error");
                model.addAttribute("timestamp", new Date());
            }
        }
        else {
            model.addAttribute("code", "unknown");
            model.addAttribute("msg", "unknown error");
            model.addAttribute("timestamp", new Date());
        }
        return ERROR_ETC_PAGE_PATH;
    }
}
