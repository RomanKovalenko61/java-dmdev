package com.dmdev.oop.lesson10;

/*
 * Подсчитать количество точек, запятых и восклицательных знаков в строке.
 * */

public class Task4 {

    public static void main(String[] args) {
        String value = "asdfasdasd.,!sdfdsf.,?asd!sadsfsd";
        System.out.println(countSymbols(value));
    }

    public static int countSymbols(String value) {
        String result = value.replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return value.length() - result.length();
    }
}
