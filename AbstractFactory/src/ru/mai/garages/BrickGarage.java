package ru.mai.garages;

/**
 * Все семейства продуктов имеют одни и те же вариации (Каменные/Кирпичные).
 *
 * Это вариант кирпичного гаража.
 */
public class BrickGarage implements Garage {

    @Override
    public void paint() {
        System.out.println("Вы создали кирпичный гараж.");
    }
}
