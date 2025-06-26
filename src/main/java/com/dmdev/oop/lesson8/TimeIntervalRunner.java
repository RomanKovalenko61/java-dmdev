package com.dmdev.oop.lesson8;

public class TimeIntervalRunner {

    public static void main(String[] args) {
        var timeInterval = new TimeInterval(30, 2, 1);
        System.out.println("Total seconds: " + timeInterval.totalSeconds());

        var timeInterval2 = new TimeInterval(timeInterval.totalSeconds());
        System.out.println(timeInterval2.totalSeconds());
        timeInterval2.print();

        var sumIntervals = timeInterval.sum(timeInterval2);
        sumIntervals.print();
    }
}
