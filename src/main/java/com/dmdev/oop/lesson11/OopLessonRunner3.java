package com.dmdev.oop.lesson11;

public class OopLessonRunner3 {

    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(125), new Ram(512));

        loadComputers(laptop, mobile);
        System.out.println();
        printInfo(new Computer[]{laptop, mobile});
    }

    public static void printInfo(Computer[] computers) {
        for (Computer computer : computers) {
            computer.print();
            System.out.println();
        }
    }

    public static void loadComputers(Computer... computers) {
        for (Computer computer : computers) {
            computer.load();
            System.out.println();
        }
    }
}
