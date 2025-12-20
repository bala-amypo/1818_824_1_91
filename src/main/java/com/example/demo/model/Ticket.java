package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;
import com.example.demo.model.Category;
import java.sql.Timestamp;
@Entity
public class Ticket{
    @Id
    private Long id;
    private String fullName;
    private String location;
    private String createdBy;
    @CreationTimestamp
    private Timestamp createdAt;
    @ManytoOne
    JoinColumn("category_id");
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
    public void setLocation(String location){
        this.location=location;
    }
    public String getCreatedBy(){
        return createdBy;
    }
    public void setCreatedBy(String createdBy){
        this.createdBy=createdBy;
    }
    public String getAssignedcategory(){
        return assignedCategory;
    }
    public void setAssignedCtaegory(String assignedCategory){
        this.assignedCategory=assignedCategory;
    }
    public String getUrgencyLevel(){
        return urgencyLevel;
    }
    public void setUrgencyLevel(String urgencyLevel){
        this.urgencyLevel=urgencyLevel;
    }
    public Timestamp getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt){
        this.createdAt=createdAt;
    }
    public Ticket(Long id,String fullName,String Loaction,String createdBy,Timestamp createdAt,String assignedCategory,String urgencyLevel){
        this.id=id;
        this.location=location;
        this.createdBy=createdBy;
        this.createdAt=createdAt;
        this.assignedCategory=assignedCategory;
        this.urgencyLevel=urgencyLevel;
    }
    public Ticket(){}
}