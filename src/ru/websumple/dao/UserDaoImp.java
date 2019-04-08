package ru.websumple.dao;

import ru.websumple.model.User;

public class UserDaoImp implements UserDao {

    public User getUser(int id) {
       return new User(1,"Вася");
    }
}
