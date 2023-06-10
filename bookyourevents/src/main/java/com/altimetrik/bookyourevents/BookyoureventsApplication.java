package com.altimetrik.bookyourevents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.altimetrik.bookyourevents.repository")
public class BookyoureventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookyoureventsApplication.class, args);
	}

}
