package com.adrianenciu.controller;

import com.adrianenciu.model.User;
import com.adrianenciu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public ModelAndView getUsers() {
        List<User> users = userService.getUsers();
        return new ModelAndView("users", "users", users);
    }
}
