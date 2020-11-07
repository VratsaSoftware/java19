package com.example.architecturedemo.model;


import android.content.Context;
import android.content.SharedPreferences;

import com.example.architecturedemo.model.dto.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class PreferenceManager {
    private SharedPreferences preferences;
    private List<User> users;
    private final String SHARED_PREFERENCES = "com.example.demo.PREFERENCE_FILE_KEY";
    private final String ALL_USERS = "users";
    private final String CURRENT_USER = "user";

    private static PreferenceManager manager = null;

    private PreferenceManager(Context context) {
        preferences = context.getSharedPreferences(SHARED_PREFERENCES, Context.MODE_PRIVATE);
        fillSharedPreferences();
    }

    public static PreferenceManager getInstance() {
        if ( manager == null ) {
            throw new NullPointerException("init() should be invoked first");
        }
        return manager;
    }

    public static void init(Context context) {
        manager = new PreferenceManager(context);
    }

    private void fillSharedPreferences() {
        users = new ArrayList<>();
        users.add(new User("1", "Presi", "presi","presi@presi.com", "asdf"));
        users.add(new User("2", "Angel", "angel","angel@angel.com", "asdf"));
        users.add(new User("3", "Hristo", "hristo","hristo@hristo.com", "asdf"));
        storeUsers(users);
    }

    public void storeUsers(List<User> usersList) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(ALL_USERS, new Gson().toJson(usersList));
        editor.apply();
    }

    public List<User> getUsers() {
        Type listOfUsers = new TypeToken<ArrayList<User>>(){}.getType();
        return new Gson().fromJson(preferences.getString(ALL_USERS, null),
                listOfUsers);
    }

    public void registerUser(User user) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(CURRENT_USER, new Gson().toJson(user));
        editor.apply();
    }

    public User getRegisteredUser() {
        return new Gson().fromJson(preferences.getString(CURRENT_USER, null),
                User.class);
    }

}
