import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;


public class outIn{
	
	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("MyFile.txt", true);
		BufferedWriter bf = new BufferedWriter(file);
		bf.write("Lime line");
		bf.newLine();
		bf.close();
		file.close();
	}

}
