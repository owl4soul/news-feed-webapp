package com.github.owl4soul.controllers;

import com.github.owl4soul.models.News;
import com.github.owl4soul.command.NewsForm;
import com.github.owl4soul.services.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;


@Controller
public class CreateNewsController {
    private NewsService service = new NewsService();

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView createNews() {
        ModelAndView result = new ModelAndView("/create");
        result.addObject("createForm", new NewsForm());
        return result;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView saveNewNews(NewsForm newsForm) {
        String name = newsForm.getName();
        String content = newsForm.getContent();
        String category = newsForm.getCategory();
        News news = new News(name, content, LocalDateTime.now(), category);
        service.saveNews(news);
        ModelAndView modelAndView = new ModelAndView("success");
        modelAndView.addObject("news", news);
        return modelAndView;
    }
}
