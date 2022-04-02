package com.mvrsoftware.demo.springbootlogging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringBootLoggingApplication {

	final Logger LOGGER = LoggerFactory.getLogger(SpringBootLoggingApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoggingApplication.class, args);		
		
	}

	SpringBootLoggingApplication() {
		printSomeStuff();
	}

	public void printSomeStuff() {
		LOGGER.info("This is an INFO message");
		LOGGER.debug("This is a DEBUG message");
		LOGGER.warn("This is a WARN message");
		LOGGER.error("This is an ERROR message");
		LOGGER.trace("This is a TRACE message");
	}

}
