package com.yhbtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RabbitmqHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqHelloApplication.class, args);
	}

	@Bean
	public Sender sender(){
		return  new Sender();
	}
}
