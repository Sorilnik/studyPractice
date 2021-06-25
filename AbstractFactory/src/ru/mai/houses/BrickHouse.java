package ru.mai.houses;

/**
 * Все семейства продуктов имеют одинаковые вариации (Каменные/Кирпичные).
 *
 * Вариация кирпичного дома.
 */
public class BrickHouse implements House {

    @Override
    public void paint() {
        System.out.println("Вы создали кирпичный дом.");
    }
}
