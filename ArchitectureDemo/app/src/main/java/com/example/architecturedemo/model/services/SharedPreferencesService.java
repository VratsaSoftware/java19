package com.example.architecturedemo.model.services;

import com.example.architecturedemo.model.PreferenceManager;
import com.example.architecturedemo.model.dto.User;

public class SharedPreferencesService {
    private final PreferenceManager manager = PreferenceManager.getInstance();

    public void checkIfEmailExists(String email, FieldExistsListener fieldExistsListener) {
        for (User user : manager.getUsers()) {
            if(user.email.equals(email)) {
                fieldExistsListener.onFieldExists();
            }
        }
        fieldExistsListener.onFieldIsMissing();
    }

    public void register(String name, String username, String email, String password) {
            manager.registerUser(new User(
                    String.valueOf(manager.getUsers().size()),
                    name,
                    username,
                    email,
                    password)
            );
    }

    public void getCurrentUser(UserExistsListener userExistsListener) {
        if (manager.getRegisteredUser() == null) {
            userExistsListener.onUserMissing();
        } else {
            userExistsListener.onUserExists();
        }
    }

    public interface FieldExistsListener {
        void onFieldExists();
        void onFieldIsMissing();
    }

    public interface UserExistsListener {
        void onUserExists();
        void onUserMissing();
    }
}
