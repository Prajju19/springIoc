package com.skillsoft.auto;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarBeanConfig {

    @Bean
    public Car02 carBean() {

        Car02 car = new Car02();

        car.setType("Hatchback");
        car.setModel("Volkswagen GTI 2021");
        car.setPrice(33000);
        car.setCombinedFuelEconomy(26);

        return car;
    }

    @Bean(name = "engineVW")
    public Engine3 engine() {

        return new Engine3(228, 5000, 2.0f,
                "I-4", "premium unleaded");

    }
}