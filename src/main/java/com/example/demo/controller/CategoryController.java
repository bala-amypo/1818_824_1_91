package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.service.CategoryService;
import com.example.demo.model.Category;
import java.util.List;
@RestController
public class CategoryController{
@Autowired
CategoryService cs;
@PostMapping("/Category")
public Category postData(@RequestBody Category cty){
    return cs.createCategory(cty);
}
@GetMapping

}