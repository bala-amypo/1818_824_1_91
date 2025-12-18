package com.example.demo.service;
import com.example.demo.entity.Category;
import jakarta.persistence.service.CategoryService;
@Service
public interface CategoryService{
    public Category createCategory(Category category);
    public Category getCategory(Long id);
    public List<Category> getAllCategories();
}