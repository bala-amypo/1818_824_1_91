package com.demo.model;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import org.hibernate.annotations.CreationTimestamp;
@Entity
public class User{
    @Id
    private Long id;
    private String fullName;
    private String email;
    private String password;
    private String role;
    @CreationTimestamp
    private Timestamp createdAt;
    Long getId(){
        return id;
    }
    String getFullname(){
        return fullName;
    }
}