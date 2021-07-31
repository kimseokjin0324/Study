package com.kimseokjin.hompage.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data// lombok으로 인해서 getter/setter를 만들어줌
public class Board {
    @Id //pk를 알려줌
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
}
