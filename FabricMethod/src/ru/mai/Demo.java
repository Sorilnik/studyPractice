package ru.mai;

import ru.mai.application.Application;
import ru.mai.application.TxtApplication;
import ru.mai.application.DocxApplication;

import java.util.Scanner;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {
    private static Application application;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * Приложение создаёт определённую фабрику в зависимости от конфигурации или
     * окружения.
     */
    static void configure() {
        Scanner in = new Scanner(System.in);
        String type;
        System.out.println("Введите формат документа, с которым хотите работать (1 - .docx, 2 - .txt): ");
        boolean created = false;
        do {
            type = in.nextLine();
            switch (type) {
                case ("1"):
                    application = new DocxApplication();
                    created = true;
                    break;
                case ("2"):
                    application = new TxtApplication();
                    created = true;
                    break;
                default:
                    System.out.println("Ошибка ввода, повтортие выбор (1 - .docx, 2 - .txt): ");
                    break;
            }
        } while (!created);
        runBusinessLogic();
    }

    /**
     * Весь остальной клиентский код работает с фабрикой и продуктами только
     * через общий интерфейс, поэтому для него неважно какая фабрика была
     * создана.
     */
    static void runBusinessLogic() {
        application.beginWorking();
    }
}