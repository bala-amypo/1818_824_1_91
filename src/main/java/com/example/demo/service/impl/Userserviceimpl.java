package com.example.demo.service.impl;
import com.example.demo.service.Userservice;
import com.example.demo.repository.Userrepo;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Userserviceimpl implements Userservice{
    @Autowired
    Userrepo obj;
    public User register(User user){
        return obj.save(user);
    }
    public User getUser(Long id){
        return obj.findById(id).orElse(null);
    }
    public User findByEmail(String  Email){
        return obj.findByEmail(Email).orElse(null);
    }
    public User updateById(Long id,User data){
        User dat=obj.findById(id)
            .orElseThrow(()->new RuntimeException("no id is found"));
        dat.setFullName(data.getFullName());
        dat.setEmail(data.getEmail());
        dat.setPassword(data.getPassword());
        dat.setRole(data.getRole());
        return obj.save(dat);
    }
}