package com.metacoding.springv1.reply;

import org.springframework.stereotype.Service;

import com.metacoding.springv1.board.BoardRepository;
import com.metacoding.springv1.user.User;
import com.metacoding.springv1.board.Board;
import lombok.RequiredArgsConstructor;
import jakarta.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class ReplyService {

    private final ReplyRepository replyRepository;
    private final BoardRepository boardRepository;

    @Transactional
    public void 댓글쓰기(ReplyRequest.SaveDTO requestDTO, User sessionUser, Integer boardId) {
        Board board = boardRepository.findByIdJoinUser(boardId).orElseThrow(()->new RuntimeException("게시글을 찾을 수 없습니다."));
        Reply reply = requestDTO.toEntity(sessionUser, board);
        replyRepository.save(reply);
    }
}
