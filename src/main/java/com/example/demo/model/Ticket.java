package com.example.demo.model;
import jakarta.persistance.Entity;
@Entity
public class Ticket{
    @Id-primary key
    private Long id;
    private String fullName;
    private String loaction;
    private String createdBy;
    private String createdAt;
    private String assignedCategory;
    private String urgencyLevel;
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public Long getFullName(){
        return fullName;
    }
    public void 
}