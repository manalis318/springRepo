package com.zensar.spring.performers;

/*Author: Manali Sharma
 *Creation Date: 27 Jul 2019 4:18PM IST
 *Modified Date: 27 Jul 2019 4:18PM IST
 *Version: 1.0
 *Copyright: Zensar Technologies. All rights reserved.
 *Description: It represents a performer of Zensar Idol Competition.
 *Juggler gets bean bags using constructor injection. 
 * */

public class Juggler implements Performer {
	private int beanBags;
	
	
	public Juggler() {
		// TODO Auto-generated constructor stub
		System.out.println("No-arg constructor of Juggler");
	}
	
	public Juggler(int beanBags) {
		super();
		this.beanBags= beanBags;
		System.out.println("Param constructor of Juggler");
	}
	
	public void perform(){
		System.out.println("Juggler juggling" + beanBags);
	}

}
