package com.stschool.springdi;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Product product = context.getBean("1",Product.class);
        System.out.println(product);
    }

}
