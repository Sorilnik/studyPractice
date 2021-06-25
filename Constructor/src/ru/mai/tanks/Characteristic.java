package ru.mai.tanks;

import ru.mai.components.Engine;
import ru.mai.components.MainGun;
import ru.mai.components.Transmission;
import ru.mai.components.NVD;

/**
 * Лист ТТХ танка — это второй продукт. Заметьте, что лист ТТХ и сам
 * танк не имеют общего родительского класса. По сути, они независимы.
 */
public class Characteristic {
    private final TankType tankType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final NVD NVD;
    private final MainGun mainGun;

    public Characteristic(TankType tankType, int seats, Engine engine, Transmission transmission,
                          NVD NVD, MainGun mainGun) {
        this.tankType = tankType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.NVD = NVD;
        this.mainGun = mainGun;
    }

    public String print() {
        String info = "";
        info += "Тип Танка: " + tankType + "\n";
        info += "Размер экипажа: " + seats + "\n";
        info += "Характеристика двигателя в лошадиных силах: " + engine.getHorsePower() + "\n";
        info += "Трансмиссия: " + transmission + "\n";
        if (this.NVD != null) {
            info += "Прибор ночного видения: " + NVD + "\n";
        } else {
            info += "Прибор ночного видения: остутсвует" + "\n";
        }
        info += "Калибр основного орудия: " + mainGun.getCaliber() + " mm" + "\n";
        return info;
    }
}
