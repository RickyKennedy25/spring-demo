package com.learning.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String [] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach the2Coach = context.getBean("myCoach2", Coach.class);
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout() + theCoach.getDailyFortune());

		System.out.println(the2Coach.getDailyWorkout() + the2Coach.getDailyFortune());

		//close the context
		context.close();
	}
}
