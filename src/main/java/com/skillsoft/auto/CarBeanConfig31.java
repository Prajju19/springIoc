package com.skillsoft.auto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Configuration
public class CarBeanConfig31 {

    @Bean
    public Car31 carBean() {

        Car31 car = new Car31();

        ArrayList<String> notes = new ArrayList<>();
        notes.add("Internal combustion engine");
        notes.add("3-year service included");

        car.setType("Sedan");
        car.setModel("BMW 740 2021");
        car.setPrice(88000);
        car.setCombinedFuelEconomy(25);
        car.setNotes(notes);

        return car;
    }

    @Bean(name = "engineBMW")
    public Engine3 engine() {

        return new Engine3(335, 5500, 3.0f,
                "I-6", "premium unleaded");
    }

    @Bean(name = "gearboxBMW")
    public Gearbox31 gearbox() {

        Gearbox31 myGearbox = new Gearbox31();
        myGearbox.setType("Shiftable Automatic");
        myGearbox.setNumGears(8);

        return myGearbox;
    }

    @Bean(name = "seatOptionOne")
    public Seats31 seatOne(){

        Seats31 seatsConfig = new Seats31();
        seatsConfig.setType("Bucket Leather");
        seatsConfig.setColor("Black");
        seatsConfig.setHeated(true);

        return seatsConfig;
    }

    @Bean(name = "seatOptionTwo")
    public Seats31 seatTwo(){

        Seats31 seatsConfig = new Seats31();
        seatsConfig.setType("Bucket Vinyl");
        seatsConfig.setColor("Beige");
        seatsConfig.setHeated(true);

        return seatsConfig;
    }

    @Bean(name = "seatOptionThree")
    public Seats31 seatThree(){

        Seats31 seatsConfig = new Seats31();
        seatsConfig.setType("Bucket Leather");
        seatsConfig.setColor("Brown");
        seatsConfig.setHeated(false);

        return seatsConfig;
    }

    @Bean(name = "seatOptionFour")
    public Seats31 seatFour(){

        Seats31 seatsConfig = new Seats31();
        seatsConfig.setType("Bucket Fabric");
        seatsConfig.setColor("Black");
        seatsConfig.setHeated(false);

        return seatsConfig;
    }

}
