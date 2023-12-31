package com.example.JenkinsDemo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);

	@PostConstruct
	public void intt() {
		logger.info("Application Started...");
	}

	public static void main(String[] args) {
		logger.info("Application Executing...");
		SpringApplication.run(JenkinsDemoApplication.class, args);
		logger.info("Application Executed...");
	}

}
