package com.md.controller;

import com.md.dao.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.security.RolesAllowed;


@Controller
public class SecurityController {

    @Autowired
    private ReaderRepository readerRepository;

    @RequestMapping(value = "/")
    public ModelAndView login(){
        return new ModelAndView("/index");
    }

    @RolesAllowed(value = "ROLE_USER")
    @RequestMapping(value = "/success", method = RequestMethod.GET)
    public ModelAndView userCheckoutSuccess() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return new ModelAndView("form/success");
    }

    @RolesAllowed(value = "ROLE_ADMIN")
    @RequestMapping(value = "/teacher", method = RequestMethod.GET)
    public ModelAndView teacherPage() {
        return new ModelAndView("form/teacher");
    }

    public void setReaderRepository(ReaderRepository readerRepository) {
        this.readerRepository = readerRepository;
    }
}
