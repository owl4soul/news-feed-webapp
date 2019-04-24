package com.github.owl4soul.services;

import com.github.owl4soul.models.News;
import com.github.owl4soul.repository.NewsDAO;

//Business logic
public class NewsService {
    private NewsDAO newsDAO = new NewsDAO();

    public NewsService() {
    }

    public NewsService(NewsDAO newsDAO) {
        this.newsDAO = newsDAO;
    }

    public void saveNews(News news) {
        newsDAO.save(news);
    }
}
