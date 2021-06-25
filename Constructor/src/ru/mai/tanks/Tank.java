package ru.mai.tanks;

import ru.mai.components.Engine;
import ru.mai.components.MainGun;
import ru.mai.components.Transmission;
import ru.mai.components.NVD;

/**
 * Танк — это класс продукта.
 */
public class Tank {
    private final TankType tankType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final NVD NVD;
    private final MainGun mainGun;
    private double fuel = 0;

    public Tank(TankType tankType, int seats, Engine engine, Transmission transmission,
                NVD NVD, MainGun mainGun) {
        this.tankType = tankType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.NVD = NVD;
        this.mainGun = mainGun;
    }

    public TankType getTankType() {
        return tankType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public NVD getNVD() {
        return NVD;
    }

    public MainGun getGunCaliber() {
        return mainGun;
    }
}
