package FileAndDirectry;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class StreamChaining {
    public static void main(String[] args) throws IOException {

        // Ensure the directory exists
        Files.createDirectories(Path.of("./src/FileAndDirectry/aa"));

        // Write to file
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("./src/FileAndDirectry/aa/log.txt"), "UTF-8"))) {

            writer.write("hello this is today quote");
            writer.newLine();
            writer.write("this is next line");
            writer.newLine();
            writer.write("this is next line asdfs");

            System.out.println("Writing task completed.");
        }

        // Read from file
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("./src/FileAndDirectry/aa/log.txt"), "UTF-8"))) {

            String line;
            System.out.println("Reading from file:");
            while ((line = reader.readLine()) !=null) {
                System.out.println(line);
            }
        }
    }
}
