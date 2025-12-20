package com.example.demo.service.impl;
import com.example.demo.model.UrgencyPolicy;
import java.util.List;
public interface UrgencyPolicyservice{
    Urgencypolicy createPolicy(UrgencyPolicy policy);
    List<Urgencypolicy> getAllpolicies();
    Urgencypolicy getPolicy(Long id);
}