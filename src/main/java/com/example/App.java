package com.example;

import car.example.constructor.injection.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationLooseCoupling.xml");
        DatabaseProvider cloudProvider = (DatabaseProvider) context.getBean("myServer");
        cloudProvider.getConnection();
    }
}
