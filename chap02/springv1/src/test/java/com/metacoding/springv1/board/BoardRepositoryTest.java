package com.metacoding.springv1.board;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@DataJpaTest
public class BoardRepositoryTest {

    @Autowired 
    private BoardRepository boardRepository;

    @Autowired
    private EntityManager em;

    @Test
    public void findById_test(){
        //given
        int id = 2 ;
        //when
        Board board = boardRepository.findById(id).get();
        //when
        System.out.println("=======================");
        System.out.println("게시글 제목 : " + board.getTitle());
        System.out.println("게시글 내용 : " + board.getContent());
    }

    @Test
    public void findAll_test(){
        //given
        
        //when
        List<Board> boards = boardRepository.findAll();
        //then
        System.out.println("=======================");
        System.out.println("게시글 수 : " + boards.size());
        System.out.println("첫 번째 게시글 제목 :" +boards.get(0).getTitle());
        System.out.println("두 번째 게시글 내용 :" +boards.get(1).getContent());
    }

    @Test
    public void save_test(){
        //given
        Board board = Board.builder()
                    .title("제목3")
                    .content("단위 테스트 중")
                    .build();
        //when
        boardRepository.save(board);
        // then
        List<Board> boards = boardRepository.findAll();
        System.out.println("=======================");
        System.out.println("게시글 수 : " + boards.size());
        System.out.println("ID: " + boards.get(1).getId());
        System.out.println("제목: " + boards.get(1).getTitle());
        System.out.println("내용: " + boards.get(1).getContent());   
    }

    @Transactional
    @Test
    public void update_test(){
        //given
        int id = 2;
        //when
        Board board = boardRepository.findById(id).get();
        board.setTitle("제목 수정 2");
        board.setContent("업데이트 단위 테스트 중");

        em.flush();
        //then
        Board result = boardRepository.findById(id).get();
        System.out.println("=======================");
        System.out.println("게시글 제목 : " + result.getTitle());
        System.out.println("게시글 내용 : " + result.getContent());
    }

    @Test
    public void deleteById_test(){
        //given
        int id = 2;
        //when
        boardRepository.deleteById(id);
        //then
        List<Board> boards = boardRepository.findAll();
        System.out.println("=======================");
        System.out.println("게시글 수 : " + boards.size());

    }
    
}
