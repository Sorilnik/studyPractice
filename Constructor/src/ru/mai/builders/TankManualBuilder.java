package ru.mai.builders;

import ru.mai.tanks.TankType;
import ru.mai.tanks.Characteristic;
import ru.mai.components.Engine;
import ru.mai.components.MainGun;
import ru.mai.components.Transmission;
import ru.mai.components.NVD;

/**
 * В отличие от других создающих паттернов, Строители могут создавать совершенно
 * разные продукты, не имеющие общего интерфейса.
 *
 * В данном случае мы производим листы ТТХ танка с помощью
 * тех же шагов, что и сами танки. Это устройство позволит создавать
 * листы ТТХ под конкретные модели танков, содержащие те или иные компоненты.
 */
public class TankManualBuilder implements Builder {
    private TankType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private NVD NVD;
    private MainGun mainGun;

    @Override
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

    public Characteristic getResult() {
        return new Characteristic(type, seats, engine, transmission, NVD, mainGun);
    }
}
