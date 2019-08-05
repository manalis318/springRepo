package com.zensar.spring;

/*Author: Manali Sharma
 *Creation Date: 27 Jul 2019 
 *Modified Date: 27 Jul 2019
 *Copyright: Zensar Technologies. All rights reserved.
 *Description: This is Holi Greeting class. 
 * */

public class HoliGreeting implements Greeting{
	
	public HoliGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("HoliGreeting created!");
	}
	
	public String sayGreet(){
		return "Happy Holi!";
	}

}
