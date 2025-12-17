package com.example.demo.model;

@Entity
class CategorizationRule{
    @Id
    private Long id;
    private String category;
    private String keyword;
    private String matchType;
    private int priority;
    private String createdAt;
    public void setCategory(String category){
        this.category=category;
    }
    public String getCategory(){
        return category;
    }
    public void setKeyword(String keyword){
        this.keyword=category;
    }
    public String getKeyword(){
        return keyword;
    }
    public void setMatchType(String matchType){
        this.matchType=matchType;
    }
    public String getCategory(){
        return matchType;
    }  
    public void getPriority(int priority){
        this.priority=priority;
    }
    public int setPriority(){
        return priority;
    }
    public void setCreatedAt(String GetCategory){
        this.category=category;
    }
    public String getCategory(){
        return getCategory;
    }
    public CategorizationRule(Long id,String category,String keyword,String matchType,int Priority,String createdAt){
        
    }
}