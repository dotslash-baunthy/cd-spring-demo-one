package com.akshitbaunthy.springdemo;

public class TrackCoach implements Coach {

    TrackCoach() {

    }

    FortuneService fortuneService;
    TrackCoach (FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k.";
    }

    @Override
    public String getDailyFortune() {
        return "Nahin mila but "+fortuneService.getFortune();
    }
}
