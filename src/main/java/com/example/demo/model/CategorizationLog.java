package com.example.demo.model;
import java.util.Timestamp;
package org.hibernate.annotations.Timestamp;
class CategorizationLog{
    private Long id;
    private String ticket;
    private String appliedRule;
    private String matchedKeyword;
    private String assignedCategory;
    private String assignedUrgency;
    @CreationTimestamp
    private Timestamp createdAt;
    
}