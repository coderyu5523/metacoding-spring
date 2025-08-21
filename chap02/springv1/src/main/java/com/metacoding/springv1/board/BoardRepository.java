package com.metacoding.springv1.board;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class BoardRepository{

    private final EntityManager em;

    // 게시글 조회하기  
    public Optional<Board> findById(int id){       
        Board board = em.find(Board.class, id);
        return Optional.ofNullable(board);
    }   

    // 전체 게시글 조회하기
    public List<Board> findAll(){
        List<Board> boards = em.createQuery("select b from Board b", Board.class).getResultList();
        return boards;
    }
    
    // 게시글 저장하기
    @Transactional
    public void save(Board board){   
         em.persist(board);
    }

    // 게시글 삭제하기
    @Transactional
    public void deleteById(int id) {
        em.createQuery("delete from Board b where b.id = :id")
          .setParameter("id", id)
          .executeUpdate();
    }
}
