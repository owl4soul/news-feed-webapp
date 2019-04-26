package com.github.owl4soul.controllers;

import com.github.owl4soul.models.Category;
import com.github.owl4soul.models.News;
import com.github.owl4soul.models.NewsForm;
import com.github.owl4soul.services.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String saveNewNews(NewsForm newsForm, Model model) {
        String name = newsForm.getName();
        String content = newsForm.getContent();
        String category = newsForm.getCategory();
        System.out.println("n^ " + name + " and " + content + " and " + category); //todo: remove it later
        News news = new News(name, content, LocalDateTime.now(), Category.IT);
        model.addAttribute("news", news);
        service.saveNews(news);

        return "news";
    }

}
