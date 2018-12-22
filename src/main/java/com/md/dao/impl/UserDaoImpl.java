package com.md.dao.impl;

import com.md.dao.UserDao;
import com.md.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser(User user) {

    }

    @Override
    public String getHashPassword(String username) {
        return null;
    }
}
