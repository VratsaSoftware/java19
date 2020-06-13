package com.vsc.demo.controller;

import com.vsc.demo.dto.LoginDTO;
import com.vsc.demo.exception.InvalidPasswordExcetption;
import com.vsc.demo.exception.InvalidUserException;
import com.vsc.demo.service.contract.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController extends BaseController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public ModelAndView login() {
        return send("login");
    }

    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute LoginDTO loginDTO) throws InvalidPasswordExcetption, InvalidUserException {
        String loggedUser =  userService.login(loginDTO.getUsername(), loginDTO.getPassword());
        return send("index", "user", loggedUser);
    }
}
