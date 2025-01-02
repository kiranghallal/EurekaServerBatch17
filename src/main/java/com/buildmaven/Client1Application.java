package com.buildmaven;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.buildmaven.addition.Sum;


@SpringBootApplication
public class Client1Application {

	public static void main(String[] args) {
		SpringApplication.run(Client1Application.class, args);
		

				Sum sum = new Sum();
		
		System.out.println(sum.addTwoNum(10, 45));
	}

}
