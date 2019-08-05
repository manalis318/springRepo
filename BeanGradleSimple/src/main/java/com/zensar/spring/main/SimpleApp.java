package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.simple.FestivalGreeting;

public class SimpleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context =new ClassPathXmlApplicationContext("greetings.xml");
		FestivalGreeting fg=context.getBean("festivalGreeting", FestivalGreeting.class);
		System.out.println(fg.sayGreet());
	}

}
