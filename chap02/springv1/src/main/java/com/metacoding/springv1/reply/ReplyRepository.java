package com.metacoding.springv1.reply;

import org.springframework.stereotype.Repository;

import com.metacoding.springv1.board.Board;
import com.metacoding.springv1.user.User;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Repository
public class ReplyRepository {
    private final EntityManager em;

    public void save(ReplyRequest.SaveDTO requestDTO, User user, Board board) {
        Reply reply = requestDTO.toEntity(user, board);
        em.persist(reply);
    }
}
