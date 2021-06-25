package ru.mai;

import ru.mai.app.Application;
import ru.mai.factories.BuildingFactory;
import ru.mai.factories.StoneFactory;
import ru.mai.factories.BrickFactory;

import java.util.Scanner;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {

    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
     * из конфигурации или окружения.
     */
    private static Application configureApplication() {
        Application app = null;
        BuildingFactory factory;
        Scanner in = new Scanner(System.in);
        String type;
        System.out.println("Введите желаемый тип построек (1 - Каменный, 2 - Кирпичный): ");
        boolean created = false;
        do {
            type = in.nextLine();
            switch (type) {
                case ("1"):
                    factory = new StoneFactory();
                    app = new Application(factory);
                    created = true;
                    break;
                case ("2"):
                    factory = new BrickFactory();
                    app = new Application(factory);
                    created = true;
                    break;
                default:
                    System.out.println("Ошибка ввода, повтортие выбор (1 - Каменный, 2 - Кирпичный): ");
                    break;
            }
        } while (!created);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
