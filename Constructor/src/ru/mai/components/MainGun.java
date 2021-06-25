package ru.mai.components;

/**
 * Один из компонентов танка.
 */
public class MainGun {
    private int caliber;

    public MainGun(int caliber) {
        this.caliber = caliber;
    }

    public int getCaliber() {
        return caliber;
    }
}
