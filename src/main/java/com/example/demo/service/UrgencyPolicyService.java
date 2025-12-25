package com.example.demo.service;
import com.example.demo.model.UrgencyPolicy;
import java.util.List;
public interface UrgencyPolicyService{
    public UrgencyPolicy createPolicy(UrgencyPolicy policy);
    public List<UrgencyPolicy> getAllpolicies();
    public UrgencyPolicy getPolicy(Long id);
}