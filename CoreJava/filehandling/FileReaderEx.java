package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderEx {
	
	public static void main(String[] args) throws IOException {
	
		FileReader fr = new FileReader("C:\\Users\\PRADEEP GOUD\\Desktop\\May.txt");
	
		int i = fr.read();
		
		while(i !=-1 ) {
			
			i = fr.read();
			
			System.out.println((char)i);
			
		}
		
		System.out.println("file is read successfully");
		
		
	}
	//-1   -----> end of the file

}
