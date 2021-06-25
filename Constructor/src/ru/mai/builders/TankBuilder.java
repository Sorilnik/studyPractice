package ru.mai.builders;

import ru.mai.tanks.Tank;
import ru.mai.tanks.TankType;
import ru.mai.components.Engine;
import ru.mai.components.MainGun;
import ru.mai.components.Transmission;
import ru.mai.components.NVD;

/**
 * Конкретные строители реализуют шаги, объявленные в общем интерфейсе.
 */
public class TankBuilder implements Builder {
    private TankType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private NVD NVD;
    private MainGun mainGun;

    public void setTankType(TankType type) {
        this.type = type;
    }

    @Override
    public void setCrew(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setNVD(NVD NVD) {
        this.NVD = NVD;
    }

    @Override
    public void setGun(MainGun mainGun) {
        this.mainGun = mainGun;
    }

    public Tank getResult() {
        return new Tank(type, seats, engine, transmission, NVD, mainGun);
    }
}
