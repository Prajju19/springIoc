package com.skillsoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main4 {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext1.xml");

        IOTDevice1 myFirstDeviceBean = (IOTDevice1) appContext.getBean("myIOTDeviceBean1");
        IOTDevice1 mySecondDeviceBean = (IOTDevice1) appContext.getBean("myIOTDeviceBean2");

        myFirstDeviceBean.setDevice("Fridge");
        myFirstDeviceBean.setDescription("Temperature gauge for the freezer");

        mySecondDeviceBean.setDevice("Dishwasher");
        mySecondDeviceBean.setDescription("Monitors water flow");

        System.out.println("First Bean: " + myFirstDeviceBean);
        System.out.println("Second Bean: " + mySecondDeviceBean);
    }
}