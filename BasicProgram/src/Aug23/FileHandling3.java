package Aug23;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling3 {
	private BufferedReader bw;
	private static Scanner sc1;
	private static Scanner sc2;
	public void ReadDataofRange(int a, int b) throws IOException {
		File f= new File("../BasicProgram/FileTest.txt");
		FileReader fr =new FileReader(f);
		bw = new BufferedReader(fr);
		String s;
		int flag=0;
		while((s=bw.readLine())!=null ) {
			flag=flag+1;
			if(flag>=a && flag<=b) {
				System.out.println(s);
			}
		}
	}
public static void main(String[] args) throws IOException {
	System.out.println("Enter Initial row: ");
	sc1 = new Scanner(System.in);
	int x = sc1.nextInt();
	
	System.out.println("Enter End row: ");
	sc2 = new Scanner(System.in);
	int y = sc2.nextInt();
	
	FileHandling3 rd = new FileHandling3();
	rd.ReadDataofRange(x, y);
}
}
