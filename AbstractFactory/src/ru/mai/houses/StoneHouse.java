package ru.mai.houses;

/**
 * Все семейства продуктов имеют одинаковые вариации (Каменные/Кирпичные).
 *
 * Вариация каменного дома.
 */
public class StoneHouse implements House {

    @Override
    public void paint() {
        System.out.println("Вы создали каменный дом.");
    }
}
