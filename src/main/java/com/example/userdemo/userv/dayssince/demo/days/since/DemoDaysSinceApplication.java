package com.example.userdemo.userv.dayssince.demo.days.since;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoDaysSinceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDaysSinceApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}