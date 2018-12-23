package com.md.controller.impl;

import com.md.controller.UserController;
import com.md.event.OnRegistrationCompleteEvent;
import com.md.model.User;
import com.md.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Locale;

@Controller
public class UserControllerImpl implements UserController {

    @Autowired
    private UserService userService;

    @Autowired
    ApplicationEventPublisher eventPublisher;

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String login(){
        eventPublisher.publishEvent(new OnRegistrationCompleteEvent(new User(), Locale.UK, ""));
        return "/login";
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String authorize(){
        eventPublisher.publishEvent(new OnRegistrationCompleteEvent(new User(), Locale.UK, ""));
        return "/login";
    }

    @RequestMapping(path = "/register", method = RequestMethod.GET)
    public ModelAndView register(){
        eventPublisher.publishEvent(new OnRegistrationCompleteEvent(new User(), Locale.UK, ""));
        return new ModelAndView("page/register");
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
