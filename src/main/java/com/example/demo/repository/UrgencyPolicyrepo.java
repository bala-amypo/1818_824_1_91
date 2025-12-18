package com.example.demo.repository; 
import com.example.demo.model.UrgencyPolicy;
import org.springframework.data.repository.jpa.JpaRepository;
public interface UrgencyPolicyrepo extends JpaRepository<UrgencyPolicy,Long>{

}