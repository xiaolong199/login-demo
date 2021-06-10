package com.jason.login.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * @author 刘小龙
 */
@Data
@Entity
public class User {

    @Id
    private Long id;

    private String username;

    private String phone;

    private String password;

    private LocalDateTime createdTime;

    private Integer status;
}
