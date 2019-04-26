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
        news.setName("ABRACADABRA");
        news.setCategory(Category.OTHER);
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
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(News.class, id);
    }

    public List<News> findAll() {
        List<News> listNews = (List<News>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From News").list();
        return listNews;
    }

    public List<News> findAllByCategory(String category) {
        String hql = "select * from userdatabase.public.news where public.news.category_news='" + category + "'";
        List<News> listNews = (List<News>)HibernateSessionFactoryUtil.getSessionFactory().openSession().createNativeQuery(hql).list();
        return listNews;
    }

    public List<News> findAllByName(String name) {
        String hql = "select * from userdatabase.public.news where public.news.name_news='" + name + "'";
        List<News> listNews = (List<News>)HibernateSessionFactoryUtil.getSessionFactory().openSession().createNativeQuery(hql).list();
        return listNews;
    }

    public List<News> findAllByContent(String content) {
        String hql = "select * from userdatabase.public.news where public.news.content_news='" + content + "'";
        List<News> listNews = (List<News>)HibernateSessionFactoryUtil.getSessionFactory().openSession().createNativeQuery(hql).list();
        return listNews;
    }

}
