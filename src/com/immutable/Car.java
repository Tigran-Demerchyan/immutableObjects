package com.immutable;

public final class Car {
    private final int productionYear;
    private final String model;
    private final String mark;
    private final Engine engine;

    public Car(int productionYear, String model, String mark, Engine newEng) {
        this.productionYear = productionYear;
        this.model = model;
        this.mark = mark;
        this.engine = new Engine(newEng.getHorsePower(), newEng.getWeight(), newEng.getMileage());
    }

    @Override
    public String toString() {
        return "Car{" +
                "productionYear=" + productionYear +
                ", model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", engine=" + engine +
                '}';
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public Engine getEngine() {
        return new Engine(this.engine.getHorsePower(), this.engine.getWeight(), this.engine.getMileage());
    }
}
