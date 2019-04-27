package com.github.owl4soul.controllers;

import com.github.owl4soul.services.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//Spring controller
@Controller
public class MainController {
    private NewsService service = new NewsService();

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

}
