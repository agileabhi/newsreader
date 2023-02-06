package com.news.newsreader.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.news.newsreader.DAO.NewsDAO;
import com.news.newsreader.model.NewsData;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Repository
public class NewsDAOImpl implements NewsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<NewsData> getNews() {
		//Session session = sessionFactory.openSession();

		// List<NewsData> newsDetails = session.createQuery("select h from NewsData as
		// h").list();

		List<NewsData> newsDetails = new ArrayList<>();

		Session session = sessionFactory.getCurrentSession();
		
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<NewsData> cq = cb.createQuery(NewsData.class);
		Root<NewsData> root = cq.from(NewsData.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		newsDetails = query.getResultList();
		
		//session.close();

		return newsDetails;
	}

	@Override
	public void saveCustomer(NewsData newsData) {
		// TODO Auto-generated method stub

	}

	@Override
	public NewsData getNews(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteNews(int theId) {
		// TODO Auto-generated method stub

	}

}
