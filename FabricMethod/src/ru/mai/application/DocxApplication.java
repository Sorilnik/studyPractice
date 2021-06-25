package ru.mai.application;

import ru.mai.document.Document;
import ru.mai.document.DocxDocument;

/**
 * Класс-фабирка документа .docx
 */
public class DocxApplication extends Application {

    private static DocxDocument document;

    @Override
    public Document createDocument() {
        System.out.println("Документ формата .docx был создан.");
        return null;
    }

    @Override
    public void newDocument() {
    }

    @Override
    public void openDocument() {
        document.open();
    }
}