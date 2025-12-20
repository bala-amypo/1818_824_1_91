package com.example.demo.service.impl;
import com.example.demo.entity.UrgencyPolicy;
import java.util.List;
interface UrgencyPolicy{
    public Urgencypolicy createPolicy(UrgencyPolicy policy);
    public List<Urgencypolicy> getAllpolicies();
    public Urgencypolicy getPolicy(Long id);
}