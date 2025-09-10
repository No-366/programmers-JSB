package com.jsb;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Answer {

    @Id // 엔티티 PK 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK 값 생성 전략 -> DB의 AUTO_INCREMENT 사용
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne
    private Question question;


}
