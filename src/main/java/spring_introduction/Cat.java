package spring_introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet{


    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Mew-Mew!");
    }

//    @PostConstruct
//    protected void init() {
//        System.out.println("Class Cat: init method");
//    }
//
//    @PreDestroy
//    private void destroy() {
//        System.out.println("Class Cat: destroy method");
//    }
}
