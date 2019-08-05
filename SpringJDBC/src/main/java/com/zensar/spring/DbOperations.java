package com.zensar.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.business.ProductService;

/**
 * Hello world!
 *
 */
public class DbOperations 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("dbconfig.xml");
        Product product=new Product(1005,"LED","Samsung",32000.00f);
        ProductService service=ctx.getBean("productServiceImpl",ProductService.class);
       
        
        
        
        
        
        service.create(product);
        
        product=service.findProductById(1006);
        System.out.println(product);
        
        Product product1=new Product(1007,"Washing Machine","LG",24000.00f);
        service.edit(product1);
        
        Product product2=new Product();
        product2.setProductId(1007);
        service.remove(product2);
        
        List<Product> productList=service.findAllProducts();
        for(Product p:productList)
        	System.out.println(p);
        
       // System.out.println(service.findAllProducts());
       
    }
}
