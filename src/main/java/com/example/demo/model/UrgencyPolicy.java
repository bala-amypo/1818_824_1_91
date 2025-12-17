package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;
import java.sql.Timestamp;
@Entity
public class UrgencyPolicy{
    @Id
    private Long id;
    private String category;
    private String keyword;
    private String matchType;
    private Long priority;
    @CreationTimestamp
    private Timestamp createdAt;
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
    public void setCreatedAt(Timestamp createdAt){
        this.createdAt=createdAt;
    }
    public Timestamp getCreatedAt(){
        return createdAt;
    }
    public void setKeyword(String keyword){
        this.keyword=keyword;
    }
    public String getKeyWord(){
        return keyword;
    }
    public UrgencyPolicy(Long id,String category,String keyword,String matchType,Long priority,Timestamp createdAt){
        this.id=id;
        this.category=category;
        this.keyword=keyword;
        this.matchType=matchType;
        this.priority=priority;
        this.createdAt=createdAt;
    }
    public UrgencyPolicy(){}
}