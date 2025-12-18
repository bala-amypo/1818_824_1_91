package com.example.demo.repository;
import com.example.demo.model.CategorizationLog;
import org.springframework.data.jpa.repository.JpaRepository;
public interface Categorizationrepo extends JPARepository<CategorizationLog,Long>{
    
}