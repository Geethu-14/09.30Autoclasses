package Aug23;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling2 {
	private BufferedReader b;
	private static Scanner sc;
	public void Reader(int row) throws IOException {
		File f =new File("../BasicProgram/FileTest.txt");
		FileReader fw=new FileReader(f);
		b = new BufferedReader(fw);
		String s;
		int count =0;
		while((s=b.readLine())!=null) {
			count = count+1;
			if (count==row) {
			System.out.println(s); // explicit call
			break;
			}
		}
	}	
	public static void main(String[] args) throws IOException {
		FileHandling2 rd = new FileHandling2();
		System.out.println("Enter the row number");
		sc = new Scanner(System.in);
		int row=sc.nextInt();
		rd.Reader(row);
	}
}
