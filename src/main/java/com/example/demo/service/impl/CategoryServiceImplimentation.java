package com.example.demo.service.impl;
import com.example.demo.service.CategoryService;
import com.example.demo.entity.Category;
import com.example.demo.repository.Categoryrepo;
import org.springframework.beans.factory.annotations.Autowired;
import org.springframework.steroetype.Service
@Service
class CategoryServiceImplimentation implements CategoryService{
    @Autowired
    Categoryrepo obj;
    public Category createCategory(Category category){
        return obj.save(category);
    }
}