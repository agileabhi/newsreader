package com.news.newsreader.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.news.newsreader.model.NewsData;
import com.news.newsreader.service.NewsService;

@RestController
@RequestMapping("/")
public class NewsController {

	
	private NewsService newsService;
	
	@Autowired
	private void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}

	@GetMapping("/getNewsDetails")
	public List<NewsData> getNewsDetails() {

		return newsService.getNewsDetails();
	}
}
