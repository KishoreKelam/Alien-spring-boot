package com.spring.h2.alien;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AutoConfiguration
public class AlienApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlienApplication.class, args);
	}

}
