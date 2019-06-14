package com.netcracker.spring_di.task1;

import com.netcracker.spring_di.model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config1.xml");

        Car car1=(Car)context.getBean("CICar");
        Car car2=(Car)context.getBean("SICar");

        System.out.println(car1);
        System.out.println(car2);


    }
}