package com.more.mc.springbootstruts2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.more.mc")
public class SpringBootStruts2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStruts2Application.class, args);
	}

}
