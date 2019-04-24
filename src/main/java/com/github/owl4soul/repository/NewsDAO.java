package com.github.owl4soul.repository;

import com.github.owl4soul.models.News;
import com.github.owl4soul.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

//Data access object
public class NewsDAO {

    public void save(News news) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(news);
        transaction.commit();
        session.close();
    }
}
