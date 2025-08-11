package test;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class CopyDataTOFile {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("./src/test/filefolder");

        // Create directory if it doesn't exist
        
        if (Files.notExists(dir)) {
            Files.createDirectories(dir);
            System.out.println("Directory created");
        }

        Path file = dir.resolve("data.txt");

        // Create file if it doesn't exist
        if (Files.notExists(file)) {
            Files.createFile(file);
            System.out.println("File created");
        }

        // ✅ Write to file using Files.write (replaces BufferedWriter)
        Files.write(file, List.of("hello", "world", "safiikajsdfh"), StandardOpenOption.TRUNCATE_EXISTING);

        // ✅ Read from file using Files.readAllLines (replaces BufferedReader)
        List<String> lines = Files.readAllLines(file);
        lines.forEach(System.out::println);

        // ✅ Copy file using Files.copy
        Path destination = dir.resolve("destination.txt");
        Files.copy(file, destination, StandardCopyOption.REPLACE_EXISTING);

        System.out.println("File copied to: " + destination);
    }
}
