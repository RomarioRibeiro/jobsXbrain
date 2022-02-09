package com.jobs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jobs.domain.Produto;
import com.jobs.domain.Vendedor;

@SpringBootApplication
public class JobsXbrainApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobsXbrainApplication.class, args);
		
		
	Produto produto = new Produto(1, "mouse", null);
		
		
		
	}

}
