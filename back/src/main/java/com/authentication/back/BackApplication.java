package com.authentication.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackApplication.class, args);
	}

}
