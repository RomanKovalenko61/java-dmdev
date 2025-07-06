package com.dmdev.oop.lesson22.task;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task4 {

    public static void main(String[] args) throws URISyntaxException, IOException {
        Path path = Paths.get("src/main/java/com/dmdev/oop/lesson22/task/Task3.java");
        String string = Files.readString(path);

        String replaced = string.replaceAll("public", "private");

        Path resultPath = Path.of("resources", "Task3.java");
        Files.writeString(resultPath, replaced);
    }
}
