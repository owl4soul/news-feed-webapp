package com.github.owl4soul.controllers;

import com.github.owl4soul.models.Category;
import com.github.owl4soul.models.News;

import com.github.owl4soul.services.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDateTime;

//Spring controller
@Controller
public class MainController {
    private NewsService service = new NewsService();

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public String saveNews(Model model) {
        model.addAttribute("news", new News("This is name", "This is content", LocalDateTime.now(), Category.IT));
        service.saveNews(new News("This is name", "This is content", LocalDateTime.now(), Category.IT));
        return "list";
    }

}
