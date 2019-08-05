package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component
("budday")
public class BirthdayGreeting implements Greeting {
	
	public BirthdayGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("Birthday greeting created!!");
	}

	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happieeeeeee Birthdayyyyyy to youuuuu!!!";
	}

}
