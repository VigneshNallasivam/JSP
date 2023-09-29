package com.spring.jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.jsp")
public class JspApplication {

	public static void main(String[] args) {
		SpringApplication.run(JspApplication.class, args);
	}

}
