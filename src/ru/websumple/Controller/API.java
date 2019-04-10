package ru.websumple.Controller;

import ru.websumple.model.User;

import java.util.List;

public interface API {
    User getUserJson(int id);
    List<User> getUserJsonAll();
}
