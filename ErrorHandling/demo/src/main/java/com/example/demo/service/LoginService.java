package com.example.demo.service;

import com.example.demo.model.InvalidPasswordException;
import com.example.demo.model.entities.User;
import com.example.demo.model.requests.LoginRequest;
import com.example.demo.model.utils.ValidatorUtil;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements UserDetailsService {

    public User login(LoginRequest loginRequest) throws InvalidPasswordException {
        User user = new User();
        user.setId(1);
        user.setUserName("MyUser");

        ValidatorUtil.validateLoginCredentials(loginRequest);

        return user;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
