package com.github.owl4soul;

import com.github.owl4soul.models.Category;
import com.github.owl4soul.models.News;
import com.github.owl4soul.services.NewsService;
import com.github.owl4soul.utils.IterateAndSout;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NewsService service = new NewsService();

        //Creating new news and save it to database
        News news = new News("TEST", "Test content", LocalDateTime.now(), Category.SCIENCE);
        service.saveNews(news);

        service.updateNews(news);

        service.mergeNews(news, new News("Changed", "This news was changed", LocalDateTime.now(), Category.POLITICS));


        //System output all news stored in the database at the moment
        List<News> newsList = service.findAllNews();
        for (News n:newsList) {
            System.out.println(n);
        }

//        //Delete chosen news from database
//        News toDel = service.findNewsById(1);
//        service.deleteNews(toDel);

//        //System output all news corresponding to a given category
//        System.out.println("________________________________________________________");
//        System.out.println("System output all news corresponding to a given category");
//        List<News> selectedByCategory = service.findAllByCategory(Category.SCIENCE.name());
//        IterateAndSout.iterateAndSoutNews(selectedByCategory);
//
//
//        //System output all news named as argument
//        System.out.println("________________________________________________________");
//        System.out.println("System output all news named as argument");
//        List<News> selectedByName = service.findAllByName("Name from main");
//        IterateAndSout.iterateAndSoutNews(selectedByName);
//
//        //System output all news having a certain content
//        System.out.println("________________________________________________________");
//        System.out.println("System output all news having a certain content");
//        List<News> selectedByContent = service.findAllByContent("Content from main");
//        IterateAndSout.iterateAndSoutNews(selectedByContent);



    }
}
