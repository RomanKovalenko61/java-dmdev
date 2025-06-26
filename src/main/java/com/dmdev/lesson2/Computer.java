package com.dmdev.lesson2;

public class Computer {

    int ssd = 500;
    int ram;

    Computer() {
        System.out.println("Я был создан");
    }

    Computer(int newSsd) {
        ssd = newSsd;
        ram = 999;
    }

    Computer(int ssd, int newRam) {
        this.ssd = ssd;
        ram = newRam;
    }

    void load() {
        System.out.println("Я загрузился");
    }

    void printState() {
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("RAM: " + ram + " MB");
        System.out.println();
    }
}
