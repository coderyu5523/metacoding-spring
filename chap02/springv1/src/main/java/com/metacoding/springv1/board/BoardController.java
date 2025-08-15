package com.metacoding.springv1.board;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class BoardController {

    private final BoardService boardService;
    
    @GetMapping("/")
    public String index(HttpServletRequest request) {

        List<BoardResponse.DTO> boards = boardService.게시글목록();
        request.setAttribute("models", boards);
        return "index";
    }

    @GetMapping("/boards/save-form")
    public String saveForm() {
        return "board/save-form";
    }

    @GetMapping("/boards/1/update-form")
    public String updateForm() {
        return "board/update-form";
    }

    @GetMapping("/boards/{id}")
    public String detail(HttpServletRequest request, @PathVariable Integer id) {
        BoardResponse.DTO board = boardService.게시글상세(id);
        request.setAttribute("model", board);
        
        return "board/detail";
    }


}
