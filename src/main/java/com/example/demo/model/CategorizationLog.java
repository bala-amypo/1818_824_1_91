package com.example.demo;
import jakarta.persistance.Entity;
@Entity
public class CategorizationLog{
    private Long id;
    private String Ticket;
    private String appliedRule;
    private String MatchedKeyword;
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
    public String setAppliedRule(String matchedKeyword){
        return appliedRule;
    }
    public String  getMatchedKeyword(String matchedKeyword){
        return matchedKeyword;
    }
    public String setTicket(){
        return matchedKeyword;
    }
    public void setAssignedCategory(String assignedCategory){
        this.assignedCategory=assignedCategory;
    }
    public String getAssignedCategory(){
        return assignedCtaegory;
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
}