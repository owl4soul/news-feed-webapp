package com.github.owl4soul.services;

import com.github.owl4soul.models.News;
import com.github.owl4soul.repository.NewsDAO;

import java.util.List;

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

    public void deleteNews(News news) {
        newsDAO.delete(news);

    }

    public void updateNews(News news) {
        newsDAO.update(news);
    }

    public List<News> findAllNews() {
        return newsDAO.findAll();
    }

    public News findNewsById(int id) {
        return newsDAO.findNewsById(id);
    }

    public List<News> findAllByCategory(String category) {
        return newsDAO.findAllByCategory(category);
    }


}
