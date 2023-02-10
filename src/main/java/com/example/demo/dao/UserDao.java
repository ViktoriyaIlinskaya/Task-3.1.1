package com.example.demo.dao;

import com.example.demo.model.User;

import java.util.List;

public interface UserDao {
    public void addUser(User user);

    public User getUserById(int id);

    public User updateUser(User user);

    public void removeUserById(int id);

    public List<User> listUsers();
}
