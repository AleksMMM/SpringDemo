package springIntro;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {

    public Dog() {
        System.out.println("dog create");
    }

    @Override
    public void say() {
        System.out.println("way-way");
    }

}
