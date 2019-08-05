package com.zensar.spring;

/*Author: Manali Sharma
 *Creation Date: 27 Jul 2019 
 *Modified Date: 27 Jul 2019
 *Copyright: Zensar Technologies. All rights reserved.
 *Description: This is Birthday Greeting class. 
 * */

public class BirthdayGreeting implements Greeting {
	
	public BirthdayGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("Birthday Greeting created!");
	}
	
	public String sayGreet(){
		return "Wish you a Happy Birthday!";
	}

}
