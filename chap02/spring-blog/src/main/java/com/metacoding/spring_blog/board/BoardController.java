package com.metacoding.spring_blog.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
    
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/board/save-form")
    public String saveForm() {
        return "board/saveForm";
    }

    @GetMapping("/board/update-form")
    public String updateForm() {
        return "board/updateForm";
    }

    @GetMapping("/board/detail")
    public String detail() {
        return "board/detail";
    }


}
