package ru.kata.example.springbootdemo.dao;

import ru.kata.example.springbootdemo.model.User;
import java.util.List;

public interface UserDao {

    void add(User user);
    List<User> getAll();
    User getById(Long id);
    void delete(Long id);
    void update(User user);
}
