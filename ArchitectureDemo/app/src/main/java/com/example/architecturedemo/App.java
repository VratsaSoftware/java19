package com.example.architecturedemo;

import android.app.Application;

import com.example.architecturedemo.model.PreferenceManager;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PreferenceManager.init(this);
    }
}
