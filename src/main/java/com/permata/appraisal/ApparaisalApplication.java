package com.permata.appraisal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ApparaisalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApparaisalApplication.class, args);
	}

}
