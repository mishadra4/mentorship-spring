package com.md.controller;

import com.md.dao.ReaderDAO;
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
    private ReaderDAO readerDAO;

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


    public void setReaderDAO(ReaderDAO readerDAO) {
        this.readerDAO = readerDAO;
    }

}
