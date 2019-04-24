package com.github.owl4soul.repository;

import com.github.owl4soul.models.News;
import com.github.owl4soul.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;

//Data access object
public class NewsDAO {

    public void save(News news) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory()
    }
}
