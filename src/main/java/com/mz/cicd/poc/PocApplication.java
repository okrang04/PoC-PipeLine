package com.mz.cicd.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PocApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocApplication.class, args);
		//Servicenow webhook test
		System.out.println("SCRUM-13 테스트3");
	}

}
