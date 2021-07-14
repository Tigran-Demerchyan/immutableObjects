package com.immutable;

public class MyMain {
    public static void main(String[] args) {
        Engine engine = new Engine(177, 1200, 180000);
        Car car = new Car(2001, "W 203", "merrcedes", engine);
        engine.setHorsePower(200);
        System.out.println(engine.getHorsePower());
        System.out.println(car);
        System.out.println(car.getEngine().getHorsePower());
        engine.setHorsePower(12);
        System.out.println(car.getEngine().getHorsePower());


    }
}
