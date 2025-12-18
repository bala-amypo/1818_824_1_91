package com.example.demo.model;
import jakarta.persistence.Entity;
import java.sql.Timestamp;
import jakarta.persistence.Id;
import jakarta.persistence.
import jakarta.persistence.unique;
@Entity
public class Category{
    @Id
    private Long id;
    @column(unique=true)
    private String categoryName;
    private String description;
    @NotNull(message="No empty")
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
    public Timestamp getcreatedAt(){
        return createdAt;
    }
      public void setCreatedAt(Timestamp createdAt){
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