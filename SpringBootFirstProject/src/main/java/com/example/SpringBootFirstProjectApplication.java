package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.training.example.Book;

@SpringBootApplication
@ComponentScan("com.training.example")
public class SpringBootFirstProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootFirstProjectApplication.class, args);
		System.out.println(ctx.getBean(Book.class));
	}
}
