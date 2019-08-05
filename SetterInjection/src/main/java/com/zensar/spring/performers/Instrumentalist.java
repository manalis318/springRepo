package com.zensar.spring.performers;

import com.zensar.spring.instruments.Instrument;

/*Author: Manali Sharma
 *Creation Date: 27 Jul 2019 5:37PM IST
 *Modified Date: 27 Jul 2019 5:37PM IST
 *Version: 1.0
 *Copyright: Zensar Technologies. All rights reserved.
 *Description: It is used to represent Instrumentalist of Zensar Idol Competition.
 * */

public class Instrumentalist implements Performer {
	
	private String song;
	private Instrument instrument;

	public void setSong(String song) {
		this.song = song;
		System.out.println("Song is set");
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("Instrument is set");
	}

	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist is playing "+song);
		instrument.play();

	}
	

}
