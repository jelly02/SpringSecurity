package com.mysite.myweb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


// View
@Controller
public class WelcomeClass {

    @ResponseBody
    @GetMapping("/webblog")
    public String entryPoint() {
        return "HI";
    }

    @GetMapping("/webblogpage")
    public String viewPage() {
        return "index2";
    }
}
