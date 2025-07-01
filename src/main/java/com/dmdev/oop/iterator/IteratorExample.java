package com.dmdev.oop.iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        var sourceList = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> list = new ArrayList<>(sourceList);

//        for (int i = 0; i < list.size(); i++) {
//            Integer integer = list.get(i);
//            System.out.println(integer);
//        }

//        for (Integer integer : list) {
//            System.out.println(integer);
//        }

//        var iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            System.out.println(next);
//        }

        for (var iterator = list.iterator(); iterator.hasNext(); ) {
            var next = iterator.next();
            if (next == 3 || next == 4) {
                iterator.remove();
            }
        }

        System.out.println(list);
    }
}
