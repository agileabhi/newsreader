package com.news.newsreader.DAO;

import java.util.List;

import com.news.newsreader.model.NewsData;

public interface NewsDAO {

	public List<NewsData> getNews();

	public void saveCustomer(NewsData newsData);

	public NewsData getNews(int theId);

	public void deleteNews(int theId);

}
