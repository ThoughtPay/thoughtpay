package com.thoughtpay.controllers;

import com.thoughtpay.domain.User;
import com.thoughtpay.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getHomePage(ModelMap model) {
        List<User> allUsers = homeService.getAllUsers();
        model.addAttribute("users", allUsers);
        return new ModelAndView("home", model);
    }

}
