package Aug23;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling1 {
	
	private static BufferedReader b;

	public static void main(String[] args) throws IOException {
		File f= new File("../BasicProgram/FileTest.txt");
		FileReader fr = new FileReader(f); 
		b = new BufferedReader(fr);
		String s;
		while((s=b.readLine())!=null) {
			System.out.println(s); // explicit call
		}
	}
}
