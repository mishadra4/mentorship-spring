package com.md.service.impl;

import com.md.dao.UserDao;
import com.md.dao.impl.UserDaoImpl;
import com.md.exception.AlreadyRegisteredException;
import com.md.model.User;
import com.md.service.UserService;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();

    private List<String> mutableHash = new ArrayList<>();

    private Function<String, Boolean> update = hash -> {
        mutableHash.stream().findFirst().ifPresent(hash::equals);
        return true;
    };

    @Override
    public void saveUser(User user) {
        if (isRegistered(user)) {
            throw new AlreadyRegisteredException();
        }
        userDao.saveUser(user);
    }

    @Override
    public boolean isRegistered(User user) {
        return !StringUtils.isEmpty(userDao.getHashPassword(user.getUsername()));
    }

}
