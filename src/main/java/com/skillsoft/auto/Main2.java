package com.skillsoft.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.skillsoft.auto.Car1;

public class Main2 {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext32.xml");

        Car1 cars = (Car1) appContext.getBean("carBean");

        System.out.println("The car obtained from the Bean:\n" + cars);
    }
}
