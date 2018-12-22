package com.md.service;

import com.md.model.User;

public interface UserService {

    void saveUser(User user);

    boolean isRegistered(User user);

}
