package com.example.demo.service.impl;
import java.util.List;
import com.example.demo.service.CategorizationRuleservice;
import com.example.demo.repository.CategorizationRuleRepository;
import com.example.demo.model.CategorizationRule;
import com.example.demo.model.Category;
import com.example.demo.repository.Categoryrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
class CategorizatrionRulesServiceimpl implements CategorizationRuleservice{
    @Autowired
    CategorizationRuleRepository obj;
    @Autowired
    Categoryrepo ob;
    public CategorizationRule createRule(Long categoryId,CategorizationRule rule){
        Category category=ob.findById(categoryId)
            .orElseThrow(()->new RuntimeException("No Id Found"));
        rule.setCategory(category);
        return obj.save(rule);
    }
    public List<CategorizationRule> getRulesByCategory(Long categoryId){
        return obj.findByCategoryId(categoryId);
    }
    public CategorizationRule getRule(Long id){
        return obj.findById(id).orElse(null);
    }
}