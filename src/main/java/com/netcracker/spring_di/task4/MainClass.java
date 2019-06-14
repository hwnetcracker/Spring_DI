package com.netcracker.spring_di.task4;
import com.netcracker.spring_di.model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config4.xml");

        Car car=(Car)context.getBean("Lada");

        System.out.println(car);

    }
}