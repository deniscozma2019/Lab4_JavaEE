package com.example.Lab4.repository;

import com.example.Lab4.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


}
