package com.example.architecturedemo.model.dto;

import java.io.Serializable;

public class User implements Serializable {
    public String uuid;
    public String name;
    public String username;
    public String email;
    public String password;

    public User(String uuid, String name, String username, String email, String password) {
        this.uuid = uuid;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
