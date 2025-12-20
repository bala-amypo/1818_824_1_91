package com.example.demo.repository;
import com.example.demo.model.User;
import org.springframework.data.jpa.respository.JpaRepository;
public interface Userrepo extends JpaRepository<User,JpaRepository>{}
