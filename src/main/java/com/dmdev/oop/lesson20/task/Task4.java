package com.dmdev.oop.lesson20.task;

import java.util.*;

public class Task4 {

    public static void main(String[] args) {
        Map<Integer, Integer> polynomial1 = Map.of(
                0, 5,
                1, 3,
                3, 2,
                5, 4,
                6, 7
        );

        Map<Integer, Integer> polynomial2 = Map.of(
                0, 5,
                3, 4,
                5, 5,
                6, 1
        );

        Map<Integer, Integer> sum = sum(polynomial1, polynomial2);
        // 8x^6 + 9x^5 + 6x^3 + 3x^1 + 10
        System.out.println(convert(sum));
    }

    public static Map<Integer, Integer> sum(Map<Integer, Integer> polynomial1,
                                            Map<Integer, Integer> polynomial2) {
        Map<Integer, Integer> result = new HashMap<>(polynomial1);
        for (Map.Entry<Integer, Integer> entry : polynomial2.entrySet()) {
            Integer value = polynomial1.getOrDefault(entry.getKey(), 0);
            result.put(entry.getKey(), value + entry.getValue());
            //result.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return result;
    }

    public static String convert(Map<Integer, Integer> polynomial) {
        Map<Integer, Integer> result = new TreeMap<>(Comparator.reverseOrder());
        result.putAll(polynomial);
        List<String> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            String value = entry.getKey() == 0
                    ? String.valueOf(entry.getValue())
                    : entry.getValue() + "x^" + entry.getKey();
            list.add(value);
        }
        return String.join(" + ", list);
    }
}
