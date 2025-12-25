package com.example.demo.service;
import com.example.demo.model.CategorizationRule;
import java.util.List;
public interface CategorizationRuleService{
    public CategorizationRule createRule(Long categoryId,CategorizationRule rule);
    public List<CategorizationRule> getRulesByCategory(Long categoryId);
    public CategorizationRule getRule(Long id);
} 