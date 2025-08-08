package com.dmdev.oop.lesson25;

import java.util.ArrayList;
import java.util.List;

public class Example {

    private final List<Integer> list;

    public Example(List<Integer> list) {
        //this.list = List.copyOf(list);
        this.list = list;
    }

    public synchronized List<Integer> getList() {
        return new ArrayList<>(list);
    }
}
