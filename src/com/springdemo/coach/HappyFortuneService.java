package com.springdemo.coach;

public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "You will have a great day";
    }
}
