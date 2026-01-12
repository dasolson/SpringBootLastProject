package com.sist.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootLastProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLastProjectApplication.class, args);
	}
	/*@Bean
	public CommandLineRunner runner(GoogleGenAiChatModel model) {
		return args -> {
			String response = model.call("겨울여행");
			System.out.println(response);
		};
	}*/
}
