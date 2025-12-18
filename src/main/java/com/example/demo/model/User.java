package com.demo.model;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.PrePersist;
import java.time.LocalDateTime;
@Entity
public class User{
    @Id
    private Long id;
    private String fullName;
    @Column(unique=true)
    private String email;
    private String password;
    private String role;
    private LocalDateTime createdAt;
    @PrePersist
    public void onCreate(){
        if(createdAt==null){
            createdAt=LocalDateTime.now();
        }
    }
    Long getId(){
        return id;
    }
    String getFullname(){
        return fullName;
    }
    String getEmail(){
        return email;
    }
    String getPassword(){
        return password;
    }
    String getRole(){
        return role;
    }
    LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public void setId(Long id){
        this.id=id;
    }
    public void setFullName(String fullName){
        this.fullName=fullName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setRole(String role){
        this.role=role;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt=createdAt;
    }
    public User(Long id,String fullName,String email,String password,String role,LocalDateTime createdAt){
        this.id=id;
        this.fullName=fullName;
        this.email=email;
        this.password=password;
        this.role=role;
        this.createdAt=createdAt;
    }
    public User(){}
}