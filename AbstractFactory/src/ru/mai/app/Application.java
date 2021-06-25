package ru.mai.app;

import ru.mai.houses.House;
import ru.mai.factories.BuildingFactory;
import ru.mai.garages.Garage;

/**
 * Код, использующий фабрику, не волнует с какой конкретно фабрикой он работает.
 * Все получатели продуктов работают с продуктами через абстрактный интерфейс.
 */
public class Application {
    private Garage garage;
    private House house;

    public Application(BuildingFactory factory) {
        garage = factory.createGarage();
        house = factory.createHouse();
    }

    public void paint() {
        garage.paint();
        house.paint();
    }
}
