import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandle {
	
	
	
	public static void main(String[] args) throws IOException {

		File file = new File("/Users/selim.olmaz/Desktop/FileREader1.txt");
		
		Scanner sc = new Scanner(file);
		
		String fileContent = "This is a new file we had written in java.\n";
		
		
		while (sc.hasNextLine()) {
			//System.out.println(sc.nextLine());
			fileContent = fileContent.concat(sc.nextLine() + "\n");
		}
		
		FileWriter writer= new FileWriter("/Users/selim.olmaz/Desktop/FileWriter.txt");
		writer.write(fileContent);
		writer.close(); 
		
		
		
		
		System.err.println("\n");

		
	}
	

}
