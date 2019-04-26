package com.github.owl4soul.controllers;

import com.github.owl4soul.services.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListNewsController {
    private NewsService service = new NewsService();

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView showListNews() {
        ModelAndView result = new ModelAndView("/list");
        result.addObject("listNews", new NewsService().findAllNews());
        return result;
    }
}
