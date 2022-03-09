package com.skillsoft.auto;


import com.skillsoft.auto.CarBeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.skillsoft.auto.Car;

public class Main02 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(CarBeanConfig.class);

        Car02 newcar = (Car02) appContext.getBean("carBean");

        System.out.println("The car obtained from the Bean:\n" + newcar);
    }
}
