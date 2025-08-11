
package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;

public class BUfferedExampleImportant {
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

        // ✅ Write to file using BufferedWriter (line-by-line writing)
        try (BufferedWriter writer = Files.newBufferedWriter(file, StandardOpenOption.TRUNCATE_EXISTING)) {
            writer.write("hello");
            writer.newLine();
            writer.write("world");
            writer.newLine();
            writer.write("safiikajsdfh");
        }

        // ✅ Read from file using BufferedReader (line-by-line reading)
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            System.out.println("Reading from file:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }

        // ✅ Copy file to another location
        Path destination = dir.resolve("destination.txt");
        Files.copy(file, destination, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File copied to: " + destination);
    }
}























