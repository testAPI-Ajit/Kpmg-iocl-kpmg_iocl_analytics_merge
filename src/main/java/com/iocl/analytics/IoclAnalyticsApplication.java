package com.iocl.analytics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class IoclAnalyticsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IoclAnalyticsApplication.class, args);
		System.out.println("------------------Main class---------------");
	}

}