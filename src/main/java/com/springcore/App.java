package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.beans.factory.BeanFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//here we create application context (bean factory) as we create  session factory
    	ApplicationContext ac= new ClassPathXmlApplicationContext("spring.xml"); // setting the path class path for the bean
    	school sc=(school)ac.getBean(school.class); //object
    	sc.greeting();
    }
}
