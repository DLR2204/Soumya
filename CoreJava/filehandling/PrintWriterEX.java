package filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEX {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\May.txt");
		
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println(123);
		
		pw.println(true);
		
		pw.println("good \n morning");
		
		char[] ch = {'a','c','e'};
		
		pw.println(ch);
		
		System.out.println("data is written into the file successfully");
		
		pw.flush();
		
		pw.close();
		
		
	}

}
