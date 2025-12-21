package com.example.demo.controller;
import com.example.demo.service.impl.CategorizationRuleservice;
import com.example.demo.model.CategorizationRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
@RestController
class CategrizationRuleController{
    @Autowired
    CategorizationRuleservice obj;

    @PostMapping("/kl")
    CategorizationRule CreateRule(Long CategoryId,CategorizationRule rule){
        return obj.createRule(CategoryId,rule);
    }
    @GetMapping("/id/{CategoryId}")
    List<CategorizationRule> GetRule(@PathVariable Long categoryId){
        return obj.getRulesByCategory(categoryId);
    }
    @GetMapping("ruleid/{id}")
    CategorizationRule gettingRule(@PathVariable Long id){
        return obj.getRule(id);
    }
}