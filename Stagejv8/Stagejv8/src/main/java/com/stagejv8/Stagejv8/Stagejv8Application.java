package com.stagejv8.Stagejv8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories (basePackages = "com.stagejv8.Stagejv8.Repository")
public class Stagejv8Application   {

	public static void main(String[] args) {
		SpringApplication.run(Stagejv8Application.class, args);
	}

}
