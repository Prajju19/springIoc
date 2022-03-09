package com.skillsoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main_1 {

    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(IOTDeviceBeanConfig.class);

        IOTDevice myFirstDeviceBean =  (IOTDevice) appContext.getBean("IOTDevice");

        myFirstDeviceBean.setDevice("Fridge");
       myFirstDeviceBean.setDescription("Temperature gauge for the freezer");

        System.out.println("First Bean: " + myFirstDeviceBean);
    }
}