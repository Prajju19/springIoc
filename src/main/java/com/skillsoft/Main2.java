package com.skillsoft;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

    public class Main2 {

        public static void main(String[] args) {

            Resource resource = new ClassPathResource("applicationContext1.xml");
            //DefaultListableBeanFactory beanFactory1 = new DefaultListableBeanFactory();

            BeanDefinitionRegistry beanFactory = new DefaultListableBeanFactory();
            XmlBeanDefinitionReader beanReader = new XmlBeanDefinitionReader(beanFactory);
            beanReader.loadBeanDefinitions(resource);
           // IOTDevice myDeviceBean1 = (IOTDevice) beanFactory1.getBean("myIOTDeviceBean");
           // System.out.println("XmlBeanFactory(Deprecated) bean -- " + myDeviceBean1);

           IOTDevice1 myDeviceBean = (IOTDevice1) ((DefaultListableBeanFactory) beanFactory)
                   .getBean("myIOTDeviceBean1");

            System.out.println("Bean from BeanDefinitionRegistry -- " + myDeviceBean);

        }
    }

