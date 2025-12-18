package com.example.demo.repository;
import com.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface Userrepo extends JpaRepository<User,Long>{

}