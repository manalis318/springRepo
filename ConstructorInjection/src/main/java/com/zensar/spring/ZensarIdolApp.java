package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

/**
 * Hello world!
 *
 */
public class ZensarIdolApp 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("performers.xml");
        Performer p=ctx.getBean("Soni", Performer.class);
        p.perform();
        
        System.out.println();
        Performer p1=ctx.getBean("Roni", Performer.class);
        p1.perform();
    }
}
