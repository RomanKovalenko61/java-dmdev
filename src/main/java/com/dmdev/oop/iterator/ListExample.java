package com.dmdev.oop.iterator;

import com.dmdev.oop.lesson18.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> list = new List<>(10);
        list.add("string1");
        list.add("string2");
        list.add("string3");
        list.add("string4");

        for (var iter = list.iterator(); iter.hasNext(); ) {
            var current = iter.next();
            if (current.equals("string1") || current.equals("string2")) {
                iter.remove();
            }
        }

        for (var iter = list.iterator(); iter.hasNext(); ) {
            var current = iter.next();
            System.out.println(current);
        }
    }
}
