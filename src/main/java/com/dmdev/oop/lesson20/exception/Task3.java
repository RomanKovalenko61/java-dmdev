package com.dmdev.oop.lesson20.exception;

public class Task3 {

    public static void main(String[] args) {
        try {
            unsafe();
        } catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

    public static void unsafe() throws MyException {
        throw new MyException(new RuntimeException("runtime exception"));
    }
}
