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

    @RequestMapping(value="/{id}/update", method = RequestMethod.PUT)
    public String update(User user) {
        userService.update(user);
        return "redirect:/";
    }

    @RequestMapping(value="/create", method = RequestMethod.POST)
    public String create(User user) {
        userService.create(user);
        return "redirect:/";
    }

    @RequestMapping(value="/{id}/profile", method = RequestMethod.GET)
    public ModelAndView getUserProfilePage(@PathVariable String id, ModelMap model){
        model.addAttribute("user", userService.getUser(id));
        System.out.println("trying to view your private info");
        return new ModelAndView("userProfile", model);
    }

    @RequestMapping(value="/{id}/delete", method = RequestMethod.DELETE)
    public String delete(@PathVariable String id) {
        userService.delete(id);
        return "redirect:/";
    }
}
