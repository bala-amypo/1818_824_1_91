package com.example.demo.controller;
import com.example.model.User;
import com.example.service.Userservice;
import org.springframework.beans.factory.annotations.Autowired;
import org.springframework.web.bind.annotations.RequestBody;
import org.springframework.web.bind.annotations.RestController;
import org.springframework.web.bind.annotations.GetMapping;
import org.springframework.web.bind.annotations.PostMapping;
import org.springframework.web.bind.annotations.RequestBody;
import java.util.List;

@RestController
public class UserController{
    @Autowired
    Userservice obj;
    public User Register(@RequestBody User user){
        return obj.
    }
}