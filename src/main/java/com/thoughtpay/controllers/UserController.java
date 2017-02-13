package com.thoughtpay.controllers;

import com.thoughtpay.domain.User;
import com.thoughtpay.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    public String update(User user) {
        userService.update(user);
        return "redirect:/";
    }

    @RequestMapping(value="", method = RequestMethod.POST)
    public String create(User user) {
        userService.create(user);
        return "redirect:/";
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ModelAndView viewProfile(@PathVariable String id, ModelMap model){
        model.addAttribute("user", userService.getUser(id));
        return new ModelAndView("userProfile", model);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable String id) {
        userService.delete(id);
        return "redirect:/";
    }
}
