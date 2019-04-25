package com.github.owl4soul;

import com.github.owl4soul.models.Category;
import com.github.owl4soul.models.News;
import com.github.owl4soul.services.NewsService;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NewsService service = new NewsService();

        News news = new News("Name from main", "Content from main", LocalDate.now(), Category.OTHER);
        service.saveNews(news);


        List<News> newsList = service.findAllNews();
        for (News n:newsList) {
            System.out.println(n);
        }

        News toDel = service.findNewsById(1);
        service.deleteNews(toDel);

        List<News> newsList2 = service.findAllNews();
        for (News n:newsList2) {
            System.out.println(n);
        }

    }
}
