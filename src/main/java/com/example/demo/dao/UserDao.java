package com.example.demo.dao;

import com.example.demo.model.User;

import java.util.List;

public interface UserDao {
    public void addUser(User user);

    public User getUserById(long id);

    public User updateUser(User user);

    public void deleteUser(long id);

    public List<User> listUsers();

    List<User> getUsers();
}
