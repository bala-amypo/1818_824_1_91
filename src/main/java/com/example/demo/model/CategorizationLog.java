package com.example.demo.model;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.PrePersist;
import com.example.demo.model.CategorizationRule;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import com.example.demo.model.Ticket;

@Entity
public class CategorizationLog{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="ticket_id")
    private Ticket ticket;
    @ManyToOne
    @JoinColumn(name="appliedrule_id")
    private CategorizationRule appliedRule;
    private String matchedKeyword;
    private String assignedCategory;
    private String assignedUrgency;
    private LocalDateTime loggedAt;
    @PrePersist
    public void onCreate(){
        if(loggedAt==null){
            loggedAt=LocalDateTime.now();
        }
    }
    public Long getId(){
        return id;
    }
    public Ticket getTicket(){
        return ticket;
    }
    public CategorizationRule getAppliedRule(){
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
    public void setTicket(Ticket ticket){
        this.ticket=ticket;
    }
    public void setAppliedRule(CategorizationRule appliedRule){
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
    public void setLoggedAt(LocalDateTime loggedAt){
        this.loggedAt=loggedAt;
    }
    public CategorizationLog(Long id,LocalDateTime createdAt,Ticket ticket,CategorizationRule appliedRule,String matchedKeyword,String assignedCategory,String assignedUrgency,LocalDateTime loggedAt){
        this.ticket=ticket;
        this.appliedRule=appliedRule;
        this.matchedKeyword=matchedKeyword;
        this.assignedCategory=assignedCategory;
        this.assignedUrgency=assignedUrgency;
        this.loggedAt=loggedAt;
    }
    public CategorizationLog(){}
}