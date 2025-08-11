package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class fi {
public static void main(String[] args) throws IOException {
	
Path dir = Paths.get("./src/test/filefolder");

Path file = dir.resolve("data.txt");


try(BufferedWriter write = Files.newBufferedWriter(file, StandardOpenOption.TRUNCATE_EXISTING)){
	
	write.write("hasdf");
}

try(BufferedReader read = Files.newBufferedReader(file)){
	
	String line;
	
	while((line = read.readLine()) != null) {
		System.out.println(line);
	}
}

Path des = dir.resolve("destination.txt");

Files.copy(file, des, StandardCopyOption.REPLACE_EXISTING);



}
}
