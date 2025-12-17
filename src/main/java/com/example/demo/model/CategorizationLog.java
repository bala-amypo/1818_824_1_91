package com.example.demo.model;
import java.util.Timestamp;
package org.hibernate.annotations.Timestamp;
class CategorizationLog{
    private Long id;
    private String ticket;
    private String appliedRule;
    private String matchedKeyword;
    private String assignedCategory;
    private String assignedUrgency;
    @CreationTimestamp
    private Timestamp createdAt;
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
}