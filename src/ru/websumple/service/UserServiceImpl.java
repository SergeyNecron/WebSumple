package ru.websumple.service;


import ru.websumple.dao.UserDao;
import ru.websumple.dao.UserDaoImp;
import ru.websumple.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImp();

    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }
}
