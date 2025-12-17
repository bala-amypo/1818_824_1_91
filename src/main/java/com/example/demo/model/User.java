package com.demo.model;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import java.sql.
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
    String getEmail(){
        return email;
    }
    String getPassword(){
        return password;
    }
    String getRole(){
        return role;
    }
    TimeStamp getCreatedAt(){
        return createdAt;
    }
    public void setId(Long id){
        this.id=id;
    }
    public void setFullName(String fullname){
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
    public void setCreatedAt(Timestamp createdAt){
        this.createdAt=createdAt;
    }
}