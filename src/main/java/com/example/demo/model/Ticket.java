package com.example.demo.model;
import jakarta.persistance.Entity;
import jakarta.persistance.Id;
import or
@Entity
public class Ticket{
    @Id
    private Long id;
    private String fullName;
    private String location;
    private String createdBy;
    private String createdAt;
    private String assignedCategory;
    private String urgencyLevel;
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(){
        this.fullName=fullName;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(Strung location){
        this.laction=location;
    }
    public String getCreatedBy(){
        return createdBy;
    }
    public void setCreatedBy(String createdBy){
        this.createdBy=createdBy;
    }
    public String getCreatedAt(){
        return createdAt();
    }
    public void setCreatedAt(String createdAt){
        this.createdAt=createdAt;
    }
    public String getAssignedcategory(){
        return assignedCategory;
    }
    public void setAssignedCtaegory(String assignedCategory){
        this assignedCategory=assignedCtaegory;
    }
    public String getUrgencyLevel(){
        return urgencyLevel;
    }
    public void setUrgencyLevel(String urgencyLevel){
        this.urgencyLevel=urgencyLevel;
    }
}