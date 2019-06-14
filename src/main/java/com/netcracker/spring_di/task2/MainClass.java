package com.netcracker.spring_di.task2;
import com.netcracker.spring_di.model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config2.xml");

        Garage garage2=(Garage)context.getBean("SIGarage");

        System.out.println(garage2.getCarList());
        System.out.println(garage2.getCarMap());
        System.out.println(garage2.getCarSet());







    }
}