package com.adrianenciu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("eating-diary")
public class EatingDiaryController {

    @RequestMapping("/")
    public String eatingDiary() {
        return "eating-diary";
    }

}
