package com.skillsoft;

import org.springframework.stereotype.Component;

@Component
public class IOTDevice1 {

    String device = "IOTDevice";
    String description = "temperature sensor";

    public IOTDevice1() {
        System.out.println("object created sucussfully");
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "IOTDevice{" +
                "device='" + device + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}