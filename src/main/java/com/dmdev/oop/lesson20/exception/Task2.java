package com.dmdev.oop.lesson20.exception;

public class Task2 {

    public static void main(String[] args) {
        //              0  1  2  3  4
        int[] values = {1, 4, 6, 7, 8};
        try {
            for (int i = 0; i <= values.length; i++) {
                System.out.println(values[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Catch");
            e.printStackTrace();
        }
        System.err.println("end");
    }
}
