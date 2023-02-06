package com.news.newsreader.model;


import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "news")
public class NewsData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "report")
	private String report;
	
	@OneToMany
	private Set<ArticleData> articleSet = new HashSet<>();
	
	/**
	 * @return the articleSet
	 */
	public Set<ArticleData> getArticleSet() {
		return articleSet;
	}
	/**
	 * @param articleSet the articleSet to set
	 */
	public void setArticleSet(Set<ArticleData> articleSet) {
		this.articleSet = articleSet;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the report
	 */
	public String getReport() {
		return report;
	}
	/**
	 * @param report the report to set
	 */
	public void setReport(String report) {
		this.report = report;
	}
	
}
