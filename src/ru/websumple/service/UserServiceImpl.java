package ru.websumple.service;


import ru.websumple.dao.UserDao;
import ru.websumple.model.User;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }
}
