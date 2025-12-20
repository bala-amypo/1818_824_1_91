package com.example.demo.service.impl;
import com.example.demo.model.UrgencyPolicy;
import java.util.List;
public interface UrgencyPolicyservice{
    UrgencyPolicy createPolicy(UrgencyPolicy policy);
    List<UrgencyPolicy> getAllpolicies();
    UrgencyPolicy getPolicy(Long id);
}