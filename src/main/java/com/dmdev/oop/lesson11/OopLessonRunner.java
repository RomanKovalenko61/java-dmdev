package com.dmdev.oop.lesson11;

public class OopLessonRunner {

    public static void main(String[] args) {
        var ram = new Ram(1024);
        var ssd = new Ssd(500);
        Computer computer = new Computer(ssd, ram);
        computer.load();

        Laptop laptop = new Laptop(new Ssd(250), new Ram(512), 2);
        laptop.open();
        laptop.load();
        Class<? extends Laptop> aClass = laptop.getClass();
        System.out.println(aClass);
        System.out.println(laptop);
    }
}
