package com.netcracker.spring_di.task3;
import com.netcracker.spring_di.model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config3.xml");

        Car parent=(Car)context.getBean("parent");
        Car child=(Car)context.getBean("child");

        System.out.println(parent);
        System.out.println(child);

    }
}