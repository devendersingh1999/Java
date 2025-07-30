package FileAndDirectry;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileExample {
    public static void main(String[] args) {
        // Define directory and file paths using modern Path API
        Path dirPath = Paths.get("data", "logs");                  // OS-independent path
        Path filePath = dirPath.resolve("log.txt");                // Full path to the file

        try {
            // Create directories if they don't exist
            Files.createDirectories(dirPath);

            // Write to file (overwrites existing content)
            Files.writeString(filePath, "Hello, modern Java file!\n", 
                              StandardOpenOption.CREATE, 
                              StandardOpenOption.TRUNCATE_EXISTING,
                              StandardOpenOption.WRITE);

            // Append more content
            Files.writeString(filePath, "Appending this line...\n", 
                              StandardOpenOption.APPEND);

            // Read all lines back (if needed)
            List<String> lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
            System.out.println("📄 File Content:");
            lines.forEach(System.out::println);

            // Show full file path
            System.out.println("✅ Written to: " + filePath.toAbsolutePath());

        } catch (IOException e) {
            System.err.println("❌ File operation failed: " + e.getMessage());
        }
    }
}



import java.nio.file.*;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        Path dirPath = Paths.get("data", "logs");  // OS-independent path
        Files.createDirectories(dirPath);          // Creates directory if not exists

        Path filePath = dirPath.resolve("log.txt"); // Create file path under directory

        Files.writeString(filePath, "Hello, log file!", StandardOpenOption.CREATE);
        System.out.println("Written to: " + filePath.toAbsolutePath());
    }
}
