package com.dmdev.lesson2;

public class Computer {

    int ssd = 500;
    long ram;

    Computer() {
        System.out.println("Я был создан");
    }

    Computer(int newSsd) {
        ssd = newSsd;
        ram = 999;
    }

    Computer(int ssd, long newRam) {
        this.ssd = ssd;
        ram = newRam;
    }

    Computer(long newRam, int ssd) {
        this.ssd = ssd;
        ram = newRam;
    }

    void load() {
        System.out.println("Я загрузился");
    }

    void load(boolean open) {
        System.out.println("Я загрузился");
        if (open) {
            System.out.println("Я открыл крышку");
        }
    }

    void printState() {
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("RAM: " + ram + " MB");
        System.out.println();
    }
}
