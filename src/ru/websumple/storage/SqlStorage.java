package ru.websumple.storage;

import ru.websumple.model.User;
import ru.websumple.sql.SqlHelper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SqlStorage implements Storage {
    private final SqlHelper sqlHelper;

    public SqlStorage(String dbUrl, String dbUser, String dbPassword) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
        sqlHelper = new SqlHelper(() -> DriverManager.getConnection(dbUrl, dbUser, dbPassword));
    }

    @Override
    public User getUser(int id) {
        return sqlHelper.transactionalExecute(conn -> {
            String name;
            try (PreparedStatement ps = conn.prepareStatement("SELECT name FROM user WHERE id =?")) {
                ps.setInt(1,id);
                ResultSet rs = ps.executeQuery();
                name = rs.getString("name");
            }

            return new User(id,name);
        });
    }

    @Override
    public List<User> getUsers() {
        return sqlHelper.transactionalExecute(conn -> {
            List<User> users = new ArrayList<>();

            try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM user")) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    users.add(new User(id, name));
                }
            }
            return users;
        });
    }


}