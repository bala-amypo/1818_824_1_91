package com.example.demo;
import jakarta.persistance.Entity;
@Entity
public class category{
    private Long id;
    private String categoryName;
    private String description;
    private String defaultUrgency;
    private String createdAt;
    private String createdAt;
    public Long getId(Long id){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getCategoryName(String categoryName){
        return categoryName;
    }
    public void setCategoryName(){
        this.categoryName=categoryName;
    }
    public String getDescription(String description){
        return description;
    }
    public void setDescription(){
        this.description=description;
    }
    public void getDefaultUrgency(String DefaultUrgency){
        this.defaultUrgency=defaultUrgency;
    }
}