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
    private String urgencyOverride;
    private LocalDateTime createdAt;
    @PrePersist
    public void onCreate(){
        if(createdAt==null){
            createdAt=LocalDateTime.now();
        }
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getPolicyName(){
        return policyName;
    }
    public void setPolicyName(String policyName){
        this.policyName=policyName;
    }
    public String getKeyword(){
        return keyword;
    }
    public void setKeyword(String keyword){
        this.keyword=keyword;
    }
    public String getUrgencyOverride(){
        return urgencyOverride;
    }
    public void setUrgencyOverride(String urgencyOverride){
        this.urgencyOverride=urgencyOverride;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(){
    this.createdAt=createdAt;
    }
    public UrgencyPolicy(Long id,String policyName,String keyword,String urgencyOverride,LocalDateTime createdAt){
        this.id=id;
        this.policyName=policyName;
        this.keyword=keyword;
        this.urgencyOverride=urgencyOverride;
        this.createdAt=createdAt;
    }
    public UrgencyPolicy(){}
}