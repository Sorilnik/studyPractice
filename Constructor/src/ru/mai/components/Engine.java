package ru.mai.components;

/**
 * Один из компонентов танка
 */
public class Engine {
    private final double horsePower;
    private double mileage;
    private boolean started;

    public Engine(double horsePower) {
        this.horsePower = horsePower;
    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Не может ехать, необходимо завести двигатель.");
        }
    }

    public double getHorsePower() {
        return horsePower;
    }

    public double getMileage() {
        return mileage;
    }
}
