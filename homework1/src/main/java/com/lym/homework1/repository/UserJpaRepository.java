package com.lym.homework1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lym.homework1.entity.User;


public interface UserJpaRepository extends JpaRepository<User,Long> {

}
