package com.example.demo.service;
import com.example.demo.model.user;
public interface Userservice{
    public User register(User user);
    public User getUser(Long id);
    public User findByEmail(String  Email);
}