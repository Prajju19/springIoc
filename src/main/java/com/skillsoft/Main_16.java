package com.skillsoft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_16 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext4.xml");

        System.out.println("\nAbout to retrieve the instantiated beans...\n");
        IOTDevice3 myFirstDeviceBean = (IOTDevice3) appContext.getBean("FridgeBean");
        IOTDevice3 mySecondDeviceBean = (IOTDevice3) appContext.getBean("DishwasherBean");


        System.out.println("First Bean: " + myFirstDeviceBean);
        System.out.println("Second Bean: " + mySecondDeviceBean);

        appContext.close();
    }
}
