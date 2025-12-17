package com.example.demo
public class CategorizationLog{
    private Long id;
    private String Ticket;
    private String appliedRule;
    private String MatchedKeyword;
    private String assignedCategory;
    private String assignedUrgency;
    private String loggedAt;
    public void setTicket(String Ticket){
        this.Ticket=Ticket;
    }
    public String getTicket(){
        return Ticket;
    }
    public void getAppliedRule(String Ticket){
        this.appliedRule=apppliedRule;
    }
    public String setAppliedRule(){
        return appliedRule;
    }
    public void getMatchedKeyword(String matchedKeyword){
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
    public void getAssignedUrgency(){
        this.assignedUrgency=assignedUrgency;
    }
    public String setAssignedUrgency(String assignedUrgency){
        return assignedUrgency;
    }
    public void getLoggedAt(){
        this.loggedAt=loggedAt;
    }
    public String setLoggedAt(String loggedAt){
        return loggedAt;
    } 
}