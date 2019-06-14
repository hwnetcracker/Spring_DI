package com.netcracker.spring_di.task6;
import com.netcracker.spring_di.model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config6.xml");

        Car priora=(Car)context.getBean("Priora");
        Car vesta=(Car)context.getBean("Vesta");

        System.out.println(priora);
        System.out.println(vesta);

    }
}