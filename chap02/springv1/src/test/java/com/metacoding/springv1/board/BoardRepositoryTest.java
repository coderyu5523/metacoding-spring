package com.metacoding.springv1.board;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class BoardRepositoryTest {

    @Autowired 
    private BoardRepository boardRepository;

    @Test
    public void findAll_test(){
        List<Board> board = boardRepository.findAll();
        System.out.println("=== 한글 테스트 ===");
        System.out.println("첫 번째 게시글 제목: " + board.get(0).getTitle());
        System.out.println("첫 번째 게시글 내용: " + board.get(0).getContent());
        System.out.println("전체 게시글 수: " + board.size());
        System.out.println("==================");
    }
    
}
