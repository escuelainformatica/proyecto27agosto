package com.example.project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.hateoas.HypermediaAutoConfiguration;
import org.springframework.hateoas.config.EnableHypermediaSupport;

//
//


@SpringBootApplication
@EnableAutoConfiguration(exclude = HypermediaAutoConfiguration.class) // <-- configuracion
@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL) // <-- configuracion
public class Project1Application {

	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);
	}

}
