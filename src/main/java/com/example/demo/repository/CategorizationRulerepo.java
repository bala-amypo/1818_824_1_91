package com.example.demo.repository;
import com.example.demo.model.CategorizationRule;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import 
public interface CategorizationRulerepo extends JpaRepository<CategorizationRule,Long>{
    Optional<Category> 
}