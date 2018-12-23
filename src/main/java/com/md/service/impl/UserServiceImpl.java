package com.md.service.impl;

import com.md.exception.AlreadyRegisteredException;
import com.md.facade.dto.UserDto;
import com.md.model.User;
import com.md.model.VerificationToken;
import com.md.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public User registerNewUserAccount(UserDto accountDto) throws AlreadyRegisteredException {
        return null;
    }

    @Override
    public User getUser(String verificationToken) {
        return null;
    }

    @Override
    public void saveRegisteredUser(User user) {

    }

    @Override
    public void createVerificationToken(User user, String token) {

    }

    @Override
    public VerificationToken getVerificationToken(String VerificationToken) {
        return null;
    }
}
