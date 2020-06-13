package com.vsc.demo.service.implementation;

import com.vsc.demo.dto.LoginDTO;
import com.vsc.demo.exception.InvalidPasswordExcetption;
import com.vsc.demo.exception.InvalidUserException;
import com.vsc.demo.service.contract.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String login(String username, String password) throws InvalidUserException, InvalidPasswordExcetption {
        // User exists in database

        // Passwords match with the one in DB

        if (username == null || username.isEmpty()) {
            throw new InvalidUserException("Username not provided");
        }

        if (password == null || password.isEmpty()) {
            throw new InvalidPasswordExcetption("Password not provided");
        }

        return username;
    }
}
