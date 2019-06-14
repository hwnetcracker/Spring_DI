package com.netcracker.spring_di.task5;
import com.netcracker.spring_di.model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config5.xml");

        Car car1=(Car)context.getBean("carNo");
        Car car2=(Car)context.getBean("carByName");
        Car car3=(Car)context.getBean("carByType");
        Car car4=(Car)context.getBean("carConstructor");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

    }
}