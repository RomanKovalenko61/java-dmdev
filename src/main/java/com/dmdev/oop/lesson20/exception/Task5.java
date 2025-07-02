package com.dmdev.oop.lesson20.exception;

public class Task5 {

    public static void main(String[] args) {
        try {
        catchCustomException();
        } catch (MyException e) {
            System.out.println("caught in main");
            e.printStackTrace();
        }
    }

    public static void catchCustomException() {
        try {
            unsafe();
        } catch (RuntimeException e) {
            System.out.println("Catch in catchCustomException method");
            throw new MyException(e);
        }
    }

    public static void unsafe() {
        throw new RuntimeException("runtime exception");
    }
}
