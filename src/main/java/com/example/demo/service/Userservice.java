package com.example.demo.service;
import com.example.demo.model.User;
public interface Userservice{
    public User register(User user);
    public User getUser(Long id);
    public User findByEmail(String  Email);
    public User updateById(Long id,User data);
    public User UpateMin(Long id,User data);
    public User deleteUser(String Abi);
}