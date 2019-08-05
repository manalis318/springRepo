package com.zensar.spring.poems;

/*Author: Manali Sharma
 *Creation Date: 27 Jul 2019 4:18PM IST
 *Modified Date: 27 Jul 2019 4:18PM IST
 *Version: 1.0
 *Copyright: Zensar Technologies. All rights reserved.
 *Description: It represents a BaBaBlackSheep peom. 
 * */

public class BaBaBlackSheep implements Poem {
	
	private final static String LINES[]={
			"Ba Ba black sheep have you any wool?",
			"Yes sir yes sir three bags full!",
			"One for my master one for my dame",
			"And one for the little boy who lives down the lane!!"
	};

	public void recite() {
		// TODO Auto-generated method stub
		for(String line: LINES)
			System.out.println(line);
	}

}
