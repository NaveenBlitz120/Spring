package com.springdemo.coach;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    //add new private fields
    private String emailAddress;
    private String teamName;

    public void setFortuneService(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 25 minutes on penalty practice";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune()+" dribbling past players";
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String getTeamName() {
        return teamName;
    }


}
