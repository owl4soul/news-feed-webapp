package com.github.owl4soul.utils;

import com.github.owl4soul.models.News;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

public class IterateAndSout {
    public static void iterateAndSoutNews(List<News> list) {
        Iterator<News> it = list.iterator();
        int counter = 0;
        while (it.hasNext()) {
            counter++;
            News currentNews = it.next();
            System.out.println("# " + counter + ". >> " + currentNews);
        }
    }
}
