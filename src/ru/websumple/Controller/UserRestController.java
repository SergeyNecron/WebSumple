package ru.websumple.Controller;

import ru.websumple.model.User;
import ru.websumple.service.UserService;
import ru.websumple.service.UserServiceImpl;
import ru.websumple.sql.ConnectionFactory;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

public class UserRestController implements API {
    private UserService userService = new UserServiceImpl();

    @Override
    @GET
    @Path("/getuser/{id}")
    @Produces("application/json")
    public User getUserJson(@BeanParam int id) {
        return userService.getUser(id);
    }
    @Override
    @GET
    @Path("/getuser")
    @Produces("application/json")
    public List<User> getUserJsonAll() {
        return  userService.getUsers();
    }
}
