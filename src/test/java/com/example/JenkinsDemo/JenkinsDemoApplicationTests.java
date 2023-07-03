package com.example.JenkinsDemo;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDemoApplicationTests {

	public static Logger logger = (Logger) LoggerFactory.getLogger(JenkinsDemoApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test Executing ..... ");
	}

}
