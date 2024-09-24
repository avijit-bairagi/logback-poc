package com.zoro.logz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class LogzApplication {

	private static final Logger logger = LoggerFactory.getLogger(LogzApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LogzApplication.class, args);
		logger.info("LogzApplication started at {}", new Date());
	}

}
