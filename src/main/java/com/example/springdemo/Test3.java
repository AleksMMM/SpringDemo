package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springIntro.Dog;
import springIntro.Person;
import springIntro.Pet;

public class Test3 {

    public static void main(String[] args) {
//        Pet pet = new Dog();
//        Person person = new Person(pet);
//        person.callYourPet();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        System.out.println(person.getSurName());
        System.out.println(person.getAge());

        context.close();


    }
}
