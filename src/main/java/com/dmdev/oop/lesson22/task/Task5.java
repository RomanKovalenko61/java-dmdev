package com.dmdev.oop.lesson22.task;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class Task5 {

    public static void main(String[] args) {
        Path path = Paths.get("src/main/java/com/dmdev/oop/lesson22/task/Task4.java");
        Path result = Path.of("resources", "Task4.java");

        try (Stream<String> lines = Files.lines(path);
             BufferedWriter writer = Files.newBufferedWriter(result, APPEND, CREATE)) {
            lines.map(StringBuilder::new)
                    .map(StringBuilder::reverse)
                    .forEach(line -> {
                        try {
                            writer.write(line.toString());
                            writer.newLine();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
