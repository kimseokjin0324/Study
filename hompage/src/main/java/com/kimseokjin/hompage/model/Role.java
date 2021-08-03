package com.kimseokjin.hompage.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data// lombok으로 인해서 getter/setter를 만들어줌
public class Role {
    @Id //pk를 알려줌
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @ManyToMany(mappedBy = "roles")
    private List<User> users;

}
