package com.dmdev.oop.lesson22;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class WriterRunner {

    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "writer.poem").toFile();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.append("Hello world!");
            writer.newLine();
            writer.append("Java");
        }
    }
}
