package com.vsc.demo.service.contract;

import com.vsc.demo.dto.LoginDTO;
import com.vsc.demo.exception.InvalidPasswordExcetption;
import com.vsc.demo.exception.InvalidUserException;

public interface UserService {

    String login(String username, String password) throws InvalidUserException, InvalidPasswordExcetption;
}
