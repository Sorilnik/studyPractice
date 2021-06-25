package ru.mai.director;

import ru.mai.builders.Builder;
import ru.mai.tanks.TankType;
import ru.mai.components.Engine;
import ru.mai.components.MainGun;
import ru.mai.components.Transmission;
import ru.mai.components.NVD;

/**
 * Директор знает в какой последовательности заставлять работать строителя. Он
 * работает с ним через общий интерфейс Строителя. Из-за этого, он может не
 * знать какой конкретно продукт сейчас строится.
 */
public class Director {

    public void constructMBT(Builder builder) {
        builder.setTankType(TankType.MAIN_BATTLE_TANK);
        builder.setCrew(3);
        builder.setEngine(new Engine(1000.0));
        builder.setTransmission(Transmission.DUAL_DRIVE);
        builder.setNVD(NVD.THERMAL_SECOND_GEN);
        builder.setGun(new MainGun(125));
    }

    public void constructMediumTank(Builder builder) {
        builder.setTankType(TankType.MEDIUM_TANK);
        builder.setCrew(5);
        builder.setEngine(new Engine(500));
        builder.setTransmission(Transmission.CLUTCH_BREAKING);
        builder.setGun(new MainGun(85));
    }

    public void constructLightTank(Builder builder) {
        builder.setTankType(TankType.LIGHT_TANK);
        builder.setCrew(3);
        builder.setEngine(new Engine(2.5));
        builder.setTransmission(Transmission.TWIN_TRANSMISSION);
        builder.setNVD(NVD.THERMAL_FIRST_GEN);
        builder.setGun(new MainGun(80));
    }
}
