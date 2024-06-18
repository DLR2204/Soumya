package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter file = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\May.txt");
		
		BufferedWriter bw = new BufferedWriter(file);
		
		bw.write(124);
	
		
		bw.newLine();
		
		bw.write("good /n morning");
		
		bw.newLine();
		
		bw.write('c');
		
		char []ch = {'a','c','d'};
		
		bw.write(ch);
		
		System.out.println("data is written into the file successfully");
		
		bw.flush();
		
		bw.close();
		
		// it's not accepting numerical values,boolean
	}

}
