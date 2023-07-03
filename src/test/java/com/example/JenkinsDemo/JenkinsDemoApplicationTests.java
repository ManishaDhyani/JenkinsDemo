package com.example.JenkinsDemo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDemoApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsDemoApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test Executing ..... ");
	}

}
