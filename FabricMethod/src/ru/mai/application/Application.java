package ru.mai.application;

import ru.mai.document.Document;

/**
 * Базовый класс фабрики.
 */
public abstract class Application {

    public void beginWorking() {
        Document document = createDocument();
    }
    /**
     * Подклассы будут переопределять следующие методы, чтобы создавать конкретные
     * объекты продуктов, разные для каждой фабрики.
     */
    public abstract Document createDocument();

    public abstract void newDocument();

    public abstract void openDocument();
}