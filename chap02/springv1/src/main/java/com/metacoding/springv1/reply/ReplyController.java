package com.metacoding.springv1.reply;

import jakarta.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.metacoding.springv1.user.User;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class ReplyController {
    private final ReplyService replyService;
    private final HttpSession session;

    @PostMapping("/replies/save")
    public String save(ReplyRequest.SaveDTO requestDTO) {
        User sessionUser = (User) session.getAttribute("session");
        replyService.댓글쓰기(requestDTO, sessionUser, requestDTO.getBoardId());
        return "redirect:/boards/" + requestDTO.getBoardId();
    }
}
