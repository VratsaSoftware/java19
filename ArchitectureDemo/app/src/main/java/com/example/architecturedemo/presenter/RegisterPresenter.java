package com.example.architecturedemo.presenter;
import com.example.architecturedemo.model.services.SharedPreferencesService;
import com.example.architecturedemo.view.fragments.RegistrationFragment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegisterPresenter {
    private SharedPreferencesService sharedPreferencesService;
    private RegistrationFragment registerFragment;

    public RegisterPresenter(RegistrationFragment fragment) {
        this.registerFragment = fragment;
        this.sharedPreferencesService = new SharedPreferencesService();
    }

    public void onUsernameFocusLost(String username) {
        String trimmedUsername = this.formatFieldData(username);
        getUsernameErrorMessage(trimmedUsername, error -> {
            registerFragment.setUsernameError(error);
            registerFragment.setUsername(trimmedUsername);
        });
    }

    private void getUsernameErrorMessage(String username, OnMessageArrivedListener listener) {
        if (username.length() == 0) {
            listener.onFieldError("This field cannot be blank.");
        } else {
            listener.onFieldError(null);
        }
    }

    public void onEmailFocusLost(String email) {
        String trimmedEmail = formatFieldData(email);
        getEmailErrorMessage(email, error -> {
            registerFragment.setEmailError(error);
            registerFragment.setEmail(trimmedEmail);
        });
    }

    private void getEmailErrorMessage(String email, OnMessageArrivedListener listener) {
        final String regex = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";

        if (email.length() == 0) {
            listener.onFieldError("This field cannot be blank.");
        } else {
            sharedPreferencesService.checkIfEmailExists(email, new SharedPreferencesService.FieldExistsListener() {
                @Override
                public void onFieldExists() {
                    listener.onFieldError("User with that email address already exists.");
                }

                @Override
                public void onFieldIsMissing() {
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(email);
                    String error = matcher.matches() ? null : "Please enter a valid email address.";
                    listener.onFieldError(error);
                }
            });
        }
    }

    public void onPasswordFocusLost(String password) {
        String trimmedPassword = formatFieldData(password);
        String error = getPasswordErrorMessage(trimmedPassword);
        registerFragment.setPasswordError(error);
        registerFragment.setPassword(trimmedPassword);
    }

    private String getPasswordErrorMessage(String password) {
        final String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$";
        String error = null;

        if (password.length() == 0) {
            error = "This field cannot be blank.";
        } else {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);
            error = matcher.matches() ? null :
                    "Password should be at least 6 characters long, contain both uppercase and lowercase and at least ope digit.";
        }

        return error;
    }

    public void onPasswordRepeatFocusLost(String password, String repeatedPassword) {
        String error = getPasswordRepeatErrorMessage(password, repeatedPassword);
        registerFragment.setRepeatPasswordError(error);
    }

    private String getPasswordRepeatErrorMessage(String password, String repeatedPassword) {
        String error = password.equals(repeatedPassword) ? null : "Passwords should match.";
        return error;
    }

    private String formatFieldData(String data) {
        return data.trim();
    }

    public void onRegisterButtonPressed(String name, String username,
                                        String email, String password, String repeatedPassword) {
        getUsernameErrorMessage(username, error -> {
            if (error == null
                    && getPasswordErrorMessage(password) == null
                    && getPasswordRepeatErrorMessage(password, repeatedPassword) == null) {

                registerNewUser(name, username, email, password);
            }
        });
    }

    public void registerNewUser(String name, String username, String email, String password) {
        sharedPreferencesService.register(name, username, email, password);
        registerFragment.redirectToMainFragment();
    }

    public interface OnMessageArrivedListener {
        void onFieldError(String error);
    }

}
