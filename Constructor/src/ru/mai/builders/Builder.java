package ru.mai.builders;

import ru.mai.tanks.TankType;
import ru.mai.components.Engine;
import ru.mai.components.MainGun;
import ru.mai.components.Transmission;
import ru.mai.components.NVD;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации продукта.
 */
public interface Builder {
    void setTankType(TankType type);
    void setCrew(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setNVD(NVD NVD);
    void setGun(MainGun mainGun);
}
