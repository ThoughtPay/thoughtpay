package com.thoughtpay.controllers;

import com.thoughtpay.domain.User;
import com.thoughtpay.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/{id}/update", method = RequestMethod.PUT)
    public String updateUser(User user) {
        userService.update(user);
        return "redirect:/";
    }

    @RequestMapping(value="/create", method = RequestMethod.POST)
    public String createUser(@ModelAttribute User user) {
        userService.saveNewUser(user);
        return "redirect:/";
    }

    @RequestMapping(value="/{id}/profile", method = RequestMethod.GET)
    public String viewProfile(@PathVariable String id){
        userService.getUser(id);
        return "/" + id + "/profile";
    }

}
