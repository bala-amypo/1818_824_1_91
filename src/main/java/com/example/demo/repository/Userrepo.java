package com.example.demo.repository;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Optional;
public interface Userrepo extends JpaRepository<User,Long>{
    @Query("FROM User u WHERE u.fullName= :Name")
    User getByName(@Param("Name") String Name);
    Optional<User> findByEmail(String Email);
}
