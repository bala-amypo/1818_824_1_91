package com.example.demo.service.impl;
import com.example.demo.model.UrgencyPolicy;
import com.example.demo.service.UrgencyPolicyservice;
import com.example.demo.repository.UrgencyPolicyRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class UrgencyPolicyserviceimpl implements UrgencyPolicyservice{
    @Autowired
    UrgencyPolicyRepository obj;
    public UrgencyPolicy createPolicy(UrgencyPolicy policy){
        return  obj.save(policy);
    }
    public List<UrgencyPolicy> getAllpolicies(){
        return obj.findAll();
    }
    public UrgencyPolicy getPolicy(Long id){
        return obj.findById(id).orElse(null);
    }
}