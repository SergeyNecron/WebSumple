package ru.websumple.dao;

import ru.websumple.model.User;

import java.util.List;

public interface UserDao {
    User getUser(int id);
    List<User> getUsers();
}
