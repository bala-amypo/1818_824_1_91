package com.example.demo.model;
import jakarta.persistance.Entity;
import java.sql.Timestamp;
import jakarta.persistance.Id;
import org.hibernate.annotations.CreationTimestamp;
@Entity
public class Category{
    private Long id;
    private String categoryName;
    private String description;
    private String defaultUrgency;
    @CreationTimestamp
    private Timestamp createdAt;
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getCategoryName(){
        return categoryName;
    }
    public void setCategoryName(String categoryName){
        this.categoryName=categoryName;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getDefaultUrgency(){
        return defaultUrgency;
    }
    public void setDefaultUrgency(String defaultUrgency){
        this.defaultUrgency=defaultUrgency;
    }
    public Timestamp getTimestamp(){
        return Timestamp;
    }
    public void setTimestamp(Timestamp createdAt){
        this.createdAt=createdAt;
    }
    public Category(Long id,String categoryName,String description,String defaultUrgency,Timestamp createdAt){
        this.id=id;
        this.categoryName=categoryName;
        this.description=description;
        this.defaultUrgency=defaultUrgency;
        this.createdAt=createdAt;
}
public Category(){

}
}