package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;
import j
@Entity
public class UrgencyPolicy{
    @Id
    private Long id;
    private String category;
    private String keyword;
    private String matchType;
    private Long priority;
    private  createdAt;
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public String getMatchType(){
        return matchType;
    } 
    public void setMatchType(String matchType){
        this.matchType=matchType;
    }
    public String getPriority(){
        return priority;
    }
    public void setPriority(String priority){
        this.priority=priority;
    }
    public void setCreatedAt(String createdAt){
        this.createdAt=createdAt
    }
    public String getCreatedAt(){
        return createdAt;
    }
}