package com.example.solob.controller;

import com.example.solob.domain.Board;
import com.example.solob.service.BoardService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/board")
public class BoardController {

    private BoardService service;

    @PostMapping("add")
    public void add(@RequestBody Board board) {
        service.add(board);

    }
}
