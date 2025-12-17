package com.example.demo.model;
import jakarta.persistance.Entity;
@Entity
public class UrgencyPolicy{
    @Id
    private Long id;
    private String category;
    private String keyword;
    private String matchType;
    private Long priority;
    private String createdAt;
    public Long getId(){
        return id;
    }
    public setId(Long id){
        this.id=id;
    }
    public String getCategory(){
        return 
    }
}