package ru.mai.factories;

import ru.mai.garages.Garage;
import ru.mai.houses.House;
import ru.mai.houses.BrickHouse;
import ru.mai.garages.BrickGarage;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class BrickFactory implements BuildingFactory {

    @Override
    public Garage createGarage() {
        return new BrickGarage();
    }

    @Override
    public House createHouse() {
        return new BrickHouse();
    }
}
