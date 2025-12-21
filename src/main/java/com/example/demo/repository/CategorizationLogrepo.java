package com.example.demo.repository;
import com.example.demo.model.CategorizationLog;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CategorizationLogrepo extends JpaRepository<CategorizationLog,Long>{
    
}