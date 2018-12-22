package com.md.controller;

import com.md.model.User;

public interface UserController {

    void saveUser(User user);

    boolean isRegistered(User user);

}
