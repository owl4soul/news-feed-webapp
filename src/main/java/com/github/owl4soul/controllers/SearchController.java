package com.github.owl4soul.controllers;

import com.github.owl4soul.services.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SearchController {
    private NewsService service = new NewsService();

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView showSearch() {
        ModelAndView result = new ModelAndView("search");
        return result;
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public ModelAndView showFilteredNews(@RequestParam("button") String button,
                                         @RequestParam(required = false, name = "input") String input,
                                         @RequestParam(required = false, name = "category") String category) {
        ModelAndView result = new ModelAndView("/result");
        if (button.equals("byName")) {
            result.addObject("filteredList", service.findAllByName(input));
            result.addObject("input", input);
        } else if (button.equals("byContent")) {
            result.addObject("filteredList", service.findAllByContent(input));
            result.addObject("input", input);
        } else if (button.equals("byCategory")) {
            result.addObject("filteredList", service.findAllByCategory(category));
            result.addObject("category", category);
        }
        result.addObject("button", button);
        return result;
    }
}