package com.kimseokjin.hompage.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data// lombok으로 인해서 getter/setter를 만들어줌
public class Board {
    @Id //pk를 알려줌
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2, max=30,message = "제목은 2자이상 30자 이하입니다.")
    private String title;
    private String content;
}
