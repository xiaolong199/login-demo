package com.jason.login.repository;


import com.jason.login.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 刘小龙
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
