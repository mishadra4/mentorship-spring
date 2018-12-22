package com.md.dao;

import com.md.model.User;

public interface UserDao {

    void saveUser(User user);

    String getHashPassword(String username);

}
