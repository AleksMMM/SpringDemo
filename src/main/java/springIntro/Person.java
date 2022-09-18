package springIntro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String surName;
    private int age;

    @Autowired
    @Qualifier("dog")
    private Pet pet;

    @Autowired
    public Person(Pet pet) {
        System.out.println("constructor created person");
        this.pet = pet;
    }

    public void setPet(Pet pet) {
        System.out.println("set pet-");
        this.pet = pet;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void callYourPet() {
        System.out.println("hello ");
        pet.say();
    }


}
