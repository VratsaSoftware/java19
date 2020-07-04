package com.example.demo.model.utils;

import com.example.demo.model.InvalidPasswordException;
import com.example.demo.model.requests.LoginRequest;

public class ValidatorUtil {
    private static String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

    public static void validateLoginCredentials(LoginRequest loginRequest) throws InvalidPasswordException {
        if (loginRequest == null || loginRequest.getPassword() == null) {
            throw new InvalidPasswordException("Password is required field!");
        }

        if (!loginRequest.getPassword().matches(PASSWORD_REGEX)) {
            throw new InvalidPasswordException("Minimum password length 8 symbols. " +
                    "Password must contains 1 upper case letter, 1 lower case letter, 1 number and 1 special symbol");
        }
    }
}
