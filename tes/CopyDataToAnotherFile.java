package tes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyDataToAnotherFile {
public static void main(String[] args) throws IOException {
	
	Path dir = Paths.get("./src/tes");
	Path file = dir.resolve("data.txt");
	
	BufferedWriter writer = new BufferedWriter(new FileWriter(file.toFile()));
	
	writer.write("hello");
	writer.newLine();
	writer.write("This is new line");
	writer.flush();
	BufferedReader read=new BufferedReader(new FileReader(file.toFile()));
	
	String line;
	
	while((line = read.readLine()) != null) {
		
		System.out.println(line);
	}
	
	
	//coping data to another file

	
	 Path di = Paths.get("./src/tes/copy");
     if (!Files.exists(di)) {
         Files.createDirectories(di);  // Create directory if it doesn't exist
     }

     Path destination = di.resolve("copysOfDat.txt");
     Path source = file;

     Files.copy(source, destination,StandardCopyOption.REPLACE_EXISTING);
     System.out.println("File copied successfully to: " + destination);
 
}
}

























