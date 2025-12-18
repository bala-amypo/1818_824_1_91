package com.example.demo.model;
import jakarta.persistence.Entity;
import java.time.LocalDateTime;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Min;
import jakarta.persistence.unique;
@Entity
public class Category{
    @Id
    @GeneratedValue(stratergy=GenerationType.IDENTITY)
    private Long id;
    @column(unique=true)
    private String categoryName;
    @Min(10)
    private String description;
    @NotNull(message="No empty")
    private String defaultUrgency;
    private LocalDateTime createdAt;
    @PrePersist
    public void onCreate(){
        if(createdAt==null){
            createdAt=LocalDateTime.now();
        }
    }
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