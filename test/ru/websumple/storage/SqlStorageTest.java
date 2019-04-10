package ru.websumple.storage;

import org.junit.Test;
import ru.websumple.Config;
import ru.websumple.model.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
public class SqlStorageTest {

//    private final Config INSTANCE = Config.get();
//    private final Storage storage = INSTANCE.getStorage();
    private final Storage storage;

    public SqlStorageTest() {
       this.storage = Config.get().getStorage();
    }
    @Test
    public void getUser() {
        User newUser = new User(1,"Вася");
        assertTrue(newUser.equals(storage.getUser(1)));
    }
    @Test
    public void getUsers() {
    List<User> newUsers = new ArrayList<>();
    newUsers.add(new User(1,"Вася"));
    newUsers.add(new User(2,"Петя"));
        assertTrue(newUsers.equals(storage.getUsers()));
    }

}