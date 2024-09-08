package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Cat myCat = context.getBean("myPet", Cat.class);
        Cat yourCat = context.getBean("myPet", Cat.class);

//        System.out.println("Переменные ссылаются на один и тот же объект? " + (myCat == yourCat));
//        System.out.println(myCat);
//        System.out.println(yourCat);

//        myCat.setName("Belka");
//        yourCat.setName("Strelka");
//
//        System.out.println(myCat.getName());
//        System.out.println(yourCat.getName());

        context.close();
    }

}
