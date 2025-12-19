package com.example.demo.service.impl;
import com.example.demo.entity.Urgencypolicy;
import java.util.List;
interface UrgencyPolicy{
    public Urgencypolicy createPolicy();
    public List<Urgencypolicy> getAllpolicies();
    public Urgencypolicy getPolicy(Long id);
}