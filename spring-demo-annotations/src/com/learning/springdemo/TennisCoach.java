package com.learning.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach{

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println(">> TennisCoach : inside default Constructor");
	}

//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println(">> TennisCoach : inside default setFortuneService()");
//		this.fortuneService = fortuneService;
//	}

	//define my init method
	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println(">> TennisCoach: inside of doMyStartupStuff");
	}

	//defing my destroy method
	@PreDestroy
	public void doCleanupStuff(){
		System.out.println(">> TennisCoach: inside of doCleanStuff");
	}
}
