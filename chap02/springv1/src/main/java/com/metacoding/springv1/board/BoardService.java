package com.metacoding.springv1.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metacoding.springv1.board.BoardResponse.DTO;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public List<DTO> 게시글목록() {

        List<Board> boards = boardRepository.findAll(); // board 엔티티 조회

        List<DTO> dtoList = new ArrayList<>(); // List 객체 생성

        for (Board board : boards) {   // 반복문으로 boards 객체를 DTO 에 하나씩 담음
            dtoList.add(new BoardResponse.DTO(board));
        }
        return dtoList;
    }

    
}
