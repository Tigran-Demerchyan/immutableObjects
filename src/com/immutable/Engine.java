package com.immutable;

public class Engine {
    private int horsePower;
    private int weight;
    private int mileage;


    public Engine() {
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", weight=" + weight +
                ", mileage=" + mileage +
                '}';
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Engine copy() {
        Engine engine = new Engine();

        engine.setHorsePower(this.getHorsePower());
        engine.setMileage(this.getMileage());
        engine.setWeight(this.getWeight());

        return engine;
    }
}
