package com.skillsoft.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.skillsoft.auto.Car;

public class Main1 {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext31.xml");

        Car car = (Car) appContext.getBean("carBean");

        System.out.println("The car obtained from the Bean:\n" + car);
    }
}
