package com.skillsoft.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.skillsoft.auto.Car31;

public class Main31 {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext37.xml");

        Car31 newcar = (Car31) appContext.getBean("carBean");

        System.out.println("The car obtained from the Bean:\n" + newcar);
    }
}
