package com.kimseokjin.hompage.repository;

import com.kimseokjin.hompage.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
