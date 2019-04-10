package ru.websumple.service;

import ru.websumple.model.User;

import java.util.List;

public interface UserService {
    User getUser(int id);
    List<User> getUsers();
}
