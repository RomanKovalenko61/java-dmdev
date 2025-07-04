package com.dmdev.oop.lesson20.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        new HashSet<String>();
        new LinkedHashSet<String>();

        Set<String> set = new TreeSet<>();
        System.out.println(set.add("aaa"));
        System.out.println(set.add("bbb"));
        System.out.println(set.add("ccc"));
        System.out.println(set.add("ddd"));
        System.out.println(set.add("bbb"));

        System.out.println(set);

        set.forEach(System.out::println);
    }
}
