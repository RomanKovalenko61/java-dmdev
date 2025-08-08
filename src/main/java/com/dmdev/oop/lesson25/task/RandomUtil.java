package com.dmdev.oop.lesson25.task;

import java.util.Random;

public final class RandomUtil {

    private static final int DEFAULT_BOUND = 10;
    private static final Random random = new Random();

    private RandomUtil() {
    }

    public static int getRandom() {
        return random.nextInt(DEFAULT_BOUND);
    }

    public static int getRandom(int bound) {
        return random.nextInt(bound);
    }
}
