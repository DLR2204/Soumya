package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {
	
	public static void main(String[] args) throws IOException {
		
		Employee emp = new Employee("soumya",100,83465834,"uk");
		
		FileOutputStream fo = new FileOutputStream("C:\\Users\\PRADEEP GOUD\\Desktop\\SOUMYA.txt");
		
		ObjectOutputStream obj = new ObjectOutputStream(fo);
		
		obj.writeObject(emp);
		
		obj.flush();
		
		System.out.println("written into the file successfully");
		
		
	}

}
