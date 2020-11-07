package com.example.architecturedemo.presenter;

import com.example.architecturedemo.model.services.SharedPreferencesService;
import com.example.architecturedemo.view.MainActivity;

public class MainActivityPresenter {
    private MainActivity mainActivity;
    private SharedPreferencesService service;

    public MainActivityPresenter(MainActivity activity) {
        this.mainActivity = activity;
        this.service = new SharedPreferencesService();
    }

    public void onActivityCreated() {
        service.getCurrentUser(new SharedPreferencesService.UserExistsListener() {
            @Override
            public void onUserExists() {
                mainActivity.redirectToMainFragment();
            }

            @Override
            public void onUserMissing() {
                mainActivity.redirectToRegistrationFragment();
            }
        });
    }

    public void onRedirectionToMainFragmentRequested() {
        mainActivity.redirectToMainFragment();
    }
}
