package com.metacoding.springv1.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;
    
    @GetMapping("/")
    public String index(Model model) {

        List<BoardResponse.DTO> boards = boardService.게시글목록();
        model.addAttribute("boards", boards);
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

    @GetMapping("/boards/1")
    public String detail() {
        return "board/detail";
    }


}
