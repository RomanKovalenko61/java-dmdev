package com.dmdev.oop.lesson10;

/*
 *  Написать функцию, принимающую в качестве параметров имя, фамилию и отчество
 * и возвращающую инициалы в формате "Ф.И.О". Учесть,что входные параметры могут быть
 * в любом регистре, а результирующая строка должна быть в верхнем
 * */

public class Task3 {

    public static void main(String[] args) {
        String result = format("ivan", "petrov", "Sidorovich");
        System.out.println(result);
    }

    public static String format(String firstname, String lastname, String patronymicName) {
        var firstNameChar = Character.toUpperCase(firstname.charAt(0));
        var LastNameChar = Character.toUpperCase(lastname.charAt(0));
        var patronymicNameChar = Character.toUpperCase(patronymicName.charAt(0));

        return String.format("%s.%s.%s", firstNameChar, LastNameChar, patronymicNameChar);
    }
}
