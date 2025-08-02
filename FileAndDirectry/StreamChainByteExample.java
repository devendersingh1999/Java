package FileAndDirectry;

import java.io.*;
import java.nio.file.*;

public class StreamChainByteExample {
    public static void main(String[] args) throws IOException {

        // Correct relative directory path
        Path dirPath = Paths.get("./src/FileAndDirectry/aa");
        Files.createDirectories(dirPath);

        // Correct file path inside the directory
        Path filePath = dirPath.resolve("binary_output.dat");

        // Write binary data
        try (BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream(filePath.toFile()))) {

            byte[] data = {65, 66, 67, 68}; // ASCII for A, B, C, D
            bos.write(data);
            bos.flush();
        }

        // Read binary data
        try (BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(filePath.toFile()))) {

            int b;
            while ((b = bis.read()) != -1) {
                System.out.print((char) b); // Output: ABCD
            }
        }
    }
}
