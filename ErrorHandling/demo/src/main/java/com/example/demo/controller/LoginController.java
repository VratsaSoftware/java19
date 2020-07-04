package com.example.demo.controller;

import com.example.demo.model.InvalidPasswordException;
import com.example.demo.model.entities.User;
import com.example.demo.model.requests.LoginRequest;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @CrossOrigin
    @PostMapping("/login")
    public User login(@RequestBody LoginRequest loginRequest)
            throws InvalidPasswordException {

        return loginService.login(loginRequest);
    }
}
