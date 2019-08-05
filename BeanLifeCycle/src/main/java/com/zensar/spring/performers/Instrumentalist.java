package com.zensar.spring.performers;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.zensar.spring.instruments.Instrument;

/*Author: Manali Sharma
 *Creation Date: 27 Jul 2019 5:37PM IST
 *Modified Date: 29 Jul 2019 2:30PM IST
 *Version: 2.0
 *Copyright: Zensar Technologies. All rights reserved.
 *Description: It is used to represent Instrumentalist of Zensar Idol Competition.
 * */

public class Instrumentalist implements Performer,BeanNameAware, BeanFactoryAware,ApplicationContextAware, InitializingBean,DisposableBean {
	
	private String song;
	private Instrument instrument;
	private String beanName;

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
		System.out.println("Instrumentalist "+beanName+" is playing "+song);
		instrument.play();

	}

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.beanName=name;
		System.out.println("Bean name is set");
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Spring Core IOC Container BeanFactory is set!");
	}

	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Spring Specialized IOC Container ApplicationContext is set!");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//instrument.tune();
		System.out.println("afterPropertiesSet is called!");
	}
	
	public void tuneInstrument(){
		instrument.tune();
		System.out.println("Custom init method");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//instrument.clean();
		System.out.println("destroy method is called!");
	}
	
	public void cleanInstrument(){
		instrument.clean();
		System.out.println("Custom destroy method");
	}

}
