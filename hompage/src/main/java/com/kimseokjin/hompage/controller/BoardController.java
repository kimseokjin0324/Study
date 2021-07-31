package com.kimseokjin.hompage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//메뉴 게시판클릭시 동작하는 컨트롤러
@Controller
@RequestMapping("/board")
public class BoardController {
    @GetMapping("/list")
    public String list(){
        return "board/list";
    }
}
