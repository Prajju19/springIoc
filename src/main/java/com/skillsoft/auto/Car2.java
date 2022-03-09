package com.skillsoft.auto;

public class Car2 {

    String type;
    String model;
    double price;
    int combinedFuelEconomy;
    Engine2 engine;


    public Car2(String type, String model, double price, int combinedFuelEconomy, Engine2 engine) {
        this.type = type;
        this.model = model;
        this.price = price;
        this.combinedFuelEconomy = combinedFuelEconomy;
        this.engine = engine;

    }


    @Override
    public String toString() {
        return "Car Type = " + type +
                ", Model = " + model +
                ",\nPrice = " + price +
                ",\nCombinedFuelEconomy(City & Highway) = " + combinedFuelEconomy + "mpg" +
                ",\n" + engine + ",\n" ;
    }
}
