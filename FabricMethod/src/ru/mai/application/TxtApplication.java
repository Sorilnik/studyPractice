package ru.mai.application;

import ru.mai.document.Document;
import ru.mai.document.TxtDocument;

/**
 * Класс-фабрика документа .txt
 */
public class TxtApplication extends Application {

    private static TxtDocument document;

    @Override
    public Document createDocument() {
        System.out.println("Документ формата .txt был создан.");
        return null;
    }

    /**
     * Код создания новго документа .txt
     */
    @Override
    public void newDocument() {
    }

    public void openDocument() {
        document.open();
    }
}