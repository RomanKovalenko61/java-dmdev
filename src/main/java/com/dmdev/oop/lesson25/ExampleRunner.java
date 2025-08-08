package com.dmdev.oop.lesson25;

import java.util.ArrayList;

public class ExampleRunner {

    public static void main(String[] args) {
        var example = new Example(new ArrayList<>());
        var list = example.getList();
        list.add(2);

        System.out.println(example.getList());
    }
}
