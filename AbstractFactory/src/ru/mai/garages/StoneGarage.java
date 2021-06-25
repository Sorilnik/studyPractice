package ru.mai.garages;

/**
 * Все семейства продуктов имеют одни и те же вариации (Каменные/Кирпичные).
 *
 * Это вариант каменного гаража.
 */
public class StoneGarage implements Garage {

    @Override
    public void paint() {
        System.out.println("Вы создали каменный гараж.");
    }
}
