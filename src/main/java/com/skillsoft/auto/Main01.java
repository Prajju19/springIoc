package com.skillsoft.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.skillsoft.auto.Car01;

public class Main01 {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext36.xml");

        Car01 newcar = (Car01) appContext.getBean("carBean");

        System.out.println("The car obtained from the Bean:\n" + newcar);
    }
}
