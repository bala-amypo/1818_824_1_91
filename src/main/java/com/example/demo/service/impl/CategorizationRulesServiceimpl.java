package com.example.demo.service.impl;
import java.util.List;
import com.example.demo.service.CategorizationRulerepo;
import org.springframework.beans.factory.annotation.Autowired;
class CategorizatrionRulesServiceimpl implements CtaegorizationRuleService{
    @Autowired
    CategorizationRulerepo obj;
    public CategorizationRule createRule(Long categoryId,CategorizationRule rule){
        return obj.save(CategoryId,rule);
    }
    public List<CategorizationRule> getRulesByCategory(Long categoryId){
        return obj.findByCategoryId(categoryId);
    }
    public CategorizationRule getRule(Long id){

    }
}