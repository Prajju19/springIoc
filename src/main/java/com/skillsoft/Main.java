package com.skillsoft;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

    public static void main(String[] args) {

        // Normal Java Object Construction
        IOTDevice1 myConstructedObject = new IOTDevice1();

        System.out.println("IOTDevice intialized with a construcor: " + myConstructedObject);

        // IoC container --> BeanFactory

        Resource resource = new ClassPathResource("applicationContext1.xml");

        BeanFactory beanFactory = new XmlBeanFactory(resource);

        IOTDevice1 myDeviceBean = (IOTDevice1) beanFactory.getBean("myIOTDeviceBean1");

        System.out.println("XmlBeanFactory(Deprecated) bean -- " + myDeviceBean);

    }
}
