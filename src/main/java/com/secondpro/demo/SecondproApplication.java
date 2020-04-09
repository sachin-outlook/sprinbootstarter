package com.secondpro.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
//@ComponentScan( excludeFilters=@ComponentScan.Filter(type=FilterType.ANNOTATION,classes = HelloController.class))
public class SecondproApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondproApplication.class, args);
	}

}
