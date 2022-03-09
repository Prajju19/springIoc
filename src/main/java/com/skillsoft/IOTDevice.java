package com.skillsoft;

import org.springframework.stereotype.Component;

@Component
public class IOTDevice {

    String device="IOTDevice" ;
    String description="temperature sensor" ;
    public IOTDevice(){
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
    public void initBean() throws Exception {
        System.out.println("IOTDevice bean has been instantiated. Inside the initBean() method.");
    }

    public void destroyBean() throws Exception {
        System.out.println("IOTDevice bean has been destroyed. Inside the destroyBean() method.");
    }


}
