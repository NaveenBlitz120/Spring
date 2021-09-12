package com.springdemo.coach;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "spend 30 minutes on batting practice";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getEmailAddress() {
        return null;
    }

    @Override
    public String getTeamName() {
        return null;
    }
}
