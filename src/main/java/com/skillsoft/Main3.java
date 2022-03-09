package com.skillsoft;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext1.xml");

        IOTDevice1 myDeviceBean = (IOTDevice1) appContext.getBean("myIOTDeviceBean1");
        myDeviceBean.setDevice("fridge");
        myDeviceBean.setDescription("temperature guage for the freger");

        System.out.println("Bean from ApplicationContext:\n" + myDeviceBean);

    }
}
