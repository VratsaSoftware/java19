package com.vsc.demo.service.contract;

import com.vsc.demo.dto.LoginDTO;
import com.vsc.demo.dto.RegisterDTO;
import com.vsc.demo.entity.User;
import com.vsc.demo.exception.InvalidPasswordExcetption;
import com.vsc.demo.exception.InvalidUserException;

public interface UserService {

    User register(RegisterDTO registerDTO);
}
