package FileAndDirectry;



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
