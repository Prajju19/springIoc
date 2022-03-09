package com.skillsoft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_15 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext2.xml");

        System.out.println("\nAbout to retrieve the instantiated beans...\n");
        IOTDevice2 myFirstDeviceBean = (IOTDevice2) appContext.getBean("FridgeBean");
        IOTDevice2 mySecondDeviceBean = (IOTDevice2) appContext.getBean("DishwasherBean");

        myFirstDeviceBean.setDevice("Fridge");
        myFirstDeviceBean.setDescription("Temperature gauge for the freezer");

        mySecondDeviceBean.setDevice("Dishwasher");
        mySecondDeviceBean.setDescription("Monitors water flow");

        System.out.println("First Bean: " + myFirstDeviceBean);
        System.out.println("Second Bean: " + mySecondDeviceBean);

        appContext.close();
    }
}
