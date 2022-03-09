package com.skillsoft.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.skillsoft.auto.Car2;

public class Main3 {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext33.xml");

        Car2 cars = (Car2) appContext.getBean("carBean");

        System.out.println("The car obtained from the Bean:\n" + cars);
    }
}

