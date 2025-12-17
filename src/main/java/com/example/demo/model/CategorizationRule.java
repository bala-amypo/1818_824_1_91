package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Min;

@Entity
public class CategorizationRule{
    @Id
    private Long id;
    private String category;
    @NotNull(message="This Feild is Recquired")
    private String keyword;
    private String matchType;
    @Min(0)
    private int priority;
    private String createdAt;
    public void setCategory(String category){
        this.category=category;
        }
    public String getCategory(){
        return category;
    }
    public void setKeyword(String keyword){
        this.keyword=keyword;
    }
    public String getKeyword(){
        return keyword;
    }
    public void setMatchType(String matchType){
        this.matchType=matchType;
    }
    public String getMatchType(){
        return matchType;
    }  
    public void setPriority(int priority){
        this.priority=priority;
    }
    public int getPriority(){
        return priority;
    }
    public void setCreatedAt(String createdAt){
    this.createdAt=createdAt;
}
    public String getCreatedAt(){
        return createdAt;
}
public CategorizationRule(Long id,String category,String keyword,String matchType,int priority,String createdAt){
this.id=id;
this.category=category;
this.keyword=keyword;
this.matchType=matchType;
this.priority=priority;
this.createdAt=createdAt;
}
public CategorizationRule(){}
}