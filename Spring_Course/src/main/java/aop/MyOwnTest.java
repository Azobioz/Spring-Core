package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyOwnTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        MyConfig config = context.getBean("myConfig", MyConfig.class);

    }
}
