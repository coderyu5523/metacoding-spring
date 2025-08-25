package com.metacoding.springv1.reply;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Repository
public class ReplyRepository {
    private final EntityManager em;

    public void save(Reply reply) {
        em.persist(reply);
    }
}
