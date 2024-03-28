package com.turkcell.spring.intro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Annotation ilgili yapıya bir özellik kazandırmak için kullanılır.
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
//ORM>Object Relation Mapping