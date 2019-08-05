package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
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
        Performer p=ctx.getBean("Tina Jain", Performer.class);
        p.perform();
        
        System.out.println();
        p=ctx.getBean("Meena", Performer.class);
        p.perform();
        
        System.out.println();
        p=ctx.getBean("Geeta", Performer.class);
        p.perform();
        
        System.out.println();
        p=ctx.getBean("Seema", Performer.class);
        p.perform();
        
        ConfigurableApplicationContext cfgctx=(ConfigurableApplicationContext) ctx;
        cfgctx.close();
    }
}
