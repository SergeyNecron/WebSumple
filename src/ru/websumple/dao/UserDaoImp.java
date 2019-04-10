package ru.websumple.dao;

import ru.websumple.Config;
import ru.websumple.model.User;
import ru.websumple.storage.Storage;

import java.util.List;

public class UserDaoImp implements UserDao {


   private final Config INSTANCE = Config.get();
   private final Storage storage = INSTANCE.getStorage();

    @Override
    public User getUser(int id) {
        return storage.getUser(id);
    }

    @Override
    public List<User> getUsers() {
        return storage.getUsers();
    }



}
