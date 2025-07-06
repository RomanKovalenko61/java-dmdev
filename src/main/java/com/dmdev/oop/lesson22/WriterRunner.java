package com.dmdev.oop.lesson22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriterRunner {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "writer2.poem");
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {

        Files.write(path, List.of("Hello world!", "Java"));

//        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
//            writer.append("Hello world!");
//            writer.newLine();
//            writer.append("Java");
//        }
    }
}
