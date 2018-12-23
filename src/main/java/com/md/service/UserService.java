package com.md.service;


import com.md.exception.AlreadyRegisteredException;
import com.md.facade.dto.UserDto;
import com.md.model.User;
import com.md.model.VerificationToken;

public interface UserService {

    User registerNewUserAccount(UserDto accountDto)
            throws AlreadyRegisteredException;

    User getUser(String verificationToken);

    void saveRegisteredUser(User user);

    void createVerificationToken(User user, String token);

    VerificationToken getVerificationToken(String VerificationToken);
}