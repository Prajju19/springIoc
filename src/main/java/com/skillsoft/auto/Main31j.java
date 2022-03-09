package com.skillsoft.auto;

import com.skillsoft.auto.CarBeanConfig31;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.skillsoft.auto.Car31;

public class Main31j {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(CarBeanConfig31.class);

        Car31 newcar = (Car31) appContext.getBean("carBean");

        System.out.println("The car obtained from the Bean:\n" + newcar);
    }
}
