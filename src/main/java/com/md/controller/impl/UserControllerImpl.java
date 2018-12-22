package com.md.controller.impl;

import com.md.controller.UserController;
import com.md.model.User;
import com.md.service.UserService;
import com.md.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserControllerImpl implements UserController {
    UserService userService = new UserServiceImpl();

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String login(){
        return "/login";
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String authorize(){

        return "/login";
    }


    @Override
    public void saveUser(User user) {
        userService.saveUser(user);
    }

    @Override
    public boolean isRegistered(User user) {
        return userService.isRegistered(user);
    }
}
