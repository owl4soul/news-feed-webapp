package com.github.owl4soul.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Spring controller
@Controller
public class MainController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

}
