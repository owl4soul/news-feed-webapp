package com.github.owl4soul.controllers;

import com.github.owl4soul.models.News;
import com.github.owl4soul.services.NewsService;
import com.github.owl4soul.utils.IterateAndSout;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SearchController {
    private NewsService service = new NewsService();

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView showSearch() {
        ModelAndView result = new ModelAndView("search");
//        result.addObject("filteredList", new NewsService().findAllNews());
        return result;
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public ModelAndView showFilteredNews(@RequestParam("button") String button,
                                         @RequestParam(required = false, name = "input") String input) {
        ModelAndView result = new ModelAndView("/result");
        if (button.equals("byName")) {
            result.addObject("filteredList", service.findAllByName(input));
        } else if (button.equals("byContent")) {
            result.addObject("filteredNews", service.findAllByContent(input));
        } else if (button.equals("byCategory")) {
            result.addObject("filteredNews", service.findAllByCategory(input));
        }

        return result;
    }

}