package fReader;
import java.io.*;

public class fReader {
	public static void main(String[] args) throws IOException {
		try (FileReader fd = new FileReader("Martin.txt");){
			
			int data = fd.read();
			while (data != -1) {
				System.out.print((char)data);
				data = fd.read();
				
			}
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
