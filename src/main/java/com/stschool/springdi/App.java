package com.stschool.springdi;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Product product1 = context.getBean("1",Product.class);
      /*  System.out.println(product1);
        Product product2 = context.getBean("2",Product.class);
        System.out.println(product2);*/
        Order order1 = context.getBean("order1",Order.class);
        System.out.println(order1);
    }

}
