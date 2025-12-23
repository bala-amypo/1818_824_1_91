package com.example.demo.service.impl;
import com.example.demo.service.Userservice;
import com.example.demo.repository.Userrepo;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;
@Service
public class Userserviceimpl implements Userservice{
    @Autowired
    Userrepo obj;
    public User register(User user){
        return obj.save(user);
    }
    public User getUser(Long id){
        User use=obj.findById(id).orElse(null);
        if(use==null){
            throw new RuntimeException("No id Exist");
        }
        return use;
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
    public User UpateMin(Long id,User data){
        User dat=obj.findById(id)
            .orElseThrow(()->new RuntimeException("No id is found"));
        if(data.getEmail()!=null){
            dat.setEmail(data.getEmail());
        }
        if(data.getFullName()!=null){
            dat.setFullName(data.getFullName());
        }
        if(data.getPassword()!=null){
            dat.setPassword(data.getPassword());
        }
        if(data.getRole()!=null){
            dat.setRole(data.getRole());
        }
       return obj.save(dat);
    }
    public void deleteUser(String Abi){
        User dat=obj.getByName(Abi);
        if(dat==null){
            throw new RuntimeException("No deletion is done");
        }
        obj.delete(dat);
    }
}