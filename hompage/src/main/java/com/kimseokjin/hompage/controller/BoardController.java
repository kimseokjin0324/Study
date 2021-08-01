package com.kimseokjin.hompage.controller;

import com.kimseokjin.hompage.model.Board;
import com.kimseokjin.hompage.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/form")
    public String form(Model model, @RequestParam(required = false) Long id){
        if(id==null){
            model.addAttribute("board",new Board());
        }else {
            Board board=boardRepository.findById(id).orElse(null);
            model.addAttribute("board",board);
        }
        return "board/form";
    }
    @PostMapping("/form")
    public String boardSubmit(@ModelAttribute Board board) {
        boardRepository.save(board);
        return "redirect:/board/list"; //list로 redirect로 조회되면서 화면이 이동됨
    }

}
