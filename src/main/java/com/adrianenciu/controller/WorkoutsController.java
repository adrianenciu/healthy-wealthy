package com.adrianenciu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("workouts")
public class WorkoutsController {

    @RequestMapping("/")
    public String workouts() {
        return "workouts";
    }

}
