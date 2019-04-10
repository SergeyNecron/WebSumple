package ru.websumple.storage;

import ru.websumple.model.User;

import java.util.List;

public interface Storage {

    User getUser(int id);
    List<User> getUsers();
}