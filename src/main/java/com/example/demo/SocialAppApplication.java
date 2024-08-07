package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SocialAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialAppApplication.class, args);
		System.out.println("We are at root");
	}
}
