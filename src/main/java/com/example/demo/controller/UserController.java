package com.example.demo.controller;
import com.example.model.User;
import com.example.service.Userservice;
import org.springframework.beans.factory.annotations.Autowired;
import org.springframework.web.bind.annotations.RequestBody;
import org.springframework.web.bind.annotations.RestController;
import org.springframework.web.bind.annotations.GetMapping;
import org.springframework.web.bind.annotations.PostMapping;
import org.springframework.web.bind.annotations.RequestBody;
import org.springfarmew
import java.util.List;

@RestController
public class UserController{
    @Autowired
    Userservice obj;
    @PostMapping("/Reg")
    public User Register(@RequestBody User user){
        return obj.register(user);
    }
    @PostMapping("/{id}")
    public User GetUser(@PathVariable Long id){
        return obj.getUser(id);
    }
    public User FindByEmail(String  Email){
        return obj.findByEmail(Email);
    }
}