package com.springdemo.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        //load Configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from the spring container
        Coach theCoach = context.getBean("myFootballCoach",Coach.class);

        //call some methods
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortune());
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeamName());

        //close the context
        context.close();
    }

}
