package com.learning.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		boolean isSameBean = (theCoach == alphaCoach);

		System.out.println("\nPointing to the same object: " + isSameBean);

		System.out.println("\nWhere the coach is save " + theCoach);

		System.out.println("\nWhere alpha coach is save " + alphaCoach);

		context.close();
	}
}
