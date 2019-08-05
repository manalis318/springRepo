package com.zensar.spring.performers;

import com.zensar.spring.poems.Poem;

/*Author: Manali Sharma
 *Creation Date: 27 Jul 2019 4:50PM IST
 *Modified Date: 27 Jul 2019 4:50PM IST
 *Version: 1.0
 *Copyright: Zensar Technologies. All rights reserved.
 *Description: More skilled people who juggles which reciting a poem.
 *Poem is injected into PoeticJuggler using constructor injection.
 * */

//Dependent object class
public class PoeticJuggler extends Juggler {
	
	//It is a dependency object reference
	private Poem poem;
	
	public PoeticJuggler() {
		// TODO Auto-generated constructor stub
		System.out.println("No-arg constructor of PoeticJuggler");
	}

	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
		System.out.println("Param constructor of PoeticJuggler");
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		super.perform();
		System.out.println(" while reciting a peom...");
		poem.recite();
	}

}
