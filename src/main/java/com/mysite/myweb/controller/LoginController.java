package com.mysite.myweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/all")
    public String alluser() {
        return "all";
    }
    @GetMapping("/member")
    public String memberuser() {
        return "member";
    }
    @GetMapping("/manager")
    public String manageruser() {
        return "manager";
    }
    @GetMapping("/admin")
    public String adminuser() {
        return "admin";
    }
}
