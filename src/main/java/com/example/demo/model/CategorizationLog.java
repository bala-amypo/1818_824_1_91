package com.example.demo;
import jakarta.persistance.Entity;
@Entity
public class CategorizationLog{
    private Long id;
    private String Ticket;
    private String appliedRule;
    private String matchedKeyword;
    private String assignedCategory;
    private String assignedUrgency;
    private String loggedAt;
    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return id;
    }
    public void setTicket(String Ticket){
        this.Ticket=Ticket;
    }
    public String getTicket(){
        return Ticket;
    }
    public void setAppliedRule(String appliedRule){
        this.appliedRule=appliedRule;
    }
    public String getAppliedRule(){
        return appliedrule;
    }
    public void getMatchedKerword(String matchedKeyword){
        this.matchedKeyword=matchedKeyword;
    }
    public String  setMatchedKeyword(){
        return matchedKeyword;
    }
    public void setAssignedCategory(String assignedCategory){
        this.assignedCategory=assignedCategory;
    }
    public String getAssignedCategory(){
        return assignedCategory;
    }
    public void setAssignedUrgency(String assignedUrgency){
        this.assignedUrgency=assignedUrgency;
    }
    public String getAssignedUrgency(){
        return assignedUrgency;
    }
    public void setLoggedAt(String loggedAt){
        this.loggedAt=loggedAt;
    }
    public String getLoggedAt(){
        return loggedAt;
    } 
    public CategorizationLog(Long id,String Ticket,String appliedRule,String matchedKeyword,String assignedCategory,String assignedUrgency,String loggedAt){
        this.id=id;
        this.Ticket=Ticket;
        this.appliedRule=appliedRule;
        this.matchedKeyword=matchedKeyword;
        this.assignedCategory=assignedCategory;
        this.assignedUrgency=assignedUrgency;
        this.loggedAt=loggedAt;
    }
    public CategorizationLog(){}
}