package Aug23;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling5 {
	
	private static Scanner sc1;
	public void WritewithRange(int initialrowCount, int endrowCount) throws IOException {
		File f =new File("../BasicProgram/src/FileWrite.txt");
		FileWriter fw =new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		int i;
		for(i=1;i<=endrowCount;i++) {
			if(i>=initialrowCount && i<=endrowCount) {
			bw.write("File is adding data: " +i);
			bw.newLine();
			}
			else
			{
				bw.newLine();
			}
		}
		bw.close();
	}
	public static void main(String[] args) throws IOException {
		System.out.println("Enter Initial row: ");
		sc1 = new Scanner(System.in);
		int x = sc1.nextInt();
		
		System.out.println("Enter End row: ");
		Scanner sc2= new Scanner(System.in);
		int y = sc2.nextInt();
		
		FileHandling5 rc = new FileHandling5();
		rc.WritewithRange(x, y);
	}

}
