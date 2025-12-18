package com.example.demo.service;
import org.springframework.stereotype.Service;
import com.example.demo.model.Category;
@Service
public interface CategoryService{
    public Category createCategory(Category category);
    public Category getCategory(Long id);
    // public List<Category> getAllCategories();
}