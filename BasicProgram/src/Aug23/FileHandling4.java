package Aug23;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling4 {

	public void WriteData(int rowcount) throws IOException {
		File f = new File("../BasicProgram/src/FileWrite.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		int i;
		for(i=1;i<=rowcount;i++) {
			bw.newLine();
			bw.write("Java Concepts are on track: " +i);
		}
		bw.close();
	}
	public static void main(String[] args) throws IOException {
		System.out.println("Enter a row counter for the file: ");
		Scanner sc1= new Scanner(System.in);
		int x = sc1.nextInt();
		
		FileHandling4 rc = new FileHandling4();
		rc.WriteData(x);
	}
}
