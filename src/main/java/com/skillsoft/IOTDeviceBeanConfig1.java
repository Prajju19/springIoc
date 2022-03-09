package com.skillsoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IOTDeviceBeanConfig1 {

    @Bean
    public IOTDevice IOTDeviceBeanOne() {
        return new IOTDevice();
    }
}
