package com.example.demo.repository;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Optional;
public interface Userrepo extends JpaRepository<User,Long>{
    Optional<User> findByEmail(String Email);
    @Query("SELECT n FROM USER n n.name ")
    User getByName(@Param String Name){

    }
}
