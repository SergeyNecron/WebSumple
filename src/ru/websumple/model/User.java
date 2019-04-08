package ru.websumple.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "user_name")
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
