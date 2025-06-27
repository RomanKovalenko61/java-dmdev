package com.dmdev.oop.lesson10;

/*
 *  1. Заменить все грустные смайлы :( на веселые :)
 */


public class Task1 {

    public static void main(String[] args) {
        String value = "dfasdfas :( sdfsdf :( sgsdfgh :) fgfdg :) asda :( dfsdfsdf";
        String result = replace(value);
        System.out.println(result);
    }

    public static String replace(String value) {
        return value.replace(":(", ":)");
    }
}
