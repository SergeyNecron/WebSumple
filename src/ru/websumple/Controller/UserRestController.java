package ru.websumple.Controller;

import ru.websumple.model.User;
import ru.websumple.service.UserService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

public class UserRestController implements API {
    private UserService userService;

    @Override
    @GET
    @Path("/getuser/{id}")
    @Produces("application/json")
    public User getUserJson(int id) {
        User user = userService.getUser(id);
        return user;
    }
}
