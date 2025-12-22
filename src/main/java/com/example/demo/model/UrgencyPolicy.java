package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.PrePersist;
@Entity
public class UrgencyPolicy{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String policyName;
    @NotNull(message="No Data")
    private String keyword;
    private String UrgencyOverride;
    private LocalDateTime createdAt;
    @PrePersist
    public void onCreate(){
        if(createdAt==null){
            createdAt=LocalDateTime.now();
        }
    }
    public Long setId(){
        return id;
    }
    
    public UrgencyPolicy(Long id,String category,String keyword,String matchType,Long priority,LocalDateTime createdAt){
        this.id=id;
        this.category=category;
        this.keyword=keyword;
        this.matchType=matchType;
        this.priority=priority;
        this.createdAt=createdAt;
    }
    public UrgencyPolicy(){}
}