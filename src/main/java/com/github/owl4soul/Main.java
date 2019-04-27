package com.github.owl4soul;

import com.github.owl4soul.models.Category;
import com.github.owl4soul.models.News;
import com.github.owl4soul.services.NewsService;
import com.github.owl4soul.utils.IterateAndSout;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {

////        CONSOLE DEMO
//
//        NewsService service = new NewsService();
//
//        //Creating new news and save it to database
//        News news = new News("TEST", "Test content", LocalDateTime.now(), Category.SCIENCE);
//        News news1 = new News("New name", "New content", LocalDateTime.now(), Category.OTHER);
//
//        service.saveNews(news);
//
//        service.mergeNews(news, new News("Changed", "This news was changed", LocalDateTime.now(), Category.IT));
//
//        int id = news.getId();
//
//        //System output all news stored in the database at the moment
//        List<News> newsList = service.findAllNews();
//        for (News n:newsList) {
//            System.out.println(n);
//        }
//
//        //Delete chosen news from database
//        News toDel = service.findNewsById(id);
//        service.deleteNews(toDel);
//
//        //System output all news corresponding to a given category
//        System.out.println("________________________________________________________");
//        System.out.println("System output all news corresponding to a given category");
//        List<News> selectedByCategory = service.findAllByCategory(Category.SCIENCE);
//        IterateAndSout.iterateAndSoutNews(selectedByCategory);
//
//
//        //System output all news named as argument
//        System.out.println("________________________________________________________");
//        System.out.println("System output all news named as argument");
//        List<News> selectedByName = service.findAllByName("Changed");
//        IterateAndSout.iterateAndSoutNews(selectedByName);
//
//        //System output all news having a certain content
//        System.out.println("________________________________________________________");
//        System.out.println("System output all news having a certain content");
//        List<News> selectedByContent = service.findAllByContent("content");
//        IterateAndSout.iterateAndSoutNews(selectedByContent);
    }
}
