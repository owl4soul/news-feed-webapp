package com.github.owl4soul;

import com.github.owl4soul.models.Category;
import com.github.owl4soul.models.News;
import com.github.owl4soul.services.NewsService;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NewsService service = new NewsService();

        //Creating new news and save it to database
        News news = new News("Name from main", "Content from main", LocalDateTime.now(), Category.IT);
        service.saveNews(news);


        //System output all news stored in the database at the moment
        List<News> newsList = service.findAllNews();
        for (News n:newsList) {
            System.out.println(n);
        }

//        //Delete chosen news from database
//        News toDel = service.findNewsById(1);
//        service.deleteNews(toDel);

        //System output all news corresponding to a given category
        List<News> newsList2 = service.findAllByCategory(Category.IT.name());
        Iterator it = newsList2.iterator();
        int counter = 0;
        while (it.hasNext()) {
            counter++;
            Object[] newss = (Object[]) it.next();
            Integer id = Integer.parseInt(String.valueOf(newss[0]));
            String name = String.valueOf(newss[1]);
            String content = String.valueOf(newss[2]);
            String date = String.valueOf(newss[3]);
            String category = String.valueOf(newss[4]);
            System.out.println("# " + counter + ". >> " + id + " | " + name + " | " + content + " | " + date + " | " + category);
        }

    }
}
