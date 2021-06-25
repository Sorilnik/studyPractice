package ru.mai.factories;

import ru.mai.houses.House;
import ru.mai.houses.StoneHouse;
import ru.mai.garages.Garage;
import ru.mai.garages.StoneGarage;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class StoneFactory implements BuildingFactory {

    @Override
    public Garage createGarage() {
        return new StoneGarage();
    }

    @Override
    public House createHouse() {
        return new StoneHouse();
    }
}
