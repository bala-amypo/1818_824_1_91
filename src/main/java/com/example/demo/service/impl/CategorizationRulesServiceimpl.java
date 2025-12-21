package com.example.demo.service.impl;
import java.util.List;
import com.example.demo.service.impl.CategorizationRuleservice.java
import com.example.demo.repository.CategorizationRulerepo;
import com.example.demo.model.
import com.example.demo.repository.Categoryrepo;
import org.springframework.beans.factory.annotation.Autowired;
class CategorizatrionRulesServiceimpl implements CategorizationRuleService{
    @Autowired
    CategorizationRulerepo obj;
    @Autowired
    Categoryrepo ob;
    public CategorizationRule createRule(Long categoryId,CategorizationRule rule){
        Category category=ob.findById(categoryId)
            .orElseThrow(()->new RunTimeException("No Id Found"));
        rule.setCategory(category);
        obj.save(rule);
    }
    public List<CategorizationRule> getRulesByCategory(Long categoryId){
        return obj.findByCategoryId(categoryId);
    }
    public CategorizationRule getRule(Long id){
        return obj.findById(id);
    }
}