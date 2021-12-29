package com.springboot.jihyun_blog.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_pk;

    private String email;

    private String password;
    private String name;
    private String image;
    private String status;
}
