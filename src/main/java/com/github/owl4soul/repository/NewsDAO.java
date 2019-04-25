package com.github.owl4soul.repository;

import com.github.owl4soul.models.News;
import com.github.owl4soul.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
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

    public List<News> findAllByCategory(String category) {
        List<News> listNews = (List<News>)HibernateSessionFactoryUtil.getSessionFactory().openSession().createNativeQuery("select * from userdatabase.public.news where public.news.category_news='IT';").list();
        return listNews;
    }

    public List<News> findAll() {
        List<News> listNews = (List<News>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From News").list();
        return listNews;
    }

}
