package com.dmdev.lesson2;

public class Computer {

    int ssd = 500;
    int ram = 1024;

    void load() {
        System.out.println("Я загрузился");
    }

    void printState() {
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("RAM: " + ram + " MB");
    }
}
