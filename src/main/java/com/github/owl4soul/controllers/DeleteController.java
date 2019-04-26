package com.github.owl4soul.controllers;

import com.github.owl4soul.services.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DeleteController {
    private NewsService service = new NewsService();

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ModelAndView delete(@RequestParam("editId") String editId) {
        int id = Integer.parseInt(editId);
        service.deleteNews(service.findNewsById(id));
        ModelAndView result = new ModelAndView("success");
        return result;

    }


}
