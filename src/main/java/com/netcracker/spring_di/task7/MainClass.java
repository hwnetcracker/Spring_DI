package com.netcracker.spring_di.task7;
import com.netcracker.spring_di.model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config7.xml");

        Garage garage=(Garage)context.getBean("Lookup");

        System.out.println(garage.virtualConctructor());

    }
}