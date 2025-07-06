package com.dmdev.oop.lesson22;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

public class OutputRunner {

    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "output.txt").toFile();
        try (BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(file, true))) {
            String value = "Hello world!";
            fos.write(value.getBytes());
            fos.write(System.lineSeparator().getBytes());
        }
    }
}

