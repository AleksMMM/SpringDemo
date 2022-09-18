package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springIntro.Cat;
import springIntro.Person;

public class ConfigThisAnnotetion {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextAnnotetion.xml");

//        Cat myCat = context.getBean("catBean", Cat.class);
//        myCat.say();
        Person person = context.getBean("person", Person.class);
        person.callYourPet();

        context.close();
    }
}