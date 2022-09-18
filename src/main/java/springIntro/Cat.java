package springIntro;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet {

    public Cat() {
        System.out.println("конструктор по умолчанию кошка");
    }

    @Override
    public void say() {
        System.out.println("may - may");
    }
}
