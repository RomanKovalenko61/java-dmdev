package com.dmdev.oop.lesson11;

public abstract class Computer implements Printable {

    private Ssd ssd;
    private Ram ram;

//    {
//        System.out.println("Init block computer");
//    }
//
//    static {
//        System.out.println("Static block computer");
//    }

    public Computer(Ssd ssd, Ram ram) {
        super();
        this.ssd = ssd;
        this.ram = ram;
    }

    public Computer() {
        System.out.println("Constructor computer");
    }

//    public void load() {
//        System.out.println("Я загрузился");
//    }

    public abstract void load();

    @Override
    public void print() {
        System.out.println("Ssd " + ssd.getValue() + " , Ram " + ram.getValue());
    }

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }
}
