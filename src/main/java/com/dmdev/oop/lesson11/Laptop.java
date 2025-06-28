package com.dmdev.oop.lesson11;

public class Laptop extends Computer {

    private final int weight;

    public Laptop(Ssd ssd, Ram ram, int weight) {
        this.weight = weight;
    }

    public void open() {
        System.out.println("Открыл крышку");
    }

    public int getWeight() {
        return weight;
    }
}
