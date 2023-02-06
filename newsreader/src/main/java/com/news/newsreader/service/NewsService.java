package com.news.newsreader.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.news.newsreader.DAO.NewsDAO;
import com.news.newsreader.model.NewsData;

@Service
@Transactional
public class NewsService {

	private NewsDAO newsDAO;
	
	@Autowired
	private void setNewsDAO(NewsDAO newsDAO) {
		this.newsDAO = newsDAO;
	}

	public List<NewsData> getNewsDetails() {

		return newsDAO.getNews();
	}
}
