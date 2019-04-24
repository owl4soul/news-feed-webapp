package com.github.owl4soul.controllers;

import com.github.owl4soul.services.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CreateNewsController {
    private NewsService service = new NewsService();

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createNews() {
        return "news";
    }

}
