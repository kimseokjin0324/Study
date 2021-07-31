package com.kimseokjin.hompage.controller;

import com.kimseokjin.hompage.model.Board;
import com.kimseokjin.hompage.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//메뉴 게시판클릭시 동작하는 컨트롤러
@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;

    @GetMapping("/list")
    public String list(Model model){
        List<Board> boards=boardRepository.findAll();
        model.addAttribute("boards",boards);
        return "board/list";
    }
}
