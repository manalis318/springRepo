package com.zensar.spring.instruments;

/*Author: Manali Sharma
 *Creation Date: 27 Jul 2019 5:30PM IST
 *Modified Date: 29 Jul 2019 2:49PM IST
 *Version: 2.0
 *Copyright: Zensar Technologies. All rights reserved.
 *Description: It is used to represent an instrument guitar.
 * */

public class Guitar implements Instrument {

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Ting ting ting...");
	}

	public void tune() {
		// TODO Auto-generated method stub
		System.out.println("Guitar is tuned!");
	}

	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("Guitar is clean!");
	}

}
