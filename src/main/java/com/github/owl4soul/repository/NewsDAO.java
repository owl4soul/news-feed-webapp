package com.github.owl4soul.repository;

import com.github.owl4soul.models.Category;
import com.github.owl4soul.models.News;
import com.github.owl4soul.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDateTime;
import java.util.List;

//Data access object
public class NewsDAO {

    public void save(News news) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(news);
        transaction.commit();
        session.close();
    }


    public void update(News news) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(news);
        tx1.commit();
        session.close();
    }

    public void merge(News news, News changed) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        String nameChanged = changed.getName();
        String contentChanged = changed.getContent();
        LocalDateTime dateChanged = changed.getDate();
        String categoryChanged = changed.getCategory();

        news.setName(nameChanged);
        news.setContent(contentChanged);
        news.setDate(dateChanged);
        news.setCategory(categoryChanged);
        session.merge(news);
        tx1.commit();
        session.close();
    }

    public void delete(News news) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(news);
        tx1.commit();
        session.close();
    }

    public News findNewsById(int id) {
        return HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession()
                .get(News.class, id);
    }

    public List<News> findAll() {
        List<News> listNews = HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession()
                .createQuery("from News", News.class)
                .list();
        return listNews;
    }

    public List<News> findAllByCategory(String categoryStr) {
        List<News> listNews = HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession()
                .createQuery( "from News n where n.category = :category", News.class)
                .setParameter("category", categoryStr)
                .list();
        return listNews;
    }
    public List<News> findAllByCategory(Category category) {
        String categoryStr = category.name();
        List<News> listNews = findAllByCategory(categoryStr);
        return listNews;
    }

    public List<News> findAllByName(String likeName) {
        List<News> listNews = HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession()
                .createQuery("from News n where n.name like concat('%', :name, '%') ", News.class)
                .setParameter("name", likeName)
                .list();
        return listNews;
    }

    public List<News> findAllByContent(String likeContent) {
        List<News> listNews = HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession()
                .createQuery("from News n where n.content like concat('%', :content, '%') ", News.class)
                .setParameter("content", likeContent)
                .list();
        return listNews;
    }

}
