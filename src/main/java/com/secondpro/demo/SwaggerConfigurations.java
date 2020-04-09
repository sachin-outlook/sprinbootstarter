package com.secondpro.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.models.Contact;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfigurations {
	
	@Bean
	public Docket swaggerConfiguration(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/**"))
				.apis(RequestHandlerSelectors.basePackage("com.secondpro.demo"))
				.build()
				.apiInfo(apiInfo());
	}
	
	
	@SuppressWarnings("deprecation")
	private ApiInfo apiInfo(){
		return new ApiInfo("Employee API", 
				"RestAPI for Employees", "1.0.1", "Tearms", "Contact", "", "licence URL");
	}
	
//	private ApiInfo apiInfo() {
//        return new ApiInfo("Social API", "Soccial api for gamerz zone.", "API TOS", "Terms of service",
//                new Contact("yali", "www.social.com", "prg@gmail.com"), "License of API",
//                "API license URL");
//    }

}
