package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	/*@Autowired //opcjonalny
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}*/
	
	// default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	// define a setter method
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService");
		this.fortuneService = fortuneService;
	}*/
	
	@Autowired
	public void dupaKonia() {
		System.out.println(">> TennisCoach: dupaKonia");
		//this.fortuneService = fortuneService;
	}
	
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
