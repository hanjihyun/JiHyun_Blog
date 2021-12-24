package com.springboot.jihyun_blog.repository;

import com.springboot.jihyun_blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
