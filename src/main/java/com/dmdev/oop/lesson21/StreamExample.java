package com.dmdev.oop.lesson21;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        List<String> strings = List.of("88", "11", "22", "33", "44", "55", "66");

        var intSummaryStatistics = strings.stream()
                .map(string -> string + string)
                .map(Integer::valueOf)
                .filter(value -> value % 2 == 0)
                .sorted()
//                .skip(1)
                .limit(2)
                .mapToInt(Integer::intValue) // convert to int
//                .mapToObj(Integer::valueOf)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);

        List<String> list = Stream.of("88", "11", "22", "33", "44", "55", "66")
                .peek(System.out::println)
                .collect(Collectors.toList());

        var sum = IntStream.of(1, 4, 5, 6).sum();
        System.out.println(sum);

        IntStream.range(0, 10).forEach(System.out::println); // 0...9
        IntStream.rangeClosed(0, 10).forEach(System.out::println); // 0 ... 10

        IntStream.iterate(0, i -> i + 3).skip(10).limit(10).forEach(System.out::println);

//        for (String string : strings) {
//            String value = string + string;
//            Integer intValue = Integer.valueOf(value);
//            if (intValue % 2 == 0) {
//                System.out.println(intValue);
//            }
//        }
    }
}
