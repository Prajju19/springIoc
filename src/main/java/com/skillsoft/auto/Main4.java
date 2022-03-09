package com.skillsoft.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.skillsoft.auto.Car3;

public class Main4 {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext34.xml");

        Car3 newcar = (Car3) appContext.getBean("carBean");

        System.out.println("The car obtained from the Bean:\n" + newcar);
    }
}
