package com.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitExampleApplication.class, args);
		
		
		System.out.println("this is git example");
		
		System.out.println("This is the third commit");
		
	}

}
