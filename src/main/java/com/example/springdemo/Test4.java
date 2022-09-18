package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springIntro.Dog;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextBeanScope.xml");

        Dog dog = context.getBean("myPet", Dog.class);
        Dog ourDog = context.getBean("myPet", Dog.class);

        System.out.println("сравнить объекты " + (dog.equals(ourDog)));

        context.close();

    }
}
