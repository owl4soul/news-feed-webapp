package com.github.owl4soul.controllers;

import com.github.owl4soul.models.News;
import com.github.owl4soul.models.NewsForm;
import com.github.owl4soul.services.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@Controller
public class EditNewsController {
    private NewsService service = new NewsService();

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView showEditForm(@RequestParam(required = false, name = "editId", value = "editId") String editId, Model map) {
        map.addAttribute("editId", editId);
        System.out.println(editId);
        int id = Integer.parseInt(editId);
        News news = service.findNewsById(id);
        String name = news.getName();
        String content = news.getContent();
        LocalDateTime date = news.getDate();
        String category = news.getCategory();
        ModelAndView result = new ModelAndView("/edit");
        result.addObject("newsForm", new NewsForm());
        result.addObject("editId", editId);
        result.addObject("name", name);
        result.addObject("content", content);
        result.addObject("category", category);

        return result;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editNews(NewsForm newsForm, Model model) {
        String name = newsForm.getName();
        String content = newsForm.getContent();
        String category = newsForm.getCategory();
        News news = new News(name, content, LocalDateTime.now(), category);
        model.addAttribute("news", news);
        service.updateNews(news);

        return "list";
    }
}
