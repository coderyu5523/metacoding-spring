package com.metacoding.springv1.board;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity  
@Table(name="board_tb") 
public class Board {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)  // 자동 증가
    private Integer id;
    private  String title;
    private  String content;
    private  Timestamp createdAt;
}
