package Aug23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling6 {
	private static BufferedReader br;

	public static void main(String[] args) throws IOException {
		File fr = new File("../BasicProgram/FileTest.txt");
		FileReader freader= new FileReader(fr);
		br = new BufferedReader(freader);
		File fw =new File("../BasicProgram/src/FileWrite.txt");
		FileWriter fwriter =new FileWriter(fw);
		BufferedWriter bw=new BufferedWriter(fwriter);
		String s; 
			while((s=br.readLine())!=null) {
			System.out.println(s);
			bw.write(s);
			bw.newLine();
			}
			bw.close();
		}
}

