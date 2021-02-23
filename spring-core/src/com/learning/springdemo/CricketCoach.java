package com.learning.springdemo;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;

	private String emailAddress;

	private String team;

	public CricketCoach(){
		System.out.println("Cricket Coach: inside no-arg-constructor");
	}
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: inside setter method - set FortuneService");

		this.fortuneService = fortuneService;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket Coach: inside setter method - set Email Address");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Cricket Coach: inside setter method - set Team");
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}
}
