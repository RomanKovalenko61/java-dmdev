package com.dmdev.oop.lesson11;

public class OopLessonRunner4 {

    public static void main(String[] args) {
        Printable laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Printable mobile = new Mobile(new Ssd(125), new Ram(512));

        printWithRandom(laptop, mobile);
        System.out.println();
        System.out.println("Interface value " + Printable.SOME_VALUE);
    }

    public static void print(Printable... objects) {
        for (Printable object : objects) {
            object.print();
            System.out.println();
        }
    }

    public static void printWithRandom(Printable... objects) {
        for (Printable object : objects) {
            object.printWithRandom();
            System.out.println();
        }
    }
}
