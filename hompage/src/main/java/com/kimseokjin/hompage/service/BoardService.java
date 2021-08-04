package com.kimseokjin.hompage.service;

import com.kimseokjin.hompage.model.Board;
import com.kimseokjin.hompage.model.User;
import com.kimseokjin.hompage.repository.BoardRepository;
import com.kimseokjin.hompage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;


    public Board save(String username,Board board){

        User user=userRepository.findByUsername(username);
        board.setUser(user);
        return boardRepository.save(board);
    }
}
