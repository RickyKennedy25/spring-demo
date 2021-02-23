package com.learning.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args){
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		// call methods on the bean
		System.out.println("\n Pointing to same Object " + (theCoach == alphaCoach));
		//close the context
		System.out.println("\n Memory location for myCoach " + theCoach);

		System.out.println("\n Memory location for alphaCoach  " + alphaCoach);

		System.out.println(theCoach.getDailyFortune());
		context.close();
	}
}
