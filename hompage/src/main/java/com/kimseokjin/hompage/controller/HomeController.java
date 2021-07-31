package com.kimseokjin.hompage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping//가장 기본이 되는 첫페이지
    public String index(){
        return "index";
    }
}
