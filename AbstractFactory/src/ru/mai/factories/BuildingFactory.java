package ru.mai.factories;

import ru.mai.houses.House;
import ru.mai.garages.Garage;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface BuildingFactory {
    Garage createGarage();
    House createHouse();
}
