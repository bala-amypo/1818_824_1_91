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
    public void getMatchedKeyword(){
        this.matchedKeyword=matchedKeyword;
    }
    public String setTicket(){
        return matchedKeyword;
    }
    public void getAssignedCategory(String assignedCategory){
        this.assignedCategory=assignedCategory;
    }
    public String setAssignedCategory(){
        return assignedCtaegory;
    }
    public void getAssignedUrgency(String assignedUrgency){
        this.assignedUrgency=assignedUrgency;
    }
    public String setAssignedUrgency(){
        return assignedUrgency;
    }
    public void getLoggedAt(String loggedAt){
        this.loggedAt=loggedAt;
    }
    public String setLoggedAt(){
        return loggedAt;
    } 
}