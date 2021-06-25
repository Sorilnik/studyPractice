package ru.mai.document;

/**
 * Общий интерфейс для всех продуктов.
 */
public interface Document {
    void open();
    void close();
    void save();
    void revert();
}