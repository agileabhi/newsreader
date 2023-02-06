package com.news.newsreader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;

import com.news.newsreader.configuration.DataSourceConfiguration;

@SpringBootApplication
@EntityScan("com.news.newsreader.model")
@Import(value= {DataSourceConfiguration.class})
public class NewsreaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsreaderApplication.class, args);
	}

}
