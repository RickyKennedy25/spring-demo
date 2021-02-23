package com.learning.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService _fortuneService){
		fortuneService = _fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void doMyStartupStuff(){
		System.out.println("TrackCoach : inside method doMyStartupStuff");
	}

	public void doCleanupStuff(){
		System.out.println("TrackCoach : inside method doCleanupStuff");
	}
}
