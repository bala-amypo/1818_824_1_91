package com.example.demo.model;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.PrePersist;
@Entity
public class CategorizationLog{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String ticket;
    private String appliedRule;
    private String matchedKeyword;
    private String assignedCategory;
    private String assignedUrgency;
    private LocalTimeDate createdAt;
    @PrePersist
    public void onCreate(){
        if(createdAt==null){
            createdAt=LocalDateTime.now();
        }
    }
    public Long getId(){
        return id;
    }
    public String getTicket(){
        return ticket;
    }
    public String getAppliedRule(){
        return appliedRule;
    }
    public String getMatchedKeyword(){
        return matchedKeyword;
    }
    public String getAssignedCategory(){
        return assignedCategory;
    }
    public String getAssignedUrgency(){
        return assignedUrgency;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public void setTicket(String ticket){
        this.ticket=ticket;
    }
    public void setAppliedRule(String appliedRule){
        this.appliedRule=appliedRule;
    }
    public void setMatchedKeyword(String matchedKeyword){
        this.matchedKeyword=matchedKeyword;
    }
    public void setAssignedCategory(String assignedCategory){
        this.assignedCategory=assignedCategory;
    }
    public void setAssignedUrgency(String assignedUrgency){
        this.assignedUrgency=assignedUrgency;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt=createdAt;
    }
    public CategorizationLog(Long id,LocalDateTime createdAt,String ticket,String appliedRule,String matchedKeyword,String assignedCategory,String assignedUrgency){
        this.ticket=ticket;
        this.createdAt=createdAt;
        this.appliedRule=appliedRule;
        this.matchedKeyword=matchedKeyword;
        this.assignedCategory=assignedCategory;
        this.assignedUrgency=assignedUrgency;
    }
    public CategorizationLog(){}
}