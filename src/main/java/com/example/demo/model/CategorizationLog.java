package com.example.demo.model;
import org.hibernate.annotations.CreationTimestamp;
import java.sql.Timestamp;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.PrePersist;
@Entity
class CategorizationLog{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String ticket;
    private String appliedRule;
    private String matchedKeyword;
    private String assignedCategory;
    private String assignedUrgency;
    @CreationTimestamp
    private Timestamp createdAt;
    @PrePersist
    public void onCreate(){
        this.createdAt=new Timestamp(System.currentTimeMillis());
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
    public Timestamp getCreatedAt(){
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
    public CategorizationLog(Long id,String ticket,String appliedRule,String matchedKeyword,String assignedCategory,String assignedUrgency){
        this.ticket=ticket;
        this.appliedRule=appliedRule;
        this.matchedKeyword=matchedKeyword;
        this.assignedCategory=assignedCategory;
        this.assignedUrgency=assignedUrgency;
    }
    public CategorizationLog(){}
}