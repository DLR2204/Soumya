package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\May.txt");

		fw.write("good \n morning");

		fw.write(97);

		fw.write('c');

		char[] ch = { 'a', 'b', 'c', 'd' };

		fw.write(ch);

		System.out.println("data is written into the file successfully \n in the existing file");

		fw.flush();

		fw.close();

		// it's not accepting \n new line

		// it's not accepting numerical values
	}

}
